package ju;

class Car {
	String color;
	String gearType;
	int door;
	
	Car(){ // 생성자1
		this("white", "auto", 4);//생성자 3호출
	}
	Car(String color){//생성자2
		this(color,"auto",4);//생성자 3호출
	}
	Car(String color, String gearType, int door){//생성자3
		this.color=color;
		this.gearType=gearType;
		this.door=door;
	}
}
public class ju09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car c1=new Car();//생성자1을 사용해 객체를 생성했기 때문에 "white", "auto", 4
		Car c2=new Car("blue");//생성자 2를 호출해 컬러만 변경해주었기 때문에 컬러만 변경된 "blue", "auto", 4
		
		System.out.println("c1의 color=" +c1.color+", gearType="+c1.gearType+", door="+c1.door);
		System.out.println("c2의 color=" +c2.color+", gearType="+c2.gearType+", door="+c2.door);
	}

}
