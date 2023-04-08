import java.util.Scanner;

public class likeline01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("금액을 입력하세요");
        int ma = sc.nextInt();
        int[] i = {50000, 10000, 1000, 500, 100, 50, 10, 1};
        int j = 0;
        do {
            int z = i[j];
            int x = ma / z;
            ma %= z;

            switch (z) {
                case 50000:
                    System.out.println("오만원권" + x + "장");
                    break;
                case 10000:
                    System.out.println("만원권" + x + "장");
                    break;
                case 1000:
                    System.out.println("천원권" + x + "장");
                    break;
                case 100:
                    System.out.println("백원" + x + "장");
                    break;
                case 50:
                    System.out.println("오십원" + x + "장");
                    break;
                case 10:
                    System.out.println("십원" + x + "장");
                    break;
                case 1:
                    System.out.println("일원" + x + "장");
                    break;
            }
            j++;
        } while (ma > 0 && j < i.length);
    }
}
