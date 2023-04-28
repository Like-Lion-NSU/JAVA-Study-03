package ju;

class Car123{
	String color;
	int door;
	
	void drive() { //운전하는 기능 메서드
	System.out.println("drive, Brrr~");	
	}
	void stop() {  //멈추는 기능 메서드
		System.out.println("stop!!");
	}
}

class FireEngine extends Car123{  //Car클래스를 상속받기 때문에 운전하는 기능과 멈추는 기능, Car의 멤버변수들 또한 사용 가능
	void water() { //물뿌리는 기능 메서드
		System.out.println("watter!!");
	}
}
public class Java12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car123 car =null; //null
		FireEngine fe = new FireEngine(); //객체 생성
		FireEngine fe2 = null; //null 
		
		fe.water(); //fe의 water 메서드 호출
		car = fe; //형변환 생략, 객체 초기화
	//	car.water();  //Car타입으로 생생된 참조변수 car는 자손 클래스에 있는 water메서드를 호출하지 못함
		fe2 = (FireEngine)car; //car를 FireEnfine 클래스 타입으로 형변환 후 fe2 객체 초기화
		fe2.water(); //water 메서드 호출

	}

}
