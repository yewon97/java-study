package day02;

public class Day02Ex {

	public static void main(String[] args) {
//		줄바꿈 없이 한줄로 출력
		System.out.print("문자열");  
		System.out.print("A"); //문자
		System.out.print(100); //정수
		System.out.print(3.14); //실수값 
		
//		줄바꿈 있이 여러줄로 출력 
//		System.out.println("문자열");  
		System.out.println("A"); //문자
		System.out.println(100); //정수
		System.out.println(3.14); //실수값 
//		sysout 커서 뒤에 command+space 누르면 해당메서드 자동완성
		
//		format: 형식지정자 -> "%알파"
//		System.out.printf("형식지정자", 출력값);
		System.out.printf("%s", "문자열값"); //문자열:String
		System.out.printf("%c", 'A'); //문자형:Character
		System.out.printf("%c", 65); //문자형:Character (아스키코드값)
//		아스키코드값: 문자에 숫자를 부여함으로써, 각 문자를 숫자로 저장할 수 있다. 문자에 해당하는 숫자 값
//		A : 65 / a : 97
		System.out.printf("%c", 97);
		System.out.printf("%d", 100); //정수값: Decimal
		System.out.printf("%f", 3.14); //실수값: Float		                                              
	}

}
