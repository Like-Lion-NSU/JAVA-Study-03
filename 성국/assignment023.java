package Likelion;
//버스,지하철,택시는 대중교통(부모 클래스)로부터
//공통 행위(대중교통 번호, 승객 수, 수입)을 상속받아야 하므로
//부모클래스 대중교통을 생성했습니다
public class publictransportation {
    String bus;
    String subway;
    String taxi;
    publictransportation(){}
// 대중교통 클래스 안에 버스, 지하철, 택시 속성 생성


    void transNum(){};
    void passengerNum(){};
    void income(){};
// 대중교통 클래스 안에 대중교통 번호, 승객 명수, 수입 행동 생성
}
