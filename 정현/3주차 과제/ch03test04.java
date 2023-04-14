import java.util.Scanner;

public class ch03test04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("A: ");
        int A = sc.nextInt();
        System.out.print("B: ");
        int B = sc.nextInt();

        if (A > B) {
            System.out.println(">");
        } else if (A < B) {
            System.out.println("<");
        } else {
            System.out.println("==");
        }
    }
}
 
