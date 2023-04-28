class CastingTest1 {
    public static void main(String[] args) {
        Car car = null;          // 값 초기화
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;     // 값 초기화

        fe.water();
        car = fe;            // car = Car)fe;에서 형변환이 생략된 형태다.
//      car.water();         car에는 water() 참조변수가 없어 호출을 못해서 에러가 발생한다.
        fe2 = (FireEngine)car;      // 자손타입 << 조상타입
        fe2.water();
    }
}

class Car {
    String color;
    int door;

    void drive() {          // 운전하는 기능
        System.out.println("drive, Brrrr~");
    }
    void stop() {         // 멈추는 기능
        System.out.println("stop!!!");
    }
}
class FireEngine extends Car {     // 소방차
    void water() {               // 물을 뿌리는 기능
        System.out.println("water!!!");
    }
}