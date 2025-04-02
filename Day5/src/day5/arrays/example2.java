package day5.arrays;
//WAP that initialize multiple of 5 from 100 to 200 in an array and display them.
public class example2 {
	public static void main(String[] args) {
		int num[],i,j;
		
		//loop to calculate size of array
		for(i =100,j=1;i<200; i+=5,j++); //for loop as a statement and has multiple intiliazation.
		num = new int[j];
		
		//loop to store 
		for(i = 100,j=0;i<=200;i+=5,j++) {
			num[j] = i;
		}
		for(int x: num) {
			System.out.println(x);
		}
//		System.out.println();
	}
}
