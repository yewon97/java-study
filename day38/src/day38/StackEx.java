package day38;

import java.util.Stack;

public class StackEx {
	public static void main(String[] args) {
		Stack<String> s = new Stack<String>();
		
//		1. push() : 데이터 삽입 
		s.push("apple");
		s.push("banana");
		s.push("cherry");
		System.out.println(s);
		
//		2. pop() : top의 데이터 삭제 
		System.out.println("pop : "+s.pop());
		System.out.println(s);
		
//		3. peek() : top의 데이터 보기 
		System.out.println("peek : "+s.peek());
		
//		4. search(object)
		System.out.println(s.search("apple"));
		System.out.println(s.search("banana"));
	}
}
