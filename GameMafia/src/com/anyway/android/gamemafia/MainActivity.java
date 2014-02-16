package com.anyway.android.gamemafia;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends Activity {
	
	private TabHost tabhost;

	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity_main);
	    
	    tabhost = (TabHost)findViewById(R.id.tabhost);
	    
	    tabhost.setup();
        TabHost.TabSpec spec;
        
        spec = tabhost.newTabSpec("Tab 00");
        spec.setIndicator("myInfo");        
        spec.setContent(R.id.myInfo);      
        tabhost.addTab(spec);
        spec = tabhost.newTabSpec("Tab 01");
        spec.setIndicator("friendsList");        
        spec.setContent(R.id.friendsList);      
        tabhost.addTab(spec);
        spec = tabhost.newTabSpec("Tab 02");
        spec.setIndicator("option");        
        spec.setContent(R.id.option);      
        tabhost.addTab(spec);
        spec = tabhost.newTabSpec("Tab 03");
        spec.setIndicator("help");        
        spec.setContent(R.id.help);      
        tabhost.addTab(spec);
        tabhost.getTabWidget().getChildAt(0).setBackgroundColor(Color.parseColor("#557fffd4"));
        tabhost.getTabWidget().getChildAt(1).setBackgroundColor(Color.parseColor("#557fffd4"));
        tabhost.getTabWidget().getChildAt(2).setBackgroundColor(Color.parseColor("#557fffd4"));
        tabhost.getTabWidget().getChildAt(3).setBackgroundColor(Color.parseColor("#557fffd4"));
	}

}
