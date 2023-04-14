package baekjoon;
import java.util.Scanner;

public class Hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
          int price=sc.nextInt();//최종 영수증 금액 입력
          int num=sc.nextInt(); //최종 물건 개수 입력
          int sum=0;  //값을 더해 저장할 변수 sum
          
          int[] Thing=new int[num];//입력받은 최종 물건 개수만큼 금액 배열 생성
          int [] num2= new int[num];  //입력받은 최종 물건 개수만큼 각 물건 개수 배열 생성
        
          for(int i=0; i<num;i++) {//구입한 물건 개수만큼 물건 금액과 개수 입력받음 
        	   Thing[i]=sc.nextInt();  //구입한 물건 금액
        	   num2[i]=sc.nextInt();//물건 각각의 개수 입력 받아 저장
          }
          
          for(int i=0; i<num; i++) { //구입한 물건 개수만큼 반복
              sum += Thing[i]*num2[i];//금액과 개수를 곱한값을 sum에 저장
          }
          
          if(sum==price) { //금액*개수를 다 더한값이 영수증 금액과 같다면
        	  System.out.println("Yes"); //yes출력
          }else {//영수증 금액과 다르다면
        	  System.out.println("No");//no출력
          }

          
	
	}

}
