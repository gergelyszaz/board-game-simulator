package hu.gergelyszaz.bgs.client;

import org.json.JSONObject;

public interface MessageListener {
	void RecieveMessage(JSONObject obj);
}
