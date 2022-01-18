package day04;

public class Operator_ch3 {

	public static void main(String[] args) {
		int a = 1;
		System.out.println(a);
		
		a++; // a값 1증가 : 후위형 
		System.out.println(a); // 이 때, a는 2
		System.out.println(++a); // a의 값 1증가, 전위형 : 증가가 먼저 a=3
		System.out.println(a++); // a의 값 1증가, 후위형 : 증가가 나중에 출력 a=3
		System.out.println(a); // 12line에서 a값이 증가가 되었으므로 이 때, a값이 4가 출력됨
	}

}
