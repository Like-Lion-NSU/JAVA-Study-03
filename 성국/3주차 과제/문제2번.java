package likelion;

//import java.util.HashMap;
import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		HashMap cash = new Hashmap;
		
		int X = sc.nextInt();
		int N = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		
		//제한사항을 어디에 어떻게 넣어야 하는지와
		//a와 b인수를 여러개 받을 수 있는 방법을 모르겠습니다ㅠ
		
//		System.out.println(X);
//		System.out.println(N);
//		System.out.printf(a+" "+b);
//		System.out.printf(a+" "+b);
//		System.out.printf(a+" "+b);
//		System.out.printf(a+" "+b);
		if(X == a*b) {
			System.out.println("Yes");
		}else if(X != a*b) {
			System.out.println("No");
		}
	}

}
