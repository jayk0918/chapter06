package com.javaex.ex03;

public class Ex01 {

	public static void main(String[] args) throws InterruptedException {
		
		Runnable digit = new DigitImpl();
		Thread thread = new Thread(digit);
		
		thread.start();
		
		for(char ch = 'a'; ch<='z'; ch++) {
			System.out.print(ch);
			Thread.sleep(1000);
		}
		
	}

}
