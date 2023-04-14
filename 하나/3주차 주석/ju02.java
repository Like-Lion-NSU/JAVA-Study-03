package ju;
import java.util.Scanner;

public class ju02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input=0, answer=0;
		answer=(int)(Math.random()*100+1);//0인 경우가 있어어 +1을 해줌
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("1과 100사이의 정수를 입력하세요.>");
			input = sc.nextInt();
			//입력받은 값이 랜덤 값이랑 다를때는 비교하며 무한 반복
			if(input>answer) {
				System.out.println("더 작은 수로 다시 시도해보세요");
			}else if (input < answer) {
					System.out.println("더 큰 수로 다시 시도해보세요.");
				}
			
		}while(input!=answer);//입력받은값과 랜덤으로 추출한 값이 같을때만 프로그램 종료
		System.out.println("정답입니다.");
	}

}
