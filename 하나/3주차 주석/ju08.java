package ju;
//객체지향파트


class Tv{//tv클래스
	//멤버변수들
	String color;
	boolean power;
	int channel;
	
	void power() {power = ! power;}//전원 상태 변경시켜주는 매서드
	void channelUp(){++channel;}//채널 증가시키는 메서드
	void channelDown() {--channel;} //채널 감소시키는 메서드
}

public class ju08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv[] tvArr= new Tv[3]; //tv 객체를 담을 수 있는 객체배열 생성
		
		for(int i=0; i<tvArr.length;i++) {//tv 객체를 생성
			tvArr[i]=new Tv();
			tvArr[i].channel=i+10; //channel에 +10을 해서 기본 채널 값을 10 이상으로
		}
		for(int i=0; i<tvArr.length;i++) {
			tvArr[i].channelUp();//채널값 증가시키고 
			System.out.printf("tvArr[%d].channel=%d%n",i,tvArr[i].channel); //채널 출력
		}

	}

}
