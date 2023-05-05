public class PuppyMain {
    public static void main(String[] args) {
        Puppy[] pp = new Puppy[3]; // 객체배열 pp 생성 (new 는 배열생성 의미, 객체 생성의미❌), 주소값

        pp[0]=new Puppy("꼬미",9,"14-352-36");  // 객체배열 pp에 들어갈 값
        pp[1]=new Puppy("초코",2,"13-453-37");
        pp[2]=new Puppy("딸기",5,"12-658-38");

        for(int i=0; i< pp.length; i++) {  // 배열에 주소값 출력하기 위해 for문 사용
            System.out.println(pp[i]);
            pp[i].info();
        }
    }
}
class Puppy {
    String name; // 이름 선언
    int age; //나이 선언
    String chipNo;  // 칩 번호 선언

    Puppy(String name, int age, String chipNo ){
        this.name=name;  // 생성자 호출
        this.age=age;
        this.chipNo=chipNo;
    }

    public void info(){
        System.out.println(name +"("+ age +") " + chipNo);
    }
}
