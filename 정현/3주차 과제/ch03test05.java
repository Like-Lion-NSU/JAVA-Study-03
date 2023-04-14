import java.util.Scanner;

public class ch03test05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        if (i >= 90 && i <= 100) {
            System.out.println("A");
        } else if (i >= 80 && i <= 89) {
            System.out.println("B");
        } else if (i >= 70 && i <= 79) {
            System.out.println("C");
        } else if (i >= 60 && i <= 69) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
