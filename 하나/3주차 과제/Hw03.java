package baekjoon;
import java.util.Scanner;
import java.util.Arrays;

public class Hw03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] num = new int[10]; //나머지값 저장할 배열
		int count =0;  //나머지가 서로 다른 값일때 카운트 하기 위한 변수
		boolean check = false;//같은 값인지 확인하기 위한 boolean 변수
		
		for(int i=0; i<num.length;i++) { //배열 크기만큼 반복
			num[i]=sc.nextInt()%42; //입력받은 수를 42로 나눈 후 나머지 값을 배열에 저장
		
		
		for(int j=0; j<i; j++) {//j값을 증가시키면서 배열에 들어있는 값들 하나씩 비교
			
			if(num[i]==num[j]) {//저장된 나머지값이 다를 경우 check를 true로 변경
					check=true;
				}else {
					check=false;
			}
		
		}
		if(check==false) { //check가 false일 경우 즉, 배열에 있는 값이 다를경우 카운트 증가
			count++;
		}
		}
		
		System.out.println(count); 
	}	

}
