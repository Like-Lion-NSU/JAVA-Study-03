public class test_1 {
    public static void main(String[] args) {
        String name = "ja" + "va";
        String str = name + 8.0;

        System.out.println(name);
        System.out.println(str);
        System.out.println(7 + " "); // 7이 String 아니므로 뱐환 후 계산 , "7 "
        System.out.println(" " + 7); // 7이 String 아니므로 뱐환 후 계산 , " 7"
        System.out.println(7 + ""); // 7이 String 아니므로 뱐환 후 계산 , "7"
        System.out.println("" + 7); // 7이 String 아니므로 뱐환 후 계산 , "7"
        System.out.println("" + ""); 
        System.out.println(7 + 7 + ""); // 14 + "" -> "14" + '' = "14"  // 왼쪽에서 오른쪽 방향으로 연산을 수행하기 때문에 
        System.out.println("" + 7 + 7); // "7" + 7 -> "7" + "7" = "77"  // 결합 순서에 따라 결과값이 달라진다
    } 
}


public class test_2 {
    public static void main(String[] args) {
        int x = 10 , y =5; // int 타입 x와 y에게 각각 10, 5를 저장
        System.out.println("x=" + x); 
        System.out.println("y=" + y);

        int tmp = x; // int 타입 tmp인 임시저장소 생성 후 x의 값을 tmp에 저장
        x = y; // 빈 공간인 x에 y의 값을 저장
        y = tmp; // 빈 공간인 y에 tmp(=x)의 값을 저장
        System.out.println("x="+x); // x는 y의 값을 갖게 됨
        System.out.println("y="+y); // y는 x의 값을 갖게 
    }
}

public class test_3 {
    public static void main(String[] args) {
        int x,y; // int 타입 x,y를 서언

        x = y = 3; // 대입연산자 "="는 결합규칙에 의해 오른쪽에서 왼쪽으로 연산됨, y=3 먼저 수행 후 x=3 수행 
        System.out.println("x=" + x);
        System.out.println("y=" + y);
    }
}

public class test_4 {
    public static void main(String[] args) {
        int i =5, j =0;

        j = i++; // 후위진감 이므로 j = 5 (출력 후 1 증가)
        System.out.println("j=i++; 실헹 후 i=" + i +" , j=" +j);

        i = 5;
        j = 0;

        j = ++i; // 전위진감 이므로 j = 6 (1 증가 후 출력)
        System.out.println("j=++i; 실행 후, i=" + i +", j="+j);
    }
}

