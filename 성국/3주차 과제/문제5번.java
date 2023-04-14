package likelion;

import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		char grade =' ';
		// 0<= score <= 100; 점수에 조건을 주는 방법을 모르겠습니다
		switch(score/10){
			case 10:
			case 9 :
				grade = 'A';
				break;
			case 8 :
			grade = 'B';
			break;
			case 7 :
				grade='C';
				break;
			default :
				grade = 'f';
		}
		System.out.println(grade);
	}

}
