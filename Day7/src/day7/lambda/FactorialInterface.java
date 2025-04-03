package day7.lambda;
/*Block Lambda Expressions
Write a lambda expression that takes an integer and returns its factorial using a block lambda expression.
Use a functional interface Factorial with a method long compute(int n). 
*/
@FunctionalInterface
interface FactorialInterface {
	int compute(int n);
}
