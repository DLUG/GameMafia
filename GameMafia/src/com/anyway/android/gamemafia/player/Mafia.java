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
}
