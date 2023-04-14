package ju;

import java.util.Scanner;

public class ju01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
      int num=0;
       System.out.println("*을 출력할 라인의 수를 입력하세요.>");
       
       String tmp = sc.nextLine(); //문자열로 숫자를 입력받음
       num=Integer.parseInt(tmp);//String으로 받은 입력을 숫자로 변환
       
       for(int i=0; i<num; i++) { //입력받은 수만큼 반복 
    	   for(int j=0;j<=i;j++) {//j를 초기화 함으로써 *출력횟수를 증가시킴
    		   System.out.print("*");
    	   }
    	   System.out.println();
       }

	}

}
