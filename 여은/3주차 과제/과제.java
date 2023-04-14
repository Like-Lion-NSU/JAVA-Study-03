// 과제⌨️

// 문제 3번
import java.util.Scanner;

public class naa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10]; // 숫자 10개를 입력할 배열 생성
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt() % 42; // 10개의 수를 42로 나눈 나머지 값을 arr배열에 넣기

            boolean check = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    check = true;
                    break;
                } else {
                    check = false;
                }
            }

            if (check == false) {
                count++;
            }

        }
