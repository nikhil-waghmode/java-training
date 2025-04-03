package day7.lambda;
/*
 * 1. Lambda Expression Fundamentals & Functional Interfaces
Create a Functional Interface MathOperation with a method int operate(int a, int b).
Implement it using a lambda expression for addition, subtraction, multiplication, and division. 
*/
public class MathOperationClass{
	public static void main(String[] args) {
		MathOperation addition =  (a,b)-> (a+b);
		System.out.println("Additon: " + addition.operate(2, 4));
		MathOperation substraction =  (a,b)-> (a-b);
		System.out.println("Substraction: " + substraction.operate(2, 4));
		MathOperation multiplication =  (a,b)-> (a*b);
		System.out.println("Multiplication: " + multiplication.operate(2, 4));
		MathOperation division =  (a,b)-> (a/b);
		System.out.println("Division: " + division.operate(2, 4));
		
	}
}
