package hu.bme.aut.gergelyszaz.BGS.client;

import java.net.URI;
import java.net.URISyntaxException;


import org.json.JSONObject;

public class ClientMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BGSClient client=new BGSClient();
		try {
			client.Connect(new URI("ws://localhost:8025/websockets/game"));
			client.SendMessage(new JSONObject().put("action", "join").put("parameter", "Mills"));
			while(true);
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
