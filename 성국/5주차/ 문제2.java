package likelion;

import java.util.ArrayList;

class Puppy {
    String name;
    int age;
    String chipNo;

    public Puppy(String name, int age, String chipNo) {
        this.name = name;
        this.age = age;
        this.chipNo = chipNo;
    }

    public void puppylnfo() {
        System.out.println(name + "(" + age + ") >> " + chipNo);
    }

/*정적 배열 사용 시 static pp i를 new로 생성
 동적 배열 사용 시
 */
    
    
	public static void main(String[] args) {
//		ArrayList<puppy> pp = new ArrayList<puppy>();
//		pp.add
		
	}

}
