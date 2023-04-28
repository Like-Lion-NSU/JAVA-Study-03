package likelion;

import java.util.ArrayList;
import java.util.Scanner;

//class Student2{
//	String Name;
//	String Sbj;
//	int1 = a;
//	int2 = b;
//
//}
//public Student2() {
//
//}
//
//public Student2(String Name, String Sbj, int a, int b) {
//
//}

public class Student1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <String> Name = new ArrayList<>();
        ArrayList <String> Sbj = new ArrayList<>();
        ArrayList <Integer> Gra = new ArrayList<>();
        ArrayList <Double> GraAvg = new ArrayList<>();


        Name.add("황기태");
        Sbj.add("모바일");
        Gra.add(1);
        GraAvg.add(4.1);

        Name.add("이재문");
        Sbj.add("안드로이드");
        Gra.add(2);
        GraAvg.add(3.9);

        Name.add("김남윤");
        Sbj.add("웹공학");
        Gra.add(3);
        GraAvg.add(3.5);

        Name.add("최찬미");
        Sbj.add("빅데이터");
        Gra.add(4);
        GraAvg.add(4.25);

        if(sc.nextLine() == "황기태") {
            System.out.println("이름:" + Name.get(0));
            System.out.println("학과:" + Sbj.get(0));
            System.out.println("학번:" + Gra.get(0));
            System.out.println("학점평균:" + GraAvg.get(0));

        } else if (sc.nextLine() == "이재문"){
            System.out.println("이름:" + Name.get(1));
            System.out.println("학과:" + Sbj.get(1));
            System.out.println("학번:" + Gra.get(1));
            System.out.println("학점평균:" + GraAvg.get(1));

        } else if (sc.nextLine() == "김남윤") {
            System.out.println("이름:" + Name.get(2));
            System.out.println("학과:" + Sbj.get(2));
            System.out.println("학번:" + Gra.get(2));
            System.out.println("학점평균:" + GraAvg.get(2));

        } else if (sc.nextLine() == "최찬미") {
            System.out.println("이름:" + Name.get(3));
            System.out.println("학과:" + Sbj.get(3));
            System.out.println("학번:" + Gra.get(3));
            System.out.println("학점평균:" + GraAvg.get(3));

            
        }

    }

}
