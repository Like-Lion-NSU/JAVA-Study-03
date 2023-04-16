package likelion;

import java.util.ArrayList;
import java.util.Scanner;
class Back{
	String name;
	
	public Back() {}
	public Back(String name) {
		this.name=name;
	}	//name 변수를 선언 후 
	public void showName() {
		int length = name.length();
		Scanner sc = new Scanner(System.in);
		String back = sc.nextLine();
		
		
		System.out.println("부원 5명의 이름을 입력해주세요 >>");
			/*입력받은 이름의 초성이 Back ArrayList에 들어있는 name과 초성과 같은 이름 출력을 적고싶은데
		(back.charAt(0) == name.charAt(0) 
				입력받은 이름의 초성이 Back ArrayList에 들어있는 name과 초성과 같은까지는 오류가 안나는데
				System.out.println(name == (back.charAt(0) == name.charAt(0)));
				입력받은 이름의 초성이 Back ArrayList에 들어있는 name과 초성과 같은 이름 까지 
				출력하려고 하면 에러가 뜨는데 식의 어느 부분이 틀린건지 모르겠습니다
		showName메소드를 생성해서*/
		
		}
			
	}


public class ArrayPrc {

	public static void main(String[] args) {
		
		
		
		ArrayList<Back> Lion = new ArrayList<>();
		Lion.add(new Back("김하나"));
		Lion.add(new Back("권영태"));
		Lion.add(new Back("서송현"));
		Lion.add(new Back("김우석"));
		Lion.add(new Back("김하나"));
		
		
		
		System.out.println (name(Lion.contains(0) == name.(0)));
		
		/* 부원 이름이 아래에 있으니까 
		System.out.println(back.charAt(0) == name.charAt(0));
		back이라는 입력받은 변수에 비교해야해서 출력을 아래에 줘야할 거 같은데
		아래에 출력을 주려고 하면 위에서 변수가 사라져서 name을 못받습니다
		그렇다고 위에 출력을 주면 위에는 이름이 없어서 ArrayList를 못받습니다
        그래서 어떻게 이어가야 할지를 모르겠습니다 	
 		*/
		
		for (int i = 0; i< Lion.size();i++) {
			Lion.get(i).showName();
			// showNa
			
		}
		
		
		
	}

}
