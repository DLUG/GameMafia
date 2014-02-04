package com.anyway.android.gamemafia.player;

public class Citizen extends Job {
	
	private String jobName;
	private boolean whichTeam;
	
	public Citizen(String jobName, boolean whichTeam) {
		this.jobName = jobName;
		this.whichTeam = whichTeam;
	}
	
	public int vote() {
		return 0;
	}
}
