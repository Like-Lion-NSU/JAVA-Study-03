package baekjoon;
import java.util.Scanner;

public class Hw01 {
	  public static void main(String[] args) {
		  
		   Scanner sc = new Scanner(System.in);
		        int[] student = new int[31];

		        for (int i = 1; i < 29; i++) { //1~28개의 번호를 받음
		            int success = sc.nextInt(); //스캐너로 번호를 받아서 success변수에 저장 
		            student[success] = 1;  //입력받은 출석 번호를 인덱스값으로 가지는 배열에 1을 저장
		        }
		        for (int i = 1; i < student.length; i++) { //1번부터 30번까지 값을 늘려가며 비교=>(제출했는지)
		            if (student[i] != 1)  //출석번호를 인덱스로 가지는 배열에 1이 없을시=>과제 제출 안한사람일시
		                System.out.println(i); //번호 출력
		        }
		    }
	  }