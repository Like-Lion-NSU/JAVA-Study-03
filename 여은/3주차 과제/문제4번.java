import java.util.Scanner;

public class naa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b ;

        a = sc.nextInt();
        b = sc.nextInt();

        if(a>b) {
            System.out.println(">");
        } else if (a<b) {
            System.out.println("<");
        } else {
            System.out.println("==");
        }

    }
}
