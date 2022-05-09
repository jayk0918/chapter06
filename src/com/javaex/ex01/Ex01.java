package com.javaex.ex01;

public class Ex01 {

	public static void main(String[] args) throws InterruptedException {
		
		Thread thread = new DigitThread();
		thread.start();
		// DigitThread class에서 thread.run에 대한 정의를 하였음
		// 그러나 thread.run();을 실행할 경우 실행은 되나 실제로 효력이 없음
		// thread.start();에서 run이외에 다른 기능들이 복합적으로 작용하여 최종적으로 실행된다고 생각하면 됨(이외 다른 기능이 뭔지는 모르겠음)
		// 또한 DigitThread thread = new DigitThread라고 할 경우 DigitThread 내부에서만 시선이 한정되어있기에 소위 '출장' 기능이 지원되지 않음
		// 따라서 main method에 '출장'기능을 구현하기 위해 Thread(출장) thread = new DigitThread(설정한 run값)();으로 설정
		
		for(char ch='A'; ch<='Z'; ch++) {
			System.out.print(ch);
			Thread.sleep(1000);
		}
		
	}

}
