package baekjoon;

import java.util.Scanner;

public class Hw06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int mul = sc.nextInt();  //입력받을 구구단 단계
		
		if(mul>0&&mul<10) { //1단부터 9단계까지
		for(int i=1; i<10; i++) {//1부터 9까지 곱함
			int mult=mul*i; //
			System.out.println(mul+" * "+i+" = "+mult);//출력
		}		
		
	}
	}
}
