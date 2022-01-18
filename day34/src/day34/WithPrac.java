package day34;

import java.time.LocalDate;

public class WithPrac {
	public static void main(String[] args) {
		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		
		LocalDate new_ld1 = ld.withYear(1999).withMonth(8).withDayOfYear(23);
		LocalDate new_ld2 = ld.withYear(1999).withMonth(8).withDayOfMonth(23);
		LocalDate new_ld3 = ld.withYear(1999).withMonth(8).withDayOfYear(56);
		
//		연산순서가 왼 -> 오 : 년도부터 23일 지난
		System.out.println(new_ld1);
		System.out.println(new_ld2);
		System.out.println(new_ld3); // 1999-02-25 나옴 
	}

}
