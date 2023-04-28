예제 6-24

package LikelionStudy;
class Car{
    String color; //색상
    String gearType //기어타입
    int door; //문의 개수

    Car(){}  //car생성자
    Car(String c, String g, int d){     //car 생성자에서 변수들 약자 지정
        color = c;      //색상은 c
        gearType = g;   //기어타입은 g
        door = d;       //문은 d
    }
}
public class CarTest {
    public static void main(String[] args){
        Car c1 = new Car();
       c1.color = "white"; //c1으로 변환한 Car의 색상 white로 지정
        c1.gearType = "auto"; //c1 Car의 기어타입 오토
        c1.door = 4;        //c1 자동차의 문 갯수 4개
        
        Car c2 = new Car("white", "auto", 4);
        System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType + ",door="+c1.door);
        //c1의 color = white, gearType=auto ,door=4 출력
        System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType + ", door=" +c2.door);
    }   //c2의 color = white, gearType=auto ,door=4 출력
}


예제 6 - 16
  
  package LikelionStudy;

public class FactorialTest2 {
    static long factorial(int n) {
        if (n<= 0 || n>20) return -1; // 매개변수의 유효성 검사 만약 n이 0과 같거나 작고 20보다 크다면 -1반환
        if(n<=1) return 1; //만약 n이 1과 같거나 작으면 1을 반환
        return n * factorial(n-1); //반환한 n값에 n-1팩토리얼 값을 곱한다
    }
    public static void main(String args[]){
        int n = 21; // n = 21인 변수 생성
        long result = 0; 

        for (int i = 1; i <= n; i++){ //int =1에서 시작해서 i가 n과 같거나 작을때까지 i를 1씩 증감
            result = factorial(i); //결과 = i팩토리얼

            if(result ==-1) {
                System.out.printf("유효하지 않은 값입니다. (0<n<=20):%d%n", n); // 을 인수로 받아서 출력
                break; //멈춘다
            }
            System.out.printf("%2d! =%20d%n",i,result); // i와 result를 인수로 받아서 출력 
                
            }
        }
    }
}
