package com.javaex.ex04;

public class DigitImpl implements Runnable{
	
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
