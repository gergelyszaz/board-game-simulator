package graphics;

import hu.bme.aut.gergelyszaz.BGS.client.BGSClient;
import hu.bme.aut.gergelyszaz.BGS.server.WebSocketServer;
import org.json.JSONArray;
import org.json.JSONObject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LoadWindow {

    private JFrame frmBoardgameSimulator;
    private JTextField pathField;
    private JList<String> list;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            try {
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
        frmBoardgameSimulator.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frmBoardgameSimulator.getContentPane()
                .setLayout(new BoxLayout(frmBoardgameSimulator.getContentPane(), BoxLayout.Y_AXIS));

        JPanel panel_1 = new JPanel();
        frmBoardgameSimulator.getContentPane().add(panel_1);
        panel_1.setLayout(new BorderLayout(5, 5));

        list = new JList<>();
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

        JButton serverButton = new JButton("Start server");
        panel.add(serverButton);
        serverButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
                if (!WebSocketServer.isRunning()) {
                    new Thread() {
                        @Override
                        public void run() {

                            String path = pathField.getText().replaceFirst("ws://", "");
                            String[] params = path.split(":");
                            String[] p2 = params[1].split("/");
                            WebSocketServer.runServer(params[0], Integer.parseInt(p2[0]), p2[1]);
                            serverButton.setText("Stop server");

                        }
                    }.start();
                    serverButton.setText("Stop server");
                } else{
                    WebSocketServer.stopServer();
                    serverButton.setText("Start server");
                }
            }

        });
        serverButton.setAlignmentX(Component.CENTER_ALIGNMENT);


        JButton btnconnectButton = new JButton("Connect");
        panel.add(btnconnectButton);
        btnconnectButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
                new Thread() {
                    @Override
                    public void run() {

                        BGSClient client = new BGSClient();
                        client.Connect(pathField.getText(), obj -> {
                            JSONArray games = obj.getJSONArray("games");

                            DefaultListModel<String> model = new DefaultListModel<>();

                            for (Object o : games) {
                                String e = ((JSONObject) o).getString("name");
                                model.addElement(e);
                            }
                            SwingUtilities.invokeLater(() -> {
                                list.setModel(model);
                                list.setSelectedIndex(0);
                            });

                        });
                        client.SendMessage(new JSONObject().put("action", "info"));
                        client.SendMessage(new JSONObject().put("action", "quit"));
                    }
                }.start();
            }

        });
        btnconnectButton.setAlignmentX(Component.CENTER_ALIGNMENT);

    }

    protected JList<String> getList() {
        return list;
    }
}
