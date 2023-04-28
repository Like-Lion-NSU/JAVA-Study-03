import java.text.SimpleDateFormat;
import java.util.Date;

public class ImportTest {
    public static void main(String[] args) {
        Date today = new Date();

        SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd"); // date의 출력 값이 년/월/일 출력이 되게 설정한다.
        SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a"); // time의 출력이 시/분/초와 오후인지 오전인지 나타나게 설정한다.

        System.out.println("오늘 날짜는 "+ date.format (today)); // 오늘 날짜를 출력한다
        System.out.println("현재 시간은 " + time.format(today)); // 현재 지금 시간을 출력한다.
    }
}
