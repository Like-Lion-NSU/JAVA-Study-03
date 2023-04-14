import java.util.*;

public class chtest03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> x = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt() % 42;
            x.add(num);
        }
        System.out.println(x.size());
    }
}
