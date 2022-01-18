package day44;

public class ShareBank {
	public static void main(String[] args) {
		ATM atm = new ATM();
		Thread mom = new Thread(atm, "엄마");
		Thread son = new Thread(atm, "아들");
		
		mom.start();
		son.start();
	}
}

class ATM implements Runnable {
	int money = 100000;
	public void run() {
		for(int i=0; i<50; i++) {
			withdraw(1000);
			printInfo();
			try {
				Thread.sleep(100);
			}
			catch(Exception e) {}
		}
	}
	synchronized void withdraw(int money) {
		Thread.yield();
		this.money -= money;
		System.out.println(Thread.currentThread().getName()+"이(가)"+money+"원 출금");
	}
	void printInfo() {
		System.out.println("현재 금액 : "+this.money+"원");
	}
}