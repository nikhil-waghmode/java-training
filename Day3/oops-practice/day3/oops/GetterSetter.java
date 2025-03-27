package day3.oops;
import java.util.Scanner;
public class GetterSetter {
	protected int x;
	protected int y;
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void setX(int a) {
		x = a;
	}
	public void setY(int b) {
		y = b;
	}
	public void acceptData() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter X:");
		x = in.nextInt();
		System.out.println("Enter Y:");
		y = in.nextInt();
		in.close();
	}
	public void showData() {
		
		System.out.println("X: " + this.getX());
		System.out.println("Y: " + this.getY());
	}
	public static void main(String[] args) {
		GetterSetter p;
		p = new GetterSetter();
		
		p.setX(10);
		p.setY(20);
		p.getX();
		p.getY();
		p.acceptData();
		p.showData();

	}

}
