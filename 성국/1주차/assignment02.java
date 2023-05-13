package Likelion;
class publictrans {
    String bus;
    String subway;
    String taxi;
    publictrans(){}
// 대중교통 클래스 안에 버스, 지하철, 택시 속성 생성


    void transNum(){};
    void passengerNum(){};
    void income(){};
// 대중교통 클래스 안에 대중교통 번호, 승객 명수, 수입 행동 생성
}



/*class Student extends publictrans{
    String student() = new student;
    학생을 한명 만든 후
    void transNum() {
        System.out.println(bus + "의 번호는" transNum() + "번입니다." );
    }
    void passengerNum() {
        System.out.println(bus + "의 승객수는" passengerNum() + "명입니다." );
    }
     void income() {
        System.out.println(bus + "의 요금은" income() + "원입니다." );
    }
    @Override
    void transNum() {
        super.transNum();
    }
    }
     overloading을 통해 접근해보려 했는데 계속 overriding만 되어서
     다른방법으로 접근해보기로 했습니다*/

//   ovdeloading을 사용하기위해 공공교통수단 클래스를 따로 작성하고
//   상속 시도를 했는데 방법을 모르겠습니다




public class Student { public static void main(String[] args){
    publictrans bus = new bus();
    publictrans subway = new subway();
    publictrans taxi = new taxi();

/* 상속받는게 필수라고 하셔서 상속을 이용하려고 ppt를 보며
    overloading과 상속을 썼다 지우고 하며
    여러번 시도했는데 방법이 틀린건지
    도저히 적용이 안되어서 여기까지 작성하겠습니다 ㅠㅠ
    제가 구상하던 코드는 학생을 한명 만들고 그 학생을 인수로 넣어서
    만들어놓은 교통수단 매개변수와 수입같은 행동들을 상속받아서
    학생수와 결과같을 +로 결합하여 도출해내려고 했습니다
 */




}
}
