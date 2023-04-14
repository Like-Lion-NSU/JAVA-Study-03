public class FlowEx29 {
    public static void main(String[] args) {
        for(int i=1; i<=100;i++) {                       // i가 100보다 작거나 같으면 i 증가
            System.out.printf("i=%d ", i);

            int tmp = i;

            do {
                // tmp%10이 3의 배수인지 확인(0 제외)
                if(tmp%10%3==0 && tmp%10!=0)    // tmp을 10으로 나눈 나머지를 3으로 다시 나누었을때 나머지가 0이고, 
                                                    //tmp을 10으로 나눈 나머지가 0이 아닐 때 '짝' 출력
                    System.out.print("짝");
                // tmp /=10은 tmp = tmp /10과 동일
            } while((tmp/=10) !=0);    

            System.out.println();
        }
    } //main
}
