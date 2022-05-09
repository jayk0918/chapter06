package com.javaex.ex03;

public class DigitImpl implements Runnable{
	
	// 인터페이스 루트를 탈 경우 : Thread를 상속받아야 하는데 부모클래스의 충돌로 양자택일 해야하는 상황일 때
	// Thread를 포기하지 말고 인터페이스로 우회하여 사용가능하게끔 만들어줌
	
	@Override
	public void run() {
		for(int i=0; i<26; i++) {
			System.out.print(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
