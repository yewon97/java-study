package day04;

public class Equality_sign_operator {

	public static void main(String[] args) {
		double a = 3.14; // 실수형 변수 a에 3.14 저장
		double b = 5.15;
		System.out.println(a==b); // a와 b가 같은가?
		System.out.println(a!=b); // a와 b가 다른가?
		
		String c1 = "Hello JAVA!"; // c1 문자열 변수에 "Hello JAVA!" 값 저
		System.out.println(c1 == "Hello JAVA!"); // true
		System.out.println(c1.equals("Hello JAVA!")); // true
		System.out.println(c1.equals("hello java!"));
	}

}
