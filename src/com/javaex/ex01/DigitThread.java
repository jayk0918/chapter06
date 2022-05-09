package com.javaex.ex01;

public class DigitThread extends Thread{

	// DigitThread(임의의 이름)
	// Thread를 사용하기 위해서 Thread를 상속받아 임의의 클래스를 만들어 사용
	
	// 필드
	
	// 생성자
	
	// 메소드 gs
	
	// 메소드 일반
	// run에 실행하고자 하는 코드 작성
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.print(i);
			try {
				Thread.sleep(1000);	// sleep : 실행 딜레이 시간 설정, try-catch 필요
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
}
