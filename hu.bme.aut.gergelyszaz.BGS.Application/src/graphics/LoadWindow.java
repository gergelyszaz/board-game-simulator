package graphics;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.json.JSONArray;
import org.json.JSONObject;

import hu.bme.aut.gergelyszaz.BGS.client.BGSClient;
import hu.bme.aut.gergelyszaz.BGS.client.IMessageReciever;

import javax.swing.JList;
import javax.swing.JCheckBox;
import javax.swing.AbstractListModel;
import javax.swing.ListSelectionModel;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.SpringLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class LoadWindow {

	private JFrame frmBoardgameSimulator;
	private JTextField pathField;
	protected static Shell shell;

	private static Display display;
	private final Action action = new SwingAction();
	private JList<String> list;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {

			public void run() {

				try {
					display = new Display();
					shell = new Shell(display);
					LoadWindow window = new LoadWindow();
					window.frmBoardgameSimulator.setVisible(true);
					// new
					// org.eclipse.emf.mwe.utils.StandaloneSetup().setPlatformUri("../");
					// Injector injector = new
					// BGLStandaloneSetup().createInjectorAndDoEMFRegistration();
					// resourceSet =
					// injector.getInstance(XtextResourceSet.class);
					// resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL,
					// Boolean.TRUE);
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoadWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBoardgameSimulator = new JFrame();
		frmBoardgameSimulator.setTitle("Boardgame Simulator");
		frmBoardgameSimulator.setBounds(100, 100, 400, 201);
		frmBoardgameSimulator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBoardgameSimulator.getContentPane()
				.setLayout(new BoxLayout(frmBoardgameSimulator.getContentPane(), BoxLayout.Y_AXIS));

		JPanel panel_1 = new JPanel();
		frmBoardgameSimulator.getContentPane().add(panel_1);
		panel_1.setLayout(new BorderLayout(5, 5));

		list = new JList<String>();
		list.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JFrame frame = new JFrame();
				BoardPanel panel = new BoardPanel();
				frame.getContentPane().add(panel);
				frame.setVisible(true);
				frame.setSize(new Dimension(500, 500));

				BGSClient client;
				panel.SetClient(client = new BGSClient());
				client.Connect(pathField.getText(), panel);
				client.SendMessage(
						new JSONObject().put("action", "join").put("parameter", getList().getSelectedValue()));
			}
		});
		panel_1.add(list);
		list.setVisibleRowCount(4);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

		JPanel panel = new JPanel();
		frmBoardgameSimulator.getContentPane().add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 10));

		pathField = new JTextField();
		pathField.setColumns(25);
		panel.add(pathField);
		pathField.setText("ws://localhost:8025/websockets/game");
		pathField.setHorizontalAlignment(SwingConstants.LEFT);

		JButton btnconnectButton = new JButton("Connect");
		panel.add(btnconnectButton);
		btnconnectButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				new Thread() {
					@Override
					public void run() {

						BGSClient client = new BGSClient();
						client.Connect(pathField.getText(), new IMessageReciever() {
							@Override
							public void RecieveMessage(JSONObject obj) {
								JSONArray games = obj.getJSONArray("games");

								DefaultListModel<String> model = new DefaultListModel<String>();

								for (Object o : games) {
									String e = ((JSONObject) o).getString("name");
									model.addElement(e);
								}
								SwingUtilities.invokeLater(new Runnable() {
									@Override
									public void run() {
										list.setModel(model);
										list.setSelectedIndex(0);
									}
								});

							}
						});
						client.SendMessage(new JSONObject().put("action", "info"));
						client.SendMessage(new JSONObject().put("action", "quit"));
					};
				}.start();
			};

		});
		btnconnectButton.setAlignmentX(Component.CENTER_ALIGNMENT);

	}

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Start");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}

		@Override
		public boolean isEnabled() {
			return list.getModel().getSize() > 0;
		}

		public void actionPerformed(ActionEvent e) {

		}
	}

	protected JList<String> getList() {
		return list;
	}
}
