import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test3_412 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> name = new ArrayList();
        int index=0;

        System.out.println("부원 5명의 이름을 입력해주세요.>> ");
        name.add(sc.nextLine());
        name.add(sc.nextLine());
        name.add(sc.nextLine());
        name.add(sc.nextLine());
        name.add(sc.nextLine());

        for(int i = 0 ; i <= 4 ; i++) {
            String names= name.get(i); // 배열의 값(이름)을 변수에 저장
            if (names.startsWith("김")) { // 만약 "김"으로 시작한다면,
                index++; // 인덱스는 +1
                System.out.printf("[%s]\t",name.get(i)); // 이름이 출력됨
            }
        }
        System.out.println();
        System.out.println("김씨 성을 가진 분은 모두 " + index + "명 입니다.");
    }
}

