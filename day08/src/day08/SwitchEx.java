package day08;

import java.util.Scanner;

public class SwitchEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		일 년동안 읽은 책 수에 따라 멘트를 출력 		
		System.out.print("일 년동안 읽은 책 수 : ");
		int book = sc.nextInt();
		
		switch(book/10) {
			case 0 : // 10권 미만 
				System.out.println("조금 더 노력하세요!");
				break;
			case 1 : // 10<=book<20
				System.out.println("책 읽는 것을 즐기시는 분이시네요!");
				break;
			case 2 : // 20<=book<30
				System.out.println("책을 사랑하는 분이시네요!");
				break;
			default : // 30<=book
				System.out.println("당신은 다독왕입니다!");
		}
	}

}
