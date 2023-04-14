package ju;

public class ju05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [][]score= { //점수 저장해놓은 배열
		{100,100,100},{20,20,20},
		{30,30,30},{40,40,40},
		{50,50,50}};

//과목별 총점을 저장하기 위한 변수들
int kT=0, eT=0, mT=0;

System.out.println("번호  국어  영어  수학   총점   평균");
System.out.println("================================");

for(int i=0; i<score.length; i++) { //저장해놓은 배열 크기만큼 반복
	int sum =0; //총점 변수
	float avg =0.0f; //평균은 소수점이 있기 때문에 실수형으로 변수 선언
	
	kT+=score[i][0]; //순서대로 국어, 영어, 수학 점수를 배열에서 꺼내옴
	eT+=score[i][1];
	mT+=score[i][2];
	System.out.printf("%3d",i+1); //번호 출력, i가 0이기 때문에 +1
	
	for(int j=0; j<score[i].length; j++) {//총점구하는 로직
		sum+= score[i][j];  //점수를 하나씩 꺼내와서 저장하는 걸 반복
		System.out.printf("%5d", score[i][j]); //각 과목 점수들을 출력
		
	}
	avg=sum/(float)score[i].length; //평균 계산
	System.out.printf("%5d %5.1f%n",sum,avg); //총점, 평균 출력
}
System.out.println("================================");
System.out.printf("총점:  %3d %4d %4d%n", kT, eT, mT);//예쁘게 출력~
}
	}


