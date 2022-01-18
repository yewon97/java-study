package day34;

import java.util.Timer;
import java.util.TimerTask;

public class Timer1 {
	public static void main(String[] args) throws InterruptedException {
		Timer t = new Timer(true);
		TimerTask w1 = new Work1();
		TimerTask w2 = new Work2();
		
		t.schedule(w1, 3000); // 3초 뒤 
		t.schedule(w2, 1000);
		Thread.sleep(4000); // 4초 기다려 
		System.out.println("모든 작업 종료~!");
	}
}

class Work1 extends TimerTask {
	@Override
	public void run() {
		System.out.println("work1 실행");
	}
}
class Work2 extends TimerTask {
	@Override
	public void run() {
		System.out.println("work2 실행");
	}
}