package com.javaex.ex02;

public class DigitThread extends Thread{
	
	public void run() {
		for(int i=0; i<26; i++) {
			System.out.print(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
	}
	
}
