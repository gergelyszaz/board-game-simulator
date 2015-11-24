package graphics

import hu.bme.aut.gergelyszaz.BGS.core.IController
import hu.bme.aut.gergelyszaz.BGS.core.IView
import hu.bme.aut.gergelyszaz.BGS.core.Token
import hu.bme.aut.gergelyszaz.bGL.Field
import hu.bme.aut.gergelyszaz.bGL.Model
import java.awt.Graphics
import java.awt.Graphics2D
import java.awt.Rectangle
import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import java.awt.geom.Line2D
import java.util.List
import java.util.concurrent.ConcurrentHashMap
import javax.swing.JButton
import javax.swing.JLayeredPane
import java.awt.event.ComponentListener
import java.awt.event.ComponentEvent

class BoardPanel extends JLayeredPane implements ActionListener, IView, ComponentListener {
	IController controller
	Model model;
	val buttons = new ConcurrentHashMap<JButton, Object>
	var SCALE = 100
	var minX = Integer.MAX_VALUE
	var maxX = Integer.MIN_VALUE
	var minY = Integer.MAX_VALUE
	var maxY = Integer.MIN_VALUE
	val tokenButtons = new ConcurrentHashMap<JButton, Token>
	val fieldButtons = new ConcurrentHashMap<JButton, Field>

	new() {
		super()
	}

	def Init() {
		removeAll
		buttons.clear
		layout = null

		addComponentListener(this)

		for (field : model.board.fields) {
			if(minX > field.x) minX = field.x
			if(maxX < field.x) maxX = field.x
			if(minY > field.y) minY = field.y
			if(maxY < field.y) maxY = field.y

			var btn = new JButton
			buttons.put(btn, field)
			fieldButtons.put(btn,field)
			btn.UI = new FieldButtonUI(field)
			btn.opaque = false
			btn.contentAreaFilled = false
			btn.borderPainted = false
			btn.bounds = new Rectangle(field.x * SCALE - SCALE / 3, field.y * SCALE - SCALE / 3, SCALE * 2 / 3,
				SCALE * 2 / 3)
			btn.actionCommand = "fieldPressed"
			btn.addActionListener(this)
			add(btn, new Integer(1))
			controller.varManager.StoreToObject_Name(field, "tokenCount", 0)
		}

		DisableButtons
	}

	override AddToken(Token t) {
		val button = new JButton
		button.opaque = false
		button.contentAreaFilled = false
		button.borderPainted = false
		button.UI = new TokenButtonUI(t)
		add(button, new Integer(2))
		button.actionCommand = "tokenPressed"
		button.addActionListener(this)
		button.enabled = false
		buttons.put(button, t)
		tokenButtons.put(button, t)
	}

	override Refresh() {
		SCALE = this.width / (maxX - minX+2)
		for (entry : tokenButtons.entrySet) {
			val field = entry.value.field
			entry.key.bounds = new Rectangle((field.x-minX+1) * SCALE - SCALE / 3, (field.y-minY+1) * SCALE - SCALE / 3, SCALE * 2 / 3,
				SCALE * 2 / 3)
		}
		for (entry : fieldButtons.entrySet) {
			val field = entry.value
			entry.key.bounds = new Rectangle((field.x-minX+1) * SCALE - SCALE / 3, (field.y-minY+1) * SCALE - SCALE / 3, SCALE * 2 / 3,
				SCALE * 2 / 3)
		}
	}

	override paint(Graphics g) {

		var g2 = g as Graphics2D;

		for (field : model.board.fields) {
			for (n : field.neighbours) {
				var line = new Line2D.Float((field.x-minX+1) * SCALE, (field.y-minY+1) * SCALE, n.x * SCALE, n.y * SCALE)
				g2.draw(line)

			}
		}

		super.paint(g)
	}

	def DisableButtons() {
		for (b : buttons.keySet) {
			b.enabled = false
		}
	}

	override RemoveButton(Object o) {
		var JButton butt = null
		for (b : buttons.entrySet) {
			if (b.value == o)
				butt = b.key

		}

		remove(butt)
		tokenButtons.remove(butt)
		repaint

	}

	override actionPerformed(ActionEvent e) {
		val action = e.actionCommand
		if (action == "fieldPressed") {
			controller.selectedField = buttons.get(e.source) as Field
		}
		if (action == "tokenPressed") {
			controller.selectedToken = buttons.get(e.source) as Token
		}
		if (action == "Restart") {
			controller.Restart
		}
		DisableButtons
		controller.waitForInput = false

		synchronized (controller.lock) {
			controller.lock.notifyAll
		}
	}

	override SetController(IController controller) {
		this.controller = controller
	}

	override SetModel(Model model) {
		this.model = model
		Init
	}

	override EnableButtons(List<Object> objects) {
		for (b : buttons.entrySet) {
			if (objects.contains(b.value)) {
				b.key.enabled = true
			}
		}

	}

	override componentHidden(ComponentEvent e) {
	}

	override componentMoved(ComponentEvent e) {
	}

	override componentResized(ComponentEvent e) {
		Refresh
	}

	override componentShown(ComponentEvent e) {
	}

}
