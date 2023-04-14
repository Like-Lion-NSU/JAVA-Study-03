import java.util.Scanner;

public class FlowEx17 {
    public static void main(String[] args) {
        int num = 0;         // num을 0으로 초기화

        System.out.print("*을 출력할 라인의 수를 입력하세요.>");

        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();   // 입력받은 내용 저장
        num = Integer.parseInt(tmp);      // 입력받은 문자열을 숫자로 변환

        for(int i=0; i<num; i++) {        // for문, i가 num보다 작을 때 i가 증가한다
            for(int j=0;j<=i;j++) {       // for문, j가 i보다 작거나 같을때 j가 증가한다.
                System.out.print("*");
            }
            System.out.println();
        }
    } // main의 끝
}
