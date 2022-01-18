package day21;

public class SportMain {
	public static void main(String[] args) {
		Member member1 = new Member();
		Member member2 = new Member();
		Member member3 = new Member();
		Member member4 = new Member();
		
		member1.centerName="Hello";
		member1.name = "김철수";
		member1.age = 32;
		member1.gender = "남자";
		
		member2.centerName="Hello";
		member2.name = "김민호";
		member2.age = 28;
		member2.gender = "남자";
		
		member3.centerName="Hello";
		member3.name = "이영희";
		member3.age = 24;
		member3.gender = "여자";
		
		member4.centerName="Hello";
		member4.name = "고석천";
		member4.age = 32;
		member4.gender = "남자";
		
		Member.centerName="Bye";
		
		System.out.println("Member1----------");
		member1.info();
		System.out.println("Member2----------");
		member2.info();
		System.out.println("Member3----------");
		member3.info();
		System.out.println("Member4----------");
		member4.info();
	}

}

class Member {
	static String centerName; // 클래스 변수 
	String name;
	int age;
	String gender;
	
	void info() {
		System.out.println("center Name : "+centerName);
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Gender : "+gender);
	}
}