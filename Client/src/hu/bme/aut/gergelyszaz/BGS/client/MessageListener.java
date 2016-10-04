package hu.bme.aut.gergelyszaz.BGS.client;

import org.json.JSONObject;

public interface MessageListener {
	void RecieveMessage(JSONObject obj);
}
