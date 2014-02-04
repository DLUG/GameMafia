package com.anyway.android.gamemafia.player;

public class Mafia extends Job {
	private boolean killMyself;
	
	public int shoot() {
		return 0;		
	}
	
	public void addChat() {
		
	}
	
	public boolean isPossibleKillMyself() {
		return killMyself;		
	}
//	public Mafia()
//	{
//		this.jobname =  "마피아";
//		this.whichTeam = false;
//		this.vote();
//	}
//	boolean killMySelf = false;
//	int mafiaChoice[] = new int[8];
//	public void shoot()
//	{
//		for(i = 0 ; i < 8 ; i++)
//		{
//			image[i].setOnClickListener(new ImageButton.OnClickListener() {
//				public void onClick(View v)
//				{
//					for(int j = 0 ; j < playercount; j ++)
//					{
//						mafiaChoice[j] = 0;
//						image[j].setImageDrawable(R.drawable."총안맞은이미지");
//					}	
//					mafiaChoice[i] = 1;
//					image[i].setImageDrawable(R.drawable."총맞은이미지");
//				}
//			});
//		}
//	}
	

}
