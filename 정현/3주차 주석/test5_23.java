import java.util.Scanner;

public class test5_23 {
    public static void main(String[] args) {
        String[][] words = {
                {"chair","의자"},          //words[0] [0], words[0][1]
                {"computer","컴퓨터"},     //words[1] [0], words[1][1]
                {"integer","정수"}         //words[2] [0], words[2][1]
        };

        Scanner scanner = new Scanner(System.in);

        for(int i=0; i<words.length; i++) {              // i가 배열의 길이보다 작을 때 i 증가
            System.out.printf("Q%d. %s의 뜻은?", i+i, words[i][0]);

            String tmp = scanner.nextLine();

            if(tmp.equals(words[i][1])) {          // words 답과 같으면 밑에 코드 실행
                System.out.printf("정답입니다.%n%n");
            }else {
                System.out.printf("틀렸습니다. 정답은 %s입니다.%n%n", words[i][1]);  // 답이 틀리면 코드 실행
            }
        }
    }
}
