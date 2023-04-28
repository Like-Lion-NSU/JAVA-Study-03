package ju;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Java13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date today = new Date(); //today 객체생성, 해당 객체는 날짜와 현재 시간 정보가 담겨있음
		
		SimpleDateFormat date = new SimpleDateFormat("YYYY/MM/dd"); //date 객체생성
		SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a"); //time 객체생성
		
		System.out.println("오늘 날짜는 "+date.format(today)); //오늘 날짜 정보를 format 메서드를 이용해 포맷해서 리턴받음
		System.out.println("현재 시간은 "+time.format(today));//현재 시간 정보를 format 메서드를 이용해 포맷해서 리턴받음
		
		

	}

}
