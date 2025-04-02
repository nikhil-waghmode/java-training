package day6.exceptionhandling;

/*Create a static function that takes a number and return its cube, if the number is greater than 100 it should
generate NoCubeException. Write a program that accepts a number as command line argument and display its
cube. Cube should be calculated using the static function created. */
public class AssQ2 {
	public static int getCube(int n) throws NoCubeException {	
		if(n>100) {
			NoCubeException ne = new NoCubeException("Number greater than 100. No Cube Exist");
			throw ne;
		}
		return (n*n*n);
	}

	public static void main(String args[]) {
		int n = Integer.parseInt(args[0]);
		try {
			System.out.println("Cube of number is " + getCube(n));
		}
		catch(NoCubeException ne) {
			System.out.println(ne.getMessage());
		}
		catch(NumberFormatException nfe) {
			System.out.println(nfe.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println(ae.getMessage());
		}
	}
}
