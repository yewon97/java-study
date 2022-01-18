package day28;

public class Annoymous3 {
	public static void main(String[] args) {
//		Inter1 it = new Inter1(); -> interface는 객체생성할 수 없다!!
		Inter1 it = new Inter1() {
			@Override
			public void f1() {
				System.out.println("inter1 imple f1()");
			}
		};
		it.f1();
	}
}

interface Inter1 {
	void f1();
}

// 일반클래스 
class Inter1Imple implements Inter1 {
	@Override
	public void f1() {
		
	}
}