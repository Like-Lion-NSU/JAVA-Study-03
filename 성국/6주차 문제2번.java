package Likelion;

import java.util.Scanner;

class Circle{
    private double x,y;
    private int radius;
    private Circle(double x, double y, int radius){
        ---------------------;
    }
    public void show() {
        _______________________
    }
}
public class CircleManager {
    public static void main(String[] args){
        Scanner scanner = __________________;
        Circle c [] = ________________; //3개의 circle 배열 선언
        for(int i = 0; i<____________; i++){
            System.out.println("x, y, radius >>");
            ________________________________;//x 값이 읽기
            ________________________________;//y 값이 읽기
            ____________________ // 반지름 읽기
            c[i] = _______________//circle객체 생성
        }
        for(int i = 0; i<c.length; i++)_____________;//모든 Circle 객체 출력
        /*Show 메소드 사용해서 출력해야함 show를 사용해서 모두 출력하면
        for문을 지워야하나? */
        void show();
        scanner.close();
    }
}
