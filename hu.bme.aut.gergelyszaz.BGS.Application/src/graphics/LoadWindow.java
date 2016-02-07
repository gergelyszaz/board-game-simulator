package graphics;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.json.JSONObject;

import hu.bme.aut.gergelyszaz.BGS.client.BGSClient;

public class LoadWindow {

	private JFrame frmBoardgameSimulator;
	private JTextField pathField;
	protected static Shell shell;

	private static Display display;

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
					//new org.eclipse.emf.mwe.utils.StandaloneSetup().setPlatformUri("../");
					//Injector injector = new BGLStandaloneSetup().createInjectorAndDoEMFRegistration();
					//resourceSet = injector.getInstance(XtextResourceSet.class);
					//resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
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
		frmBoardgameSimulator.setBounds(100, 100, 369, 111);
		frmBoardgameSimulator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBoardgameSimulator.getContentPane()
				.setLayout(new BoxLayout(frmBoardgameSimulator.getContentPane(), BoxLayout.Y_AXIS));

		JPanel panel = new JPanel();
		frmBoardgameSimulator.getContentPane().add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		pathField = new JTextField();
		pathField.setColumns(20);
		panel.add(pathField);
		pathField.setText("ws://localhost:8025/websockets/game");
		pathField.setHorizontalAlignment(SwingConstants.LEFT);
/*
		JButton selectButton = new JButton("Select");
		selectButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				FileDialog dialog = new FileDialog(shell, SWT.OPEN | SWT.SINGLE);
				String[] filterNames = new String[] { "Boardgames (*bgl)" };
				String[] filterExtensions = new String[] { "*.bgl" };
				String filterPath = "c:\\";
				dialog.setFilterNames(filterNames);
				dialog.setFilterExtensions(filterExtensions);
				dialog.setFilterPath(filterPath);

				pathField.setText(dialog.open());
			}
		});
		selectButton.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(selectButton);
*/
		JPanel panel_1 = new JPanel();
		frmBoardgameSimulator.getContentPane().add(panel_1);
		panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.Y_AXIS));

		JButton connectButton = new JButton("Connect");
		JButton startButton=new JButton("Start");
		startButton.addMouseListener(new MouseAdapter(){
			@Override
			public void mouseClicked(MouseEvent arg0) {
				new Thread() {
					@Override
					public void run() {
						super.run();
						client.SendMessage(new JSONObject().put("action", "join").put("parameter", "Mills"));
					}
				};
			}
		
		});
		connectButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				new Thread() {
					@Override
					public void run() {
						super.run();

						JFrame frame = new JFrame();
						BoardPanel panel = new BoardPanel();
						frame.getContentPane().add(panel);
						frame.setVisible(true);
						frame.setSize(new Dimension(500, 500));
						
						panel.SetClient(client);
						client.Connect(pathField.getText(),panel);
						client.SendMessage(new JSONObject().put("action", "join").put("parameter", "Mills"));
					};

				}.start();
			}
		});
		connectButton.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel_1.add(connectButton);

		Component verticalStrut = Box.createVerticalStrut(8);
		panel_1.add(verticalStrut);
	}

	BGSClient client = new BGSClient();
}
