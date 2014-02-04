package com.anyway.android.gamemafia;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class JoinActivity extends Activity {
	
	private Button btn_cancel;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity_join);
	    
	    btn_cancel = (Button)findViewById(R.id.join_btn_cancel);
	    // click btn_cancel button action
	    btn_cancel.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
				startActivity(intent);
			}
		});
	}

}
