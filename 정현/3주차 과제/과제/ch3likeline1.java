import java.util.ArrayList;
import java.util.Scanner;

public class ch3likeline1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        int j = 0;

        System.out.println("부원 5명의 이름을 입력해주세요.>>");
        for (int i = 0; i < 5; i++) {
            String name = sc.nextLine();
            names.add(name);
        }

        String end = names.get(0).split(" ")[0];
        boolean first = true;
        for (String name : names) {
            String last = name.split(" ")[0];
            if (last.equals(end)) {
                if (!first) {
                    System.out.print(" ");
                }
                System.out.print("[" + name + "]");
                j++;
                first = false;
            }
        }
        System.out.println("\n나와 성이 같은 사람은 총 " + j + "명입니다.");
    }
}
