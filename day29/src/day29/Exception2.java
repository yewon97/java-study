package day29;

public class Exception2 {
	public static void main(String[] args) {
		try {
			int[] a = {2,0,0}; // 산술 처리 오류
//			int[] a = {2,0}; 배열 길이 오류 
			int b = 4;
			int c = b/a[2]; // 배열의 index가 [0], [1]
			System.out.println(c);
			
		} 
		catch(ArithmeticException e) {
			System.out.println("산술 오류 발생");
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 길이 오류 발생");
		}
		System.out.println("예외처리 공부 중");
	}

}
