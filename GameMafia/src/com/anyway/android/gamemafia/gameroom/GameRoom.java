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
//			//��ŸƮ ��ư  Ȱ��ȭ
//		}
//	}
//	public void option()
//	{
//		switch(playerList.size()) //�⺻���� ��ư Ŭ���� ����
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
//	public void timer(int time) //�̰Ÿ³�...��Ȯ�� ��
//	{
//		CountDownTimer mCountDown = new CountDownTimer(time, 1000)
//		{
//			public void onTick(long millisUntillFinished) // Ÿ�̸Ӱ� ����ɶ����� �����ϴ� �Լ�
//			{
//				viewTime.setText(millisUntillFinished);//viewTime�� �ð��� ������ ���Ӵϴ�.
//			}
//			public void onFinish() //Ÿ�̸Ӱ� ����� ����Ǵ� �Լ�
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
//			playerList.get(0).//ä��â ��Ȱ��ȭ
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
//		//���̾� �α׿��� ���� ��ӤӤø��Ӥ�����
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
//		voteCount[i] ǥ��
//		voteCount[i]�� ���� ū �� .dead;
//
//	}
//	public void showMafiaWin()
//	{
//		for(int i = 0 ; playerList.size() < i ; i++)
//		{
//			if(playerList.get(i).whichTeam == true)
//			{
//				//�й�
//			}
//			else
//			{
//				//�¸�
//			}
//		}
//	}
//	public void showCitizenWin()
//	{
//		for(int i = 0 ; playerList.size() < i ; i++)
//		{
//			if(playerList.get(i).whichTeam == false)
//			{
//				//�й�
//			}
//			else
//			{
//				//�¸�
//			}
//		}
//	}
}
