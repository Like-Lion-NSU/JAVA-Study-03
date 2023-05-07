import java.util.HashMap;
import java.util.Scanner;

public class point {
    public static void main(String[] args) {
        HashMap<String, Integer> pa = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("이름과 포인트 입력>> ");
            String name = sc.next();
            if (name.equals("그만")) {
                break;
            }
            int po = sc.nextInt();
            if (pa.containsKey(name)) {
                po += pa.get(name);
            }
            pa.put(name, po);

            for (String key : pa.keySet()) {
                System.out.print("(" + key + ", " + pa.get(key) + ") ");
            }
            System.out.println();
        }
    }
}