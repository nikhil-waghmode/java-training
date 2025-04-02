package day6.exceptionhandling;
//custom exception it needs to extend exception since it cannot use throw without that.

class BigException extends Exception {
	BigException(String msg){
		super(msg);   //custom message is passed to base class Exception
	}
}
