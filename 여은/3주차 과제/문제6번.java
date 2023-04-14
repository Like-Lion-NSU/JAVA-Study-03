import java.util.Scanner;

public class naa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("숫자를 입력하세요: ");
        int num = scanner.nextInt();

        for (int i=1; i<=9; i++){
            System.out.println(num + "*" + i + "=" + num*i);
        }
    }
}
