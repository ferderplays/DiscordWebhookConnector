package net.ferderplays.dwl;

import java.io.IOException;
import java.io.OutputStream;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import org.json.JSONObject;

public class Sender {
	public static void sendMessage(String username, String message, boolean tts, String url) throws IOException {
		JSONObject json = new JSONObject();
		json.put("content", message);
		json.put("username", username);
		json.put("tts", tts);
		HttpsURLConnection connection = (HttpsURLConnection) new URL(url).openConnection();
		connection.addRequestProperty("Content-Type", "application/json");
	    connection.addRequestProperty("User-Agent", "DiscordBot (v1.0.0, http://github.com/)");
	    connection.setDoInput(true);
	    connection.setDoOutput(true);
	    connection.setRequestMethod("POST");
		OutputStream output = connection.getOutputStream();
		output.write(json.toString().getBytes());
		output.flush();
		output.close();
		connection.getInputStream().close();
		connection.disconnect();
	}
}
