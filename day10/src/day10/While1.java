package day10;

import java.util.Scanner;

public class While1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String answer="Y"; // while문이 실행되도록 초기값을 조건이 참일 값을 넣어준다.
		int count = 0;
		
		while(answer.equals("Y")) {
			System.out.println("음악을 재생하시겠습니까?(Y)");
			answer = sc.nextLine();
			
			if(answer.equals("Y")) {
				System.out.printf("음악을 %d번 재생했습니다.\n", ++count);
			}
		} 
		System.out.println("재생종료");
	}

}
