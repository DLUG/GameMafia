package com.anyway.android.gamemafia;

import com.anyway.android.gamemafia.R;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TabHost;
import android.widget.TextView;

public class MainActivity extends Activity {

	private TabHost tabhost;
	private Button exit_btn;
	private Button friendAdd_Btn;
	private EditText friend_Input;
	private TextView friend_List;
	private ScrollView Scroll;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		tabhost = (TabHost) findViewById(R.id.tabhost);
		exit_btn = (Button) findViewById(R.id.EXIT);
		friendAdd_Btn = (Button) findViewById(R.id.friendAddBtn);
		friend_Input = (EditText) findViewById(R.id.join_editTxt_id);
		friend_List = (TextView) findViewById(R.id.friendList);
		Scroll = (ScrollView) findViewById(R.id.join_scroll_terms);
		tabhost.setup();
		TabHost.TabSpec spec;

		spec = tabhost.newTabSpec("Tab 00");
		spec.setIndicator("myInfo");
		spec.setContent(R.id.myInfo);
		tabhost.addTab(spec);
		spec = tabhost.newTabSpec("Tab 01");
		spec.setIndicator("friendsList");
		spec.setContent(R.id.friends_List);
		tabhost.addTab(spec);
		spec = tabhost.newTabSpec("Tab 02");
		spec.setIndicator("option");
		spec.setContent(R.id.option);
		tabhost.addTab(spec);
		spec = tabhost.newTabSpec("Tab 03");
		spec.setIndicator("help");
		spec.setContent(R.id.help);
		tabhost.addTab(spec);
		tabhost.getTabWidget().getChildAt(0)
				.setBackgroundColor(Color.parseColor("#557fffd4"));
		tabhost.getTabWidget().getChildAt(1)
				.setBackgroundColor(Color.parseColor("#557fffd4"));
		tabhost.getTabWidget().getChildAt(2)
				.setBackgroundColor(Color.parseColor("#557fffd4"));

		exit_btn.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				System.exit(0);
			}
		});

		friendAdd_Btn.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				String name = friend_Input.getText().toString() + "\n";
				friend_List.append(name);
				friend_Input.setText("");
				// Toast.makeText(getApplicationContext(), tmp,
				// Toast.LENGTH_SHORT).show();
			}
		});
	}

}
