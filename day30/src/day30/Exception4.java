package day30;

import java.util.Scanner;

public class Exception4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		try {
			ticketing(age);
		}
		catch(AgeException e) {
			e.printStackTrace();
		}
	}
	public static void ticketing(int age) throws AgeException {
		if(age<0) {
			throw new AgeException("나이 입력이 잘못되었습니다.");
		}
	}
}

class AgeException extends Exception {
	public AgeException() {}
	public AgeException(String message) {
		super(message);
	}
}