package day3.oops;

import java.util.Scanner;

public class Rectangle extends Point {
	
	protected int length;
	protected int width;
	
	public Rectangle() {
		//default constructor.
	}
	public Rectangle(int x, int y) {
		super(x,y);
		length = 10;
		width = 20;
	}
	public Rectangle(int x, int y, int length, int width) {
		super(x,y);
		this.length = length;
		this.width = width;
	}
	public Rectangle(Point p, int length, int width) {
		super(p.getX(),p.getY());
		this.length = length;
		this.width = width;
	}
	public Rectangle(Point p) {
		super(p.getX(),p.getY());
		this.length = 10;
		this.width = 20;
	}
	
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	@Override
	public void acceptData() {
		super.acceptData();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length: ");
		this.length = sc.nextInt();
		System.out.println("Enter width: ");
		this.width = sc.nextInt();
		sc.close();
	}
	@Override
	public void showData() {
		super.showData();
		System.out.println("Enter length: " + this.length);
		System.out.println("Enter width: " + this.width);
	}
	
	public float getArea() {
		return this.length*this.width;
	}
	public float getPerimeter() {
		return (2*this.length)+(2*this.width);
	}
	public Point getTopPoint() {
		Point p = new Point(9,6);
		return new Point(p.getX(), p.getY());
	}
	public static void main(String args[]) {
		Rectangle r1 = new Rectangle();
		r1.showData();
		
		Rectangle r2 = new Rectangle(1,2);
		r2.showData();
		
		Rectangle r3 = new Rectangle(3,4,200,30);
		r3.showData();
		System.out.println("Area of r3: " + r3.getArea());
		Point p = new Point(5,6);
		Rectangle r4 = new Rectangle(p,12,24);
		r4.showData();
		
		Rectangle r5 = new Rectangle(p);
		r5.showData();
		r5.acceptData();
		r5.showData();
		r5.getTopPoint().showData();
		
	}
}

