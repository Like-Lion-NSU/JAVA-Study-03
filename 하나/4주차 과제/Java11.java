package ju;

import java.util.Scanner;

class Circle{
	private double x,y;
	private int radius;
	
	public Circle(double x, double y, int radius) {
		this.x=x;
		this.y=y;
		this.radius=radius;
	}
	public void show() {
		System.out.println("("+this.x+","+this.y+")"+this.radius);
	}
}
public class Java11 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Circle c[] = new Circle[3];
		for(int i=0; i<c.length; i++) {
			System.out.printf("x, y, radius >>");
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			int radius=sc.nextInt();
			c[i] = new Circle(x, y, radius);
		}
		for(int i =0 ; i<c.length; i++) {
			c[i].show();
		}
		sc.close();

	}
}
