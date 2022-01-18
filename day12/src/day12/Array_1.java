package day12;

public class Array_1 {
	public static void main(String[] args) {
//		3명의 학생 점수를 저장하고 싶다. 100점, 80점, 70점 
//		int score1 = 100;
//		int score2 = 80;
//		int score3 = 70;
//		System.out.println("1 번째 학생의 점수 : "+score1+"점");
//		System.out.println("2 번째 학생의 점수 : "+score2+"점");
//		System.out.println("3 번째 학생의 점수 : "+score3+"점");
		
		int[] scores;
		scores = new int[30];
//		int[] scores = new int[30];
		scores[0] = 100;
		scores[1] = 80;
		scores[2] = 70;
		
//		System.out.println("1 번째 학생의 점수 : "+scores[0]+"점");
//		System.out.println("2 번째 학생의 점수 : "+scores[1]+"점");
//		System.out.println("3 번째 학생의 점수 : "+scores[2]+"점");
		
		for(int i=0; i<3; i++) {
			System.out.println(i+1+" 번째 학생의 점수 : "+scores[i]+"점");
		}
	}

}
