package day3.oops;

import java.util.Scanner;
public class Point {

    protected int x;
    protected int y;

    public Point() {                    //Default
    }

    public Point(int x, int y) {        //Parameterized
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }    

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }    

    public void setY(int y) {
        this.y = y;
    }

    public void acceptData() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter X : ");
        x = in.nextInt();
        System.out.println("Enter Y : ");
        y = in.nextInt();
    }

    public void showData() {
        System.out.println("X :"  + x);
        System.out.println("Y :"  + y);
    }

    public static void main(String args[]) {
        Point p = new Point();
        Point p1 = new Point(10, 20);
        p.showData();
        p1.showData();
    }
}































