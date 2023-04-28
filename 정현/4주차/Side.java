import java.util.ArrayList;
import java.util.Scanner;

class Stu {
    private String name;
    private String eat;
    private String number;
    private double point;
    public Stu(String name, String eat, String number, double point) {
        this.name = name;
        this.eat = eat;
        this.number = number;
        this.point = point;
    }
    public String get_name() {
        return name;
    }
    public String get_eat() {
        return eat;
    }
    public String get_number() {
        return number;
    }
    public double get_point() {
        return point;
    }
    public void find_student(String name) {
        if(name.equals(this.name)) {
            System.out.println(this.name+", "+this.eat+", "+this.number+", "+this.point);
        }
    }
}
public class Side {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("학생 이름, 학과, 학번, 학점평균 입력하세요.");

        ArrayList<Student> work = new ArrayList<>();

        for(int i=0; i<4; i++) {
            System.out.println(">> ");
            String name = sc.nextLine();
            String eat = sc.nextLine();
            int number = sc.nextInt();
            double point = sc.nextDouble();
        }


        
    }
}
