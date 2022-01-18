package day05;

public class Logic_operator {

	public static void main(String[] args) {
		boolean a = true; // 논리형 a변수에 true값 저장 
		boolean b = false; 
		boolean c = true; 
		
		System.out.println(a&&b); // a값과 b값이 모두 참일 때 -> 참 
		System.out.println(a&&c);
		
		System.out.println((2<4)&&(4<5)); // true&&true = true
		
		System.out.println(a||b); // true||false = true
		System.out.println(a||c); // true||true = true
		System.out.println(b||b); // false||false = false
		
		System.out.println(!a);
		System.out.println(!b);
	}

}
