## 주석🔥
### 1번 문제

package likelion;
import java.util.*;
public class FlowEx {

	public static void main(String[] args) {
		int num = 0; //num이라는 상수 생성
		
		System.out.print("*을 출력할 라인의 수를 입력하세요.>");
		//*을 출력할 라인의 수를 입력하세요.>라는 문장 출력
		Scanner scanner = new Scanner(System.in); // 스캐너에 입력되는 값 저장
		String tmp = scanner.nextLine();// 화면을 통해 입력받은 문장을 tmp에 저장
		num = Integer.parseInt(tmp); // 입력받은 문자열 (tmp)을 숫자로 변환
		
		for(int i = 0;i<num;i++) { // 초기화, 조건식, 증감식 작성
			for(int j=0;j<i;j++) { // for문 안에 for문 작성 j가 0일 때 모르겠습니다
				System.out.print("*");
			}
			System.out.println();
		}
			
		
	}// main의 끝 

}

##2번문제

package likelion;
import java.util.Scanner;

class FlowEx28 {

	public static void main(String[] args) {
		int input = 0 , answer = 0; // 값이 0인 input과 answer이라는 상수 생성
		
		answer = (int)(Math.random() * 100) + 1; 
		// 1~100사이의 임의의 수를 저장 근데 +1은 왜 하는지 모르겠습니다
		Scanner scanner = new Scanner(System.in);  //스캐너에 입력된 값 저장
		
	do {
		System.out.print("1과 100사이의 정수를 입력하세요.>"); // 문장 출력
		input = scanner.nextInt(); // input에 입력된 문장 저장
		
		if(input > answer) { //input이 answer보다 클 때 
			System.out.println("더 작은 수로 다시 시도해보세요."); //출력
		}else if (input < answer) { //answer이 input보다 크다면
			System.out.println("더 큰 수로 다시 시도해보세요.");
		}
	} while(input!= answer);
	
	System.out.println("정답입니다.");	
		
	}

}

##3번문제

package likelion;

public class FlowEx29 {

	public static void main(String[] args) {
		for(int i=1; i<=100; i++) { // i = 1로 초기화하며 i가 100과 똑같아 질 때까지 1씩 더한다
			System.out.printf("i=%d ", i); //i를 인수로 받아서 i = %d형식으로 출력
			
			int tmp = i;
			
			do {
				//tmp% 10이 3의 배수인지 확인(0 제외)
				if(tmp%10%3==0 && tmp%10!=0) 
		//tmp를 10으로 나눈 나머지에 3으로 나눈 나머지가 0과 같고, tmp를 10으로 나눈 나머지가 0과 같지 않다면
					System.out.print("짝");//짝이라고 출력
				//tmp /= 10은 tmp = tmp / 10과 동일
			} while((tmp/=10)!=0); 
			System.out.println();
			//결과값 출력
		}
	}//main

}

##4번문제

	package likelion;

public class ArrayEx13 {

	public static void main(String[] args) {
		char[] hex = {'C', 'A', 'F', 'E'};
			
		String[] binary = { "0000", "0001", "0010", "0011"
						   ,"0100", "0101", "0110", "0111"
						   ,"1000", "1001", "1010", "1011"
						   ,"1100", "1101", "1110", "1111" };
		String result="";
		
		for (int i = 0; i< hex.length; i++) {
			if(hex[i] >= '0' && hex[i] <='9') {
				result +=binary[hex[i]-'0']; //'8'-'0'의 결과는 8이다.
			}else { //A~F이면
				result +=binary[hex[i]-'A'+10]; //'C'-'A'의 결과는 2
			}
		}
		//String(char[] value)
		System.out.println("hex:"+ new String(hex)); //결과값 출력
		System.out.println("binarty:"+result);		//binary: result라는 결과값 출력	

	}
	
}

##5번문제

package likelion;

public class ArrayEx19 {

	public static void main(String[] args) {
		int[][]score = { 
				//int타입의 score 배열 생성
				{100, 100, 100}
				,{20, 20, 20}
				,{30, 30, 30}
				,{40, 40, 40}
				,{50, 50, 50}
		};
		//과목별 총점
		int korTotal = 0, engTotal = 0, mathTotal = 0;
		System.out.println("번호 국어 영어 수학 총점 평균");
		System.out.println("========================");
		
		for(int i=0; i < score.length;i++) {
			int sum = 0; 		//개인별 총점
			float avg = 0.0f;	//개인별 평균
			
			korTotal += score[i][0]; //korTotal은 0번째 정렬
			engTotal += score[i][1]; //engTotal은 1번째 정렬
			mathTotal += score[i][2]; //mathTotal은 2번째 정렬
			System.out.printf("%3d", i+1);// i+1을 인수로 받아서 3으로 나눈 나머지 출력
			
			for(int j=0; j < score[i].length;j++) {
				sum += score[i][j];
				System.out.printf("%5d",score[i][j]);
			}
			avg = sum/ (float)score[i].length; //평균계산
			System.out.printf("%5d %5.1f%n", sum, avg);
		}
		System.out.println("========================");
		System.out.printf("총점:%3d %4d %4d%n",korTotal,engTotal,mathTotal);
	}

		System.out.println("=
}

##6번문제

package likelion;

import java.util.Scanner;

public class MultiArrEx4 {

	public static void main(String[] args) {
		String[][] words= {
				{"chair","의자"},		//words[0][0], words[0][1]
				{"computer","컴퓨터"},//words[1][0], words[1][1]
				{"integer","정수"}	//words[2][0], words[2][1]
		};
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0;i<words.length;i++) {
			System.out.printf("Q%d. %s의 뜻은?", i+1, words[i][0]);
			
			String tmp = scanner.nextLine();
			
			if(tmp.equals(words[i][1])) { // tmp가 word[i][1]과 같다면
				System.out.printf("정답입니다.%n%n"); //정답입니다 출력 
			}else {
				System.out.printf("틀렸습니다. 정답은 %s입니다.%n%n",words[i][1]);
			}//아니라면 인수를 [i]와[1]로받는 틀렸습니다. 정답은 %s입니다.%n%n 출력
		}//for
	}//main의 끝

}
