package net.ferderplays.dwl;

import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		/** DWL - Discord Webhook Loader is a program, 
		 * that can send messages to discord servers, 
		 * or can be made to a bot, that is only for one server and one channel, 
		 * this could be good for authentication bots */
		//example:
		String webhook = "https://discord.com/api/webhooks/945385893362036806/zkFFjCT5tkXiOYT5uff0TkJ7fdLFtz5Ch6-l3XgCXw2ib5UFuHIggKRSkUCw4WziTiX0";
		try {
			Sender.sendMessage("f bot", "hi", false, webhook);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
