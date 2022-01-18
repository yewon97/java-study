package day06;

import java.util.Scanner;

public class Traffic_Light_yellow {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("★☆★☆신호등 프로그램★☆★☆︎︎");
		System.out.println("신호를 입력하세요~");
		System.out.println("빨간불:1, 초록불:2, 노란불:3");
		
		int sign = sc.nextInt();
		
		String result=sign==1?"정지하세요~":sign==2?"출발하세요~":"서행하세요~";
//		1이면 정지하세요, 그 외에는 한번더 비교해줘야함
//		1과 2 외에는 전부 "서행하세요"로 나옴 왜냐하면 1과 2가 아니기 때문에 
		System.out.println(result);
	}
}

