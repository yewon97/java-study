package day25;

public class Upcasting1 {
	public static void main(String[] args) {
		Student st1 = new Student("가길동", 13, "게임하기", 3);
		st1.info();
		st1.study();
		
//		업캐스팅 
		Human h1 = new Student("나길동", 17, "롤하기", 3);
		h1.info();
//		h1.study(); -> 사용불가!!
	}

}

class Human {
	String name;
	int age;
	String hobby;
	
	public Human(String name, int age, String hobby) {
		this.name = name;
		this.age = age;
		this.hobby = hobby;
	}
	void info() {
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Hobby : "+hobby);
	}
}

class Student extends Human {
	int grade;
	public Student(String name, int age, String hobby, int grade) {
		super(name, age, hobby);
		this.grade=grade;
	}
	void info() { // 오버라이딩 
		super.info();
		System.out.println("Grade : "+grade);
	}
	void study() {
		System.out.println("공부하기~");
	}
}


