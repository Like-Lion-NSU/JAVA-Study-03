import java.util.ArrayList;
import java.util.Scanner;

public class java4_1 {
    private String name;
    private String department;
    private int studentNumber;
    private double Point;

    public java4_1(String name, String department, int studentNumber, double Point) {
        this.name = name;
        this.department = department;
        this.studentNumber = studentNumber;
        this.Point = Point;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public double getPoint() {
        return Point;
    }

    public static void main(String[] args) {
        ArrayList<java4_1> school = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("학생 이름, 학과, 학번, 학점평균 입력하세요.");
        for (int i = 0; i < 4; i++) {

            String name = sc.nextLine();

            String department = sc.nextLine();

            int studentNumber = sc.nextInt();

            double gradePointAverage = sc.nextDouble();

            school.add(new java4_1(name, department, studentNumber, gradePointAverage));
        }

        System.out.println("모든 학생 정보:");

        for (java4_1 java4_1 : school) {
            System.out.println("이름: " + java4_1.getName());
            System.out.println("학과: " + java4_1.getDepartment());
            System.out.println("학번: " + java4_1.getStudentNumber());
            System.out.println("학점 평균: " + java4_1.getPoint());
            System.out.println();
        }
        sc.close();
    }
}
