package ju;
import java.util.Scanner;

public class ju06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String [][] words= {
		{"chair","의자"},
		{"computer","컴퓨터"},{"integer","정수"}
};
Scanner sc= new Scanner(System.in);

for(int i=0; i<words.length;i++) {
	System.out.printf("Q%d. %s의 뜻은?", i+1, words[i][0]); //배열에 저장된 값을 하나씩 꺼내와서 뜻을 물어봄
	String tmp = sc.nextLine();
	
	if(tmp.equals(words[i][1])){ //equals를 이용해서 입력받은 값과 배열에 저장되어 있는 값을 비교
		System.out.printf("정답입니다.%n%n");//정답일시
	}else {
		System.out.printf("틀렸습니다. 정답은 %s입니다. %n%n", words[i][1]);//틀렸을시 
	}
}

	}

}
