import java.util.Scanner;

public class ch03test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int end = 0;

        for (int i = 0; i < b; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            end += A * B;
        }

        if (a == end) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
