package userDefinedExceptionHandling;

public class WOGetMessage {
   public static void main(String[] args) {
	String pwd="121";
	if(pwd=="123") {
		System.out.println("Login successfull");
	}
	else {
		try {
			throw new InvalidPasswordException();
		}
		catch(Exception e) {
			System.out.println("Wrong password");
		}
		finally {
			System.out.println("Completed");
		}
	}
	
} 
}

class InvalidPasswordException extends RuntimeException{
	
}
