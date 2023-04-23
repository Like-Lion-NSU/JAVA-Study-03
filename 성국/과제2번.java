package likelion;


 class pub{
	int Pubnumber;
	int Passenger;
	int Income;

 pub(){
 }
 
public class pub{
	this.Pubnumber = pubnumber;
	this.Passenger = Passenger;
	this.income = Income;
}
 }



public class Homework {

	public static void main(String[] args) {

		Student studentKim = new Student("Kim" , 10000);
		Student studentLee = new Student("Lee" , 45000);
		Student studentPark = new Student("Park" , 5000);

		Bus bus771 = new Bus(771); //노선번호  771버스 생성
		studentKim,takeBus(bus771);  //Kim이 771버스 탐
		studentKim,showInfo(); //KIM정보출력
		bus771.showInfo(); //771버스 정보출력
		
		Taxi taxi0406 = new Taxi(0406);
		studentLee.takeTaxi(taxi0406);
		studentLee.showInfo();
		taxi0406.showInfo();
		
		Subway = subway1 = new Subway("1호선");
		studentPark.takeSubway(subway1);
		studentPark.showInfo();
		subway1.showInfo(); 	
		
		
		//showInfo와 , take라는 메소드들이 있어야 하고
		//클래스 교통수단별로 뽑아내야 하고 
		//학생 클래스를 만들어야 한다
    //까지 생각하고 
    //답안 작성 전에 답안을 한번 미리 보고 작성했는데
    //추상클래스가 왜 들어가는건지 이해가 안되기도 하고 
    //이해 안한 상태로 기억나는 것만 쓰려니까 답지 베낀 느낌이라
    //도저히 스스로 생각한 답안 작성이 안되가지구 여기까지 작성을 하고
    //질문을 하고 추상클래스가 쓰이는 곳을 이해한 뒤 답안을 따라서 작성했습니다
    //아직 혼자 프로그램 짜긴 어렵지만 봤을 때 설명할 수 있을정도로 이해했습니다!
    //혼자 그대로 짤 수 있을 정도로 되는건 아직 조금 어렵네요 더 노력하겠습니다
		
	}

}

package likelion;

abstract class Transport{
    abstract void take(int money);      // 수입 요금, 승객 수 추상 메서드
    abstract void showInfo();       // 출력 추상 메서드
}

class Bus extends Transport {       // 추상 클래스 Transport로부터 상속
    int busnumber;      // 버스 번호
    int passengerCount;     // 승객 수
    int busmoney;      // 버스 수입

    Bus() {
    }     // Bus 기본 생성자

    Bus(int busnumber) {     // Bus 번호를 사용한 생성자
        this.busnumber = busnumber;     // 버스 노선 번호 초기화
    }

    void take(int busmoney) {       // 수입 요금, 승객 수 추상 메서드 구현
        this.busmoney += busmoney;        // 버스 요금(매개변수 bsumoney)만큼 버스 수입이 증가
        passengerCount++;       // 승객 수 증가
    }

    void showInfo() {       // 출력 추상 메서드 구현
        System.out.println("버스" + busnumber + "번의 승객은 " + passengerCount + "명이고, 수입은 " + busmoney + "원 입니다.");
    }
}

class Taxi extends Transport{       // 추상 클래스 Transport로부터 상속
    int taxinumber;     // 택시 번호
    int passengerCount;     // 승객 수
    int taximoney;      // 택시 수입

    Taxi(){}        // 택시 기본 생성자
    Taxi(int taxinumber){       // 택시 번호 생성자
        this.taxinumber = taxinumber;       // 택시 번호 초기화
    }

    void take(int taximoney){       // 수입 요금, 승객 수 추상 메서드 구현
        this.taximoney += taximoney;        // 택시 요금(매개변수 taximoney)만큼 택시 수입이 증가
        passengerCount++;       // 승객 수 증가
    }

    void showInfo(){        // 출력 추상 메서드 구현
        System.out.println("택시 " + taxinumber + "번의 승객은 " + passengerCount + "명이고, 수입은 " + taximoney + "원 입니다.");
    }
}

class Subway extends Transport{       // 추상 클래스 Transport로부터 상속
    String subwayline;      // 지하철 호선
    int passengerCount;     // 승객 수
    int subwaymoney;        // 지하철 수입

    Subway(){}      // 지하철 기본 생성자
    Subway(String subwayline){      // 지하철 호선 생성자
        this.subwayline =  subwayline;      // 지하철 호선 초기화
    }

    void take(int subwaymoney) {       // 수입 요금, 승객 수 추상 메서드 구현
        this.subwaymoney += subwaymoney;        // 지하철 요금(매개변수 subwaymoey)만큼 지하철 수입이 증가
        passengerCount++;       // 승객 수 증가
    }

    void showInfo() {       // 출력 추상 메서드 구현
        System.out.println("지하철 " + subwayline + "의 승객은 " + passengerCount + "명이고, 수입은 " + subwaymoney + "원 입니다.");
    }
}


class Student{      // 학생 클래스
    String studentname;  // 학생이름
    int money;   // 가진 돈

    Student(){}     // 학생 기본 생성자
    Student(String studentname, int money){     // 이름, 가진 돈을 초기화하는 생성자
        this.studentname = studentname;     // 이름 초기화
        this.money = money;     // 가진 돈 초기화
    }

    void takeBus(Bus bus){      // 버스 탑승
        bus.take(1500);
        this.money -= 1500;
    }
    void takeTaxi(Taxi taxi){       // 택시 탑승
        taxi.take(4500);
        this.money -= 4500;
    }

    void takeSubway(Subway subway){     // 지하철 탑승
        subway.take(1500);
        this.money -= 1500;
    }

    public void showInfo(){     // 학생 상태 출력
        System.out.println(studentname + "의 남은 돈은 " + money + "원 입니다.");
    }
}

public class Homework2 {
    public static void main(String[] args) {
        // 학생 3명 생성
        Student studentKim = new Student("Kim", 10000);
        Student studentLee = new Student("Lee", 45000);
        Student studentPark = new Student("Park", 5000);

        Bus bus771 = new Bus(771);      // 노선 번호 771 버스 생성
        studentKim.takeBus(bus771);     // kim이 771 버스 탐
        studentKim.showInfo();      // kim 정보 출력
        bus771.showInfo();      // 771버스 정보 출력

        Taxi taxi0406 = new Taxi(0406);     // 택시 번호 0406 택시 생성
        studentLee.takeTaxi(taxi0406);      // Lee가 0406 택시 탐
        studentLee.showInfo();      // Lee 정보 출력
        taxi0406.showInfo();        // 0406택시 정보 출력

        Subway subway1 = new Subway("1호선");     // 1호선 지하철 생성
        studentPark.takeSubway(subway1);        // Park이 1호선 지하철 탐
        studentPark.showInfo();     // Park 정보 출력
        subway1.showInfo();     // 1호선 정보 출력
    }
}
