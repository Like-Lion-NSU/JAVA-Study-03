import java.util.Scanner;

public class ch3test01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] Numbers = new int[30]; // 출석번호를 저장하는 배열
        boolean[] end = new boolean[30]; // 제출 여부를 저장하는 배열

        for (int i = 0; i < Numbers.length; i++) {
            Numbers[i] = i + 1;
        }

        System.out.println("출석번호를 입력하세요.");

        for (int i = 0; i < 28; i++) {
            int Number = scanner.nextInt();
            end[Number - 1] = true;
        }

        scanner.close();

        System.out.print("제출하지 않은 학생의 출석번호: ");

        for (int i = 0; i < end.length; i++) {
            if (!end[i]) {
                System.out.print(Numbers[i] + " ");
            }
        }
    }
}
