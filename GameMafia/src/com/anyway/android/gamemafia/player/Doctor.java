package com.anyway.android.gamemafia.player;

public class Doctor extends Job {
	private boolean healMyself;
	
	public int heal() {
		return 0;
	}
	
	public boolean isPossibleHealMyself() {
		return healMyself;
	}
}
