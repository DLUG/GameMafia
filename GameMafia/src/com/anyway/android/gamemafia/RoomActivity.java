package com.anyway.android.gamemafia;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageButton;

public class RoomActivity extends Activity {

	public ImageButton[] imgbtn_player;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity_room);
	    
	    imgbtn_player = new ImageButton[8];
	    
	}

}
