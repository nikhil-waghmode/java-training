package day7.lambda;
/*
 Block Lambda Expressions
Write a lambda expression that takes an integer and returns its factorial using a block lambda expression.
Use a functional interface Factorial with a method long compute(int n). */
public class BlockLambdaClass {
	public static void main(String[] args) {
		FactorialInterface fact1 = (int n) -> {
			int factorial = 1;
			for(int i =1;i<=n;i++) {
				factorial *= i;
			}
			return factorial;
		};
		
		System.out.println("Factorial: " + fact1.compute(3));
		System.out.println("Factorial: " + fact1.compute(4));
		
	}
}
