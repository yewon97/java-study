package day22;

public class AnimalArray {
	public static void main(String[] args) {
		Animal[] animals = new Animal[3];
		
//		animals[0] = new Animal();
//		animals[1] = new Animal();
//		animals[2] = new Animal();
		
		for(int i=0; i<3; i++) {
			animals[i] = new Animal(); 
		}
		
		animals[0].kind = "고양이";
		animals[0].name = "나르";
		animals[0].age = 1;
		
		animals[1].kind = "강아지";
		animals[1].name = "초코";
		animals[1].age = 3;
		
		animals[2].kind = "고양이";
		animals[2].name = "니코";
		animals[2].age = 1;
		
		for(int i=0; i<3; i++) {
			animals[i].info(); 
		}
		
		
	}

}

class Animal {
	String kind;
	String name;
	int age;
	void info() {
		System.out.println("Kind : "+kind);
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
	}
}