package day31;

public class StringBufferEx {
	public static void main(String[] args) {
		String str = "test";
		StringBuffer buffer = new StringBuffer("test");
		
		str.replace('t', 'T');
//		immutable 객체 
		System.out.println(str); // test로 출력됨
		
		buffer.replace(1, 3, "ES");
//		mutable 객체 
		System.out.println(buffer);
	}
}
