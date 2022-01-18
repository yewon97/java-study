package day02;
//1. 준비물 : 입력기능을 내 코드에 연결시켜
import java.util.Scanner;
public class Day02Input {
	public static void main(String[] args) {
//		2. 준비물 : Scanner를 sc라는 이름으로 사용하겠다.
		Scanner sc = new Scanner(System.in);
//		문자열로 입력받아라 
		sc.next();
//		문자열로 입력받아라 -> 기능자체가 키보드로 입력한 입력값
		System.out.println(sc.next());
//		정수값으로 입력받아라 -> 문자열값 입력하면 오류생
		System.out.println(sc.nextInt());
//		실수형값으로 입력받아라
		System.out.println(sc.nextFloat());
//		문자열 띄어쓰기까지 입력받아라
		System.out.println(sc.nextLine());
	}
}
