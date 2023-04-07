public class test01 {
    public static void main(String[] args) {
        System.out.println('\'');                     // \'는 자은따옴표의 문자 리터럴  '''처럼 할 수 없다.
        System.out.println("abc\t123\b456");          // \t는 tab의 문자 리터럴, \b는 backspace의 문자 리터럴로 3이 지워진다
        System.out.println('\n');                     // \n은 new line의 문자 리터럴
        System.out.println("\"Hello\"");              // \"은 큰따옴표의 문자 리터럴
        System.out.println("c:\\");                   // \\은 역슬래쉬의 문자 리터럴
    }
}
