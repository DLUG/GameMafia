package com.anyway.android.gamemafia.player;

public class Doctor extends Job {
	private boolean healMyself;
	
	public int heal() {
		return 0;
	}
	
	public boolean isPossibleHealMyself() {
		return healMyself;
	}
//	public Doctor()
//	{
//		this.jobname = "�ǻ�";
//		this.whichTeam = true;
//		this.vote();
//	}
//	boolean healMySelf = false;
//	int doctorChoice[] = new int[8];
//	public void heal()
//	{
//		for(i = 0 ; i < 8 ; i++)
//		{
//			image[i].setOnClickListener(new ImageButton.OnClickListener() {
//				public void onClick(View v)
//				{
//					for(int j = 0 ; j < playercount; j ++)
//					{
//						doctorChoice[j] = 0;
//						image[j].setImageDrawable(R.drawable."ġ������ִ� �̹���");
//					}	
//					doctorChoice[i] = 1;
//					image[i].setImageDrawable(R.drawable."ġ�����ִ��̹���");
//				}
//			});
//		}
//	}

}
