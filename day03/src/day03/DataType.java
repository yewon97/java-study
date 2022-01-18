package day03;

public class DataType {

	public static void main(String[] args) {
		int a= 65;
		float f= a; // 자동형변환(묵시적형변환)
		System.out.println(f);
		
		char c= (char)a; // 강제형변환(명시적형변환)
		System.out.println(c);
	}

}
