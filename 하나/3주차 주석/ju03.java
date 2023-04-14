package ju;

public class ju03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=100; i++) {//숫자 1부터 100까지 반복
			System.out.printf("i=%d ",i);
			
			int tmp = i;
			
			do {
				if(tmp%3==0&&tmp%10!=0) {  //tmp가 3의 배수인지 확인
					System.out.print("짝");
				}
			}while((tmp/=10)!=0);//3의 배수 아닐경우
				System.out.println();
		}
	}

}

