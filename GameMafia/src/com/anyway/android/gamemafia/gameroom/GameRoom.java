package com.anyway.android.gamemafia.gameroom;

public class GameRoom {
//	ArrayList arrayJob  = new ArrayList();
//	ArrayList playerList = new ArrayList();
//	public void countingReady()
//	{
//		int readyCount = 0;
//		for(int i = 0; i < playerList.size(); i++)
//		{
//			if(playerList.get(i).ready == true)
//			{
//				readyCount++;
//			}
//		}
//		if(readyCount == (playerList.size() - 1))
//		{
//			//스타트 버튼  활성화
//		}
//	}
//	public void option()
//	{
//		switch(playerList.size()) //기본설정 버튼 클릭시 실행
//		{
//			case 4 : Mafia mafia1 = new Mafia();
//					 arrayJob.add(0,mafia1);
//					 Doctor doctor1 = new Doctor();
//					 arrayJob.add(1,doctor1);
//					 Citizen citizen1 = new Citizen();
//					 arrayJob.add(2,citizen1);
//					 Police police1 = new Police();
//					 arrayJob.add(3,police1);
//					 break;
//		}
//	}
//	public void setJob()
//	{
//		for(;;)
//		{
//			int random = (int)((Math.random() * playerList.size()) + 1 );
//			if(playerList.get(random).job.isEquals(""))
//			{
//				playerList.get(random).job = arrayJob.get(random);
//			}
//			else
//			{
//				continue;
//			}
//		}
//	}
//	public void timer(int time) //이거맞나...정확히 모름
//	{
//		CountDownTimer mCountDown = new CountDownTimer(time, 1000)
//		{
//			public void onTick(long millisUntillFinished) // 타이머가 종료될때까지 동작하는 함수
//			{
//				viewTime.setText(millisUntillFinished);//viewTime은 시간을 보여줄 곳임니다.
//			}
//			public void onFinish() //타이머가 종료시 실행되는 함수
//			{
//				for(int i = 0; i < playerList.size(); i++)
//				{
//					playerList.get(i).vote();
//				}
//			}
//		}.start();
//	}
//	public void night()
//	{
//		
//		for(int i = 0; i < playerList.size(); i++)
//		{
//			playerList.get(0).//채팅창 비활성화
//			playerList.get(0).skill();
//		}
//		timer(30);
//		
//	}
//	public void nightResult()
//	{
//		if(doctorChoice == mafiaChoice)
//		{
//			//Nothing.
//		}
//		else
//		{
//			playerList.get(mafiaChoice).dead();
//		}
//	}
//	public void openJob()
//	{
//		Dialog jobChoiceDialog;
//		//다이알 로그에서 선택 사ㅣㅣㅓ마ㅣㄴㅇ러
//		timer(30);
//	}
//	public void afternoon()
//	{
//		timer(180);
//		if(timer.time == 0)
//		{
//			for(int i = 0; i < playerList.size(); i++)
//			{
//				playerList.get(i).vote();
//			}
//		}
//	}
//	public void voteResult()
//	{
//		int voteCount[] = new int[playerList.size()];
//		
//		for(int i = 0; i < playerList.size(); i++)
//		{
//			for(int j = 0; j < playerList.size(); i++)
//			{
//				voteCount[i] = playerList.get(j).voteValue(i);
//			}
//		}
//		Dialog voteResult = Dialog;
//		Dialog voteResult//
//		voteCount[i] 표시
//		voteCount[i]중 가장 큰 수 .dead;
//
//	}
//	public void showMafiaWin()
//	{
//		for(int i = 0 ; playerList.size() < i ; i++)
//		{
//			if(playerList.get(i).whichTeam == true)
//			{
//				//패배
//			}
//			else
//			{
//				//승리
//			}
//		}
//	}
//	public void showCitizenWin()
//	{
//		for(int i = 0 ; playerList.size() < i ; i++)
//		{
//			if(playerList.get(i).whichTeam == false)
//			{
//				//패배
//			}
//			else
//			{
//				//승리
//			}
//		}
//	}
}
