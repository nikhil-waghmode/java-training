package day3.oops;
import java.util.Scanner;
/*Create a class called Rectangle derived from Point class. Apart from data of Point class, Rectangle should store
its width and height. Write constructors, getter/setters, behaviour, and operations to accept and display the
data. Also write methods that return its area and perimeter. Test the class by creating an implementation
program*/
public class RectangleQ3 {
	private int width, height;
	
	public void setWidth(int w) {
		width = w;
	}
	public void setHeight(int h) {
		height = h;
	}
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	public void acceptData() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Height: ");
		height =in.nextInt();
		System.out.println("Enter Width: ");
		width =in.nextInt();
		in.close();
	}
	public int getArea() {
		int area = width * height;
		return area;
	}
	public int getParamter() {
		int parameter = ((2*width)+(2*height));
		return parameter;
	}
	public void showData() {
		System.out.println("Height: " + height);
		System.out.println("Width: " + width);
	}
	public static void main(String args[]) {
		RectangleQ3 r1;
		r1= new RectangleQ3();
		r1.setHeight(10);
		r1.setWidth(18);
		System.out.println("Height: " + r1.getHeight());
		System.out.println("Width: " + r1.getWidth());
		
		RectangleQ3 r2 = new RectangleQ3();
		r2.acceptData();
		r2.showData();
		System.out.println("Area for r1: " + r1.getArea());
		System.out.println("Perimeter for r1 " + r1.getParamter());
		
	}
}
