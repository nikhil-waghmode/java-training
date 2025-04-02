package day5.commandlinearguments;

public class CommandLineArgs {
	public static void main(String []args) {
		
		if(args.length != 1) {
			System.out.println("Usage: java CommandLineArgs <number>");
			System.exit(0);
		}
		int num;
		num = Integer.parseInt(args[0]);
		for(int i =1;i<=10;i++) {
			System.out.println(num + "*" + i + " = " + (num*i));
		}
	}
}
