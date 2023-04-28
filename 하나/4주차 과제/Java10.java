package ju;

import java.util.ArrayList;
import java.util.Scanner;

class Student {
	String name;
	String major;
	int num;
	double grade;
	
	Student(){}
	
	   Student(String name, String major, int num, double grade){
		this.name = name;
		this.major = major;
		this.num = num;
		this.grade = grade;
	}
	
	public String getName() {
		 return this.name;
	}

	void showInfo() {
		 System.out.println("-------------------------------"+"\n"
	             +"이름: "+this.name+"\n"
	             +"학과: "+ this.major+"\n"
				 +"학번: "+this.num+"\n"
	             +"학점평균: "+this.grade);	
	}
	void showInfo2() {
		 System.out.println(this.name+", "+this.major+", "+this.num+","+this.grade);
	}
}

public class Java10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
		ArrayList<Student> std = new ArrayList<>(); //학생의 정보를 저장할 ArrayList 생성
		
		 System.out.println("학생 이름, 학과, 학번, 학점평균 입력하세요.");
		
		 for(int i=0;i<4; i++ ) {
		System.out.print(">> ");
		
		String n = sc.next();
		
		String m = sc.next();
		
		int num =sc.nextInt();
		
		double g = sc.nextDouble();
		
		std.add(new Student(n,m,num,g));
		}
		
		for (Student s:std) { 
			s.showInfo();
		}
		
           for(int i =0 ; i<std.size();i++) {
        	   
           System.out.print("학생 이름 >> ");
       		String name= sc.next(); //이름 검색
       		
       		for(int j =0; j<4;j++) {      			
			if (name.equals(std.get(j).getName())) { 
				std.get(j).showInfo2();
				break;
			}
			else if (name.equals("그만")) {
				System.exit(0);
			}
       		}
			
        }
	}

}
