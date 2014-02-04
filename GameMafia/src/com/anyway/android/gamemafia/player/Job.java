package com.anyway.android.gamemafia.player;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

import com.anyway.android.gamemafia.RoomActivity;

public abstract class Job {
	private String jobName;
	private boolean whichTeam;	// citizen team : 0, mafia team : 1
	private byte[] selectionNumber;
	private int index = 0;
	private int countPlayer = 8;	// temporary variable -> need a GameRoom ref
		
	RoomActivity roomAct = new RoomActivity();
	
	public Job() {
		jobName = "";
		whichTeam = false;
	}
	
	public int vote() {
		selectionNumber = new byte[8];
		
		for(index=0 ; index<countPlayer ; index++) {
			roomAct.imgbtn_player[index].setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View v) {
					for(int idx=0 ; idx<countPlayer ; idx++) {
						selectionNumber[index] = 1;
						// roomAct.imgbtn_player[index].(search a image overlay method!!)
					}
					
				}
			});
		}
		
		return 0;
	}

	
//	private ImageButton image[] = new ImageButton[8];
//	private byte voteValue[] = new byte[8];
//	private int playercount = 0;
//	private String jobname = ""; 
//	private int index = 0;
//	private boolean whichTeam = false; // false는 마피아팀
//	public void vote()
//	{
//		for(index = 0 ; index < 8 ; index++)
//		{
//			image[index].setOnClickListener(new ImageButton.OnClickListener() {
//				public void onClick(View v)
//				{
//					for(int j = 0 ; j < playercount; j ++)
//					{
//						voteValue[j] = 0;
//						image[j].setImageDrawable(R.drawable."선택안된이미지");
//					}	
//					voteValue[index] = 1; //이거 왜 오류?
//					image[index].setImageDrawable(R.drawable."선택된이미지");
//				}
//			});
//		}
//	}
//
}
