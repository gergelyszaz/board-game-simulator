package hu.bme.aut.gergelyszaz.BGS.client;

import org.json.JSONObject;

public interface IMessageReciever {
	public void RecieveMessage(JSONObject obj);
}
