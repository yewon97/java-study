package day28;

public class Annoymous4 {
	public static void main(String[] args) {
//		Abstract ab = new Abstract(); -> 추상메서드 객체 생성 안됨!!
		Abstract ab = new Abstract() {
			@Override
			void f2() {
				System.out.println("Abstract extends f2()");
			}
		};
		ab.f2();
	}
} 

abstract class Abstract {
	abstract void f2();
}