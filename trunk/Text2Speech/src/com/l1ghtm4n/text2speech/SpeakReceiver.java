package com.l1ghtm4n.text2speech;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentReceiver;
import demo.freetts.HelloWorld.*;
public class SpeakReceiver extends IntentReceiver {

	static final String ACTION = "com.l1ghtm4n.text2speech.ACTION_SPEAK";
	
	public static Context _context = null;
	
	@Override
	public void onReceiveIntent(Context context, Intent intent) {
		if (intent.getAction().equals(ACTION))
		{
			// set a context accessed globally (yeah, it's a  real hack, i know)
			_context = context;
			
			// here we would speak the content.  For now we'll
			// just write a bit of it to the screen
			String content = intent.getStringExtra("Content");
			
			Notification msg = new Notification();
			msg.tickerText = "Received ACTION_SPEAK: ".concat(content);
			((NotificationManager)context.getSystemService(Context.NOTIFICATION_SERVICE)).notify(123, msg);
			
			
			speak();
	
		}

	}

	public void speak()
	{
		FreeTTSHelloWorld.Run(new String[0]);
	}
	
}
