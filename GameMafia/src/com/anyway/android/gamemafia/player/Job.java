package com.anyway.android.gamemafia.player;

public abstract class Job {
	private String jobName;		// 직업명
	private boolean whichTeam;	// 시민팀 0, 마피아팀 1
	private int vote() {
		return 0;	// selectNumber
	}
}
