package com.l1ghtm4n.text2speech;


import java.util.Map;

import com.l1ghtm4n.text2speech.R;
import com.l1ghtm4n.text2speech.SpeakReceiver;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.content.Intent;
import android.view.KeyEvent;


public class Text2SpeechView extends View {

	public Text2SpeechView(Context context, AttributeSet attrs, Map inflateParams) 
	{
        super(context, attrs, inflateParams);
        setBackground(R.drawable.icon);
        setFocusable(true);
    }

}
