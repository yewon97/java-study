package day22;

import java.util.Scanner;

public class UserArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		User[] users = new User[4];
		
		for(int i=0; i<4; i++) {
			users[i] = new User();
		}
		
		for(int i=0; i<4; i++) {
			System.out.print("Name : ");
			users[i].name=sc.next();
			System.out.print("Phone : ");
			users[i].phone=sc.next();
			System.out.print("Age : ");
			users[i].age=sc.nextInt();
			System.out.print("Gender : ");
			users[i].gender=sc.next();
		}
		
		for(int i=0; i<4; i++) {
			users[i].info();
		}
	}

}

class User {
	String name;
	String phone;
	int age;
	String gender;
	
	void info() {
		System.out.println("----------info----------");
		System.out.println("Name : "+name);
		System.out.println("Phone : "+phone);
		System.out.println("Age : "+age);
		System.out.println("Gender : "+gender);
	}
}