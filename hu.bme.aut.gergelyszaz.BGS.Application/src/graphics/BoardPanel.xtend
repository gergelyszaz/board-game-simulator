package graphics

import com.google.gson.Gson
import hu.bme.aut.gergelyszaz.BGS.client.BGSClient
import hu.bme.aut.gergelyszaz.BGS.client.IMessageReciever
import hu.bme.aut.gergelyszaz.BGS.state.FieldState
import hu.bme.aut.gergelyszaz.BGS.state.GameState
import hu.bme.aut.gergelyszaz.BGS.state.TokenState
import java.awt.Graphics
import java.awt.Graphics2D
import java.awt.Rectangle
import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import java.awt.geom.Line2D
import java.util.ArrayList
import java.util.HashSet
import java.util.Hashtable
import java.util.Stack
import java.util.concurrent.ConcurrentHashMap
import javax.swing.JButton
import javax.swing.JLabel
import javax.swing.JLayeredPane
import org.json.JSONObject

class BoardPanel extends JLayeredPane implements ActionListener, IMessageReciever {
	val states = new Stack<GameState>
	val buttons = new ConcurrentHashMap<Integer, JButton>
	val buttons2 = new ConcurrentHashMap<JButton, Integer>
	val enabledButtons = new HashSet<JButton>
	var SCALE = 100
	var minX = Integer.MAX_VALUE
	var maxX = Integer.MIN_VALUE
	var minY = Integer.MAX_VALUE
	var maxY = Integer.MIN_VALUE
	val tokens = new Hashtable<Integer, TokenState>
	val fields = new Hashtable<Integer, FieldState>
	val colorManager=new ColorManager() 
	private JLabel turncountLabel=new JLabel("");

	new() {
		super()
		states.add(new GameState("", 0, 0, "", new ArrayList, new ArrayList, new ArrayList, new ArrayList))
		add(turncountLabel)
		turncountLabel.bounds=new Rectangle(0,0,100,100)
	}

	BGSClient client;

	def SetClient(BGSClient c) {
		client = c
	}

	def AddGameState(GameState gs) {
		states.push(gs)
		
		turncountLabel.text="Turn: "+gs.turncount

		if (buttons.empty) {
			for (field : states.peek.fields) {

				var btn = new JButton
				buttons.put(field.id, btn)
				buttons2.put(btn, field.id)
				btn.UI = new FieldButtonUI(field)
				btn.opaque = false
				btn.contentAreaFilled = false
				btn.borderPainted = true
				btn.bounds = new Rectangle(field.x * SCALE - SCALE / 3, field.y * SCALE - SCALE / 3, SCALE * 2 / 3,
					SCALE * 2 / 3)
				btn.actionCommand = "fieldPressed"
				btn.addActionListener(this)
				btn.enabled = false
				add(btn, new Integer(1))

			}
		}

		val original = new HashSet
		original.addAll(tokens.keySet)
		val destroyed = new HashSet
		destroyed.addAll(tokens.keySet)
		val newtokens = new HashSet
		for (t : gs.tokens) {
			tokens.put(t.id, t)
			newtokens.add(t.id)
		}

		destroyed.removeAll(newtokens)
		newtokens.removeAll(original)

		for (d : destroyed) {
			remove(buttons.get(d))
		}
		for (n : newtokens) {
			AddToken(tokens.get(n))
			buttons.get(n).enabled=false
		}

		for (f : gs.fields) {
			fields.put(f.id, f)
		}
		
		for(s:gs.selectables)
		{
			buttons.get(s).enabled=true
			enabledButtons.add(buttons.get(s))
		}
	}

	def Init() {
		removeAll
		buttons.clear
		layout = null

		//addComponentListener(this)

	}

	private def AddToken(TokenState t) {
		val button = new JButton
		button.opaque = false
		button.contentAreaFilled = false
		button.borderPainted = false
		button.UI = new TokenButtonUI(colorManager,t)
		add(button, new Integer(2))
		button.actionCommand = "tokenPressed"
		button.addActionListener(this)
		buttons.put(t.id, button)
		buttons2.put(button,t.id)
		tokens.put(t.id, t)
	}

	def Rescale() {
		for (field : states.peek.fields) {
			if(minX > field.x) minX = field.x
			if(maxX < field.x) maxX = field.x
			if(minY > field.y) minY = field.y
			if(maxY < field.y) maxY = field.y
		}
		SCALE = Math.min(this.width,this.height) / (maxX - minX + 2)
		for (field : states.peek.fields) {
			buttons.get(field.id).bounds = new Rectangle((field.x - minX + 1) * SCALE - SCALE / 3,
				(field.y - minY + 1) * SCALE - SCALE / 3, SCALE * 2 / 3, SCALE * 2 / 3)

			for (token : states.peek.tokens) {
				if (field.id == token.field)
					buttons.get(token.id).bounds = new Rectangle((field.x - minX + 1) * SCALE - SCALE / 3,
						(field.y - minY + 1) * SCALE - SCALE / 3, SCALE * 2 / 3, SCALE * 2 / 3)
			}
		}

	}

	override paint(Graphics g) {

		Rescale
		var g2 = g as Graphics2D;

		g2.clearRect(0,0,width,height)
		for (field : states.peek.fields) {
			for (ne : field.neighbours) {
				val n = fields.get(ne)
				if (n != null) {
					var line = new Line2D.Float((field.x - minX + 1) * SCALE, (field.y - minY + 1) * SCALE, n.x * SCALE,
						n.y * SCALE)
					g2.draw(line)

				}

			}
		}

		super.paint(g)
	}

	def DisableButtons() {
		for (b : enabledButtons) {
			b.enabled = false
		}
		enabledButtons.clear
	}

	override actionPerformed(ActionEvent e) {
		val action = e.actionCommand
		if (action == "fieldPressed" || action == "tokenPressed") {
			// controller.selectedField = buttons.get(e.source).hashCode
			client.SendMessage((new JSONObject().put("action", "select").put("parameter", buttons2.get(e.source))))
		}
		DisableButtons
	}



	

	override RecieveMessage(JSONObject obj) {
		println(obj.toString)
		val gson = new Gson
		if(obj.getString("name")==null) return;
		val state = gson.fromJson(obj.toString, GameState)
		AddGameState(state)
		revalidate
		repaint
	}

}
