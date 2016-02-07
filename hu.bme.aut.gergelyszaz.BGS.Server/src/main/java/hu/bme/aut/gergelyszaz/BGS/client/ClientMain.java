package hu.bme.aut.gergelyszaz.BGS.client;

import org.json.JSONObject;

public class ClientMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BGSClient client=new BGSClient();
		
			client.Connect("ws://localhost:8025/websockets/game");
			client.SendMessage(new JSONObject().put("action", "join").put("parameter", "Mills"));
			while(true);
		
	}

}
