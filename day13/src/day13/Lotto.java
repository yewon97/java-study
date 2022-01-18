package day13;

import java.util.*; // java.util 패키지에 있는 모든 클래스 import해~!

public class Lotto {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		int[] lottoAr = new int[6];
		int[] userAr = new int[6];
		int bonus, bonusUser;
		int count = 0; // 0이라고 초기화 시킬꺼임. 1개 맞으면 +1, 2개 맞으면 +2
		
//		로또배열 6자리에 1~45의 랜덤값을 저
		for(int i=0; i<6; i++) {
			lottoAr[i] = random.nextInt(45)+1; // 0~44 -> 1~45			
		}
//		Bonus = random
		bonus=random.nextInt(45)+1;
		
		System.out.println("Lotto : "+Arrays.toString(lottoAr)+"Bonus : "+bonus);
		
//		사용자에게 6자리에 들어갈 숫자와 보너스를 입력받음
		System.out.print("숫자 6개 입력 : ");
		for(int i=0; i<6; i++) {
			userAr[i]=sc.nextInt();
		}
		System.out.print("보너스 값 입력 : ");
		bonusUser=sc.nextInt();
		
		System.out.println("User : "+Arrays.toString(userAr)+"Bonus : "+bonusUser);
		
//		로또배열의 값과 사용자 배열의 값 중 같은 값이 몇개 있는지 카운팅!
		for(int j=0; j<6; j++) {
			for(int i=0; i<6; i++) {
				if(lottoAr[j]==userAr[i]) {
					count++;
				}
			}
		}
		
		System.out.println("총 맞춘 갯수 : "+count);
//		count의 갯수에 따라 등수 정하기!
		if(count==6) {
			System.out.println("축하드립니다! 1등입니다.");
		}
		
		else if(count==5) {
			if(bonus==bonusUser) {
				System.out.println("축하드립니다! 2등입니다.");
			}
			else {
				System.out.println("축하드립니다! 3등입니다.");
			}
		}
		else if(count==4) {
			System.out.println("축하드립니다. 4등입니다.");
		}
		else if(count==3) {
			System.out.println("축하드립니다. 5등입니다.");
		}
		else {
			System.out.println("아쉽지만... 다음기회에ㅠ~");
		}
	}

}
