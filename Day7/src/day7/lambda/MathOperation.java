package day7.lambda;
/*
 * 1. Lambda Expression Fundamentals & Functional Interfaces
Create a Functional Interface MathOperation with a method int operate(int a, int b).
Implement it using a lambda expression for addition, subtraction, multiplication, and division. 
*/
@FunctionalInterface
interface MathOperation {
	int operate(int a,int b);
}
