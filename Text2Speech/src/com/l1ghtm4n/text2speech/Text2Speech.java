package com.l1ghtm4n.text2speech;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;

public class Text2Speech extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.main);
    }

	public boolean onKeyDown(int keyCode, KeyEvent event)
	{
		//Intent intent = new Intent("com.l1ghtm4n.text2speech.ACTION_SPEAK");
		Intent intent = new Intent();
		
		intent.setClass(Text2Speech.this, com.l1ghtm4n.text2speech.SpeakReceiver.class);
		intent.setAction("com.l1ghtm4n.text2speech.ACTION_SPEAK");
		
		if (keyCode == android.view.KeyEvent.KEYCODE_DPAD_UP)
		{
			intent.putExtra("Content", (String)"This is my message");
			broadcastIntent(intent);
			return true;
		}
		
		return false;
	}

}