class traffic {
    int Number; // 대중교통 번호
    int count; // 승객 수
    int money; // 수입
}

// 학생 클래스 구현
class Student{
    String studentName; // 학생 이름
    int money; // 학생이 가진 돈

    // 매개변수 = 학생이름, 가진 돈
    Student(String studentName, int money) {
        this.studentName = studentName;
        this.money = money;
    }

    // 버스를 탄다
    public void takeBus(Bus bus) {
        bus.take(1500);
        this.money -= 1500; // 버스 요금 1500원 지불
    }

    // 택시를 탄다
    public void takeTaxi(Taxi taxi) {
        taxi.take(4500);
        this.money -= 4500; // 택시 요금 4500원 지불
    }

    // 지하철을 탄다
    public  void takeSubway(Subway subway) {
        subway.take(1500);
        this.money -= 1500; // 지하철 요금 1500원 지불
    }

    // 학생의 현재 정보를 출력하는 메소드
    public void showInfo() {
        System.out.println(studentName + "의 남은 돈은 " + money +" 입니다");
    }
}

// 버스 클래스
class Bus extends traffic {
    Bus(int Number) {
        this.Number = Number;
    }

    public void take(int money) {
        this.money += money;
        count++;
    }

    public void showInfo() {
        System.out.println("버스 "+Number+"번의 승객은 "+count+"명이고, 수입은"+ money+"입니다.");
    }
}

// 택시 클래스
class Taxi extends traffic {
    Taxi(int Number) {
        this.Number = Number;
    }

    public void take(int money) {
        this.money += money;
        count++;
    }

    public void showInfo() {
        System.out.println("택시 " + Number + "번의 승객은 " + count + "명이고, 수입은" + money + "입니다.");
    }
}

// 지하철 클래스
class Subway extends traffic {
    Subway(int Number) {
        this.Number = Number;
    }

    public void take(int money) {
        this.money += money;
        count++;
    }

    public void showInfo() {
        System.out.println("지하철 "+Number+"호선의 승객은 "+count+"명이고, 수입은"+ money+"입니다.");
    }
}

// 학생, 교통수단 합체

public class test2 {
    public static void main(String[] args) {

        // 학생 3명 생성
        Student studentKim = new Student("Kim", 10000);

        Student studentLee= new Student("Lee", 45000);

        Student studentPark = new Student("Park", 5000);

        Bus bus771 = new Bus(771);  // 노선 번호 711 버스 생성
        studentKim.takeBus(bus771); // Kim이 711버스를 탐
        studentKim.showInfo(); // Kim 정보 출력
        bus771.showInfo(); // 711버스 정보 출력

        Taxi taxi0406  = new Taxi(0406); // 택시 번호 0406 택시 생성
        studentLee.takeTaxi(taxi0406); // Lee가 0406택시를 탐
        studentLee.showInfo(); // Lee 정보 출력
        taxi0406.showInfo(); // 0406택시 정보 출력

        Subway subway1 = new Subway(1); // 1호선 지하철 생성
        studentPark.takeSubway(subway1);
        studentPark.showInfo(); // Park 정보 출력
        subway1.showInfo(); // 1호선 지하철 정보 출력

    }
}

