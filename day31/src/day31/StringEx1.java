package day31;

public class StringEx1 {
	public static void main(String[] args) {
		String str = "hello";
		
//		concat 
		System.out.println(str.concat(" world!"));
//		문자열 자체가 변경 된 것은 아님 -> 반환하는 문자열이 바뀐것 뿐 
		System.out.println(str);
		
//		substring(시작위치, 끝위치) : 시작 위치 ~ 끝위치-1 까지 가져옴 
		System.out.println(str.substring(2,4));
//		시작위치만 들어가면 시작위치부터 ~ 끝까지 가져옴 
		System.out.println(str.substring(2));
		
//		length()
		System.out.println(str.length());
		
//		toUpperCase, toLowerCase
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println("Test".toLowerCase());
		
		String str1 = "Hello World!";
		
		System.out.println(str1.substring(4, 9));
		System.out.println(str1.substring(5));
		System.out.println(str1.length());
		
//		charAt(인덱스), indexOf(문자열), equals(문자열)
		System.out.println(str.charAt(1));
		
		System.out.println(str.indexOf("o"));
		System.out.println("hello world".indexOf("WORLD")); // -1이 나옴 : 찾지 못함 - 대소문자구분 
		
		System.out.println(str.equals("hello"));
//		문자의 대소문자 구별 
		System.out.println(str.equals("HELLO"));

//		trim(), replace, replaceAll
		System.out.println(" test ".trim());
		System.out.println("hello world".replace('l', 'L'));
		System.out.println("hello world".replaceAll("hello", "bye"));
		
	}
}
