package baekjoon;

import java.util.Scanner;

public class Hw05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
      int grade = sc.nextInt();
      if(grade>=0&&grade<=100) {
      switch(grade/10) {
      case 10,9:
    	  System.out.println('A');
      break;
      case 8:
    	  System.out.println('B');
    	  break;
      case 7:
    	  System.out.println('C');
    	  break;
      case 6:
    	  System.out.println('D');
    	  break;
      default: 
    	  System.out.println('F');
      }
      }
	}

}
