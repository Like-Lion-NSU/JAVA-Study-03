import java.util.Scanner;

public class likelion_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("금액을 입력하시오 >> ");
        int money = sc.nextInt(); // Scanner 클래스를 이용해 정수로 된 돈 입력받기

        int na = 0; // 나머지 - 아래 단위로 나눔
        int mo = 0; // 몫 - 지폐의 수


        mo = money / 50000; // 처음 나누는 값을 50000원으로 나눈 몫 저장
        na = money % 50000; // 처음 나누는 값을 50000원으로 나눈 나머지 저장
        if (money/50000>=0) // 만약 50000원권이 0개 이상이면 출력, 출력창에 0개도 보여주기 위해서 0으로 함
            System.out.println("오만원권 " + mo +"장");

        mo = na/10000; //  위에서 나눈 값에서 나온 나머지를 10000원으로 나눠준 값이 몫
        na = na%10000; //  위에서 나눈 값에서 나온 나머지를 10000원으로 나눈 나머지 몫
        if (mo>=0)
            System.out.println("만원권 " + mo +"장");

        mo = na/1000;
        na = na%1000;
        if (mo>=0)
            System.out.println("천원권 " + mo +"장");

        mo = na/100;
        na = na%100;
        if (mo>=0)
            System.out.println("백원 " + mo +"개");

        mo = na/50;
        na = na%50;
        if (mo>=0)
            System.out.println("오십원 " + mo +"개");

        mo = na/10;
        na = na%10;
        if (mo>=0)
            System.out.println("십원 " + mo +"개");

        mo = na/1;
        na = na%1;
        if (mo>=0)
            System.out.println("일원 " + mo +"개");
    }
}
