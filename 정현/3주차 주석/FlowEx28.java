import java.util.*;

public class FlowEx28 {
    public static void main(String[] args) {
        int input =0, answer = 0;            // input와 answer을 0으로 초기화
        
        answer = (int) (Math.random() * 100) + 1;     //1~100사이의 임의의 수를 저장
        Scanner scanner = new Scanner(System.in);
        
        do {
            System.out.print("1과 100사이의 정수를 입력하세요.>");
            input = scanner.nextInt();
            
            if(input > answer) {
                System.out.println("더 작은 수로 다시 시도해보세요.");  // input가 answer보다 클때 실행
            } else if (input < answer) {
                System.out.println("더 큰 수로 다시 시도해보세요.");    // input가 answer보다 작을 때 실행
            }
        } while(input !=answer);        // input과 answer의 값이 같을때까지 반복하고 같을 경우 밑에있는 코드 실행
        
        System.out.println("정답입니다.");
    }
}
