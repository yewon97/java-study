package day15;

import java.util.Scanner;

public class Fruits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] fruits = new String[3];
		for(int i=0; i<3; i++) {
			System.out.print("주문할 과일 : ");
			fruits[i] = sc.nextLine();
		}
		System.out.println("----주문 받은 과일----");
		for(String eachFruit : fruits) {
			System.out.print(eachFruit+" ");
		}
	}

}
