package userDefinedExceptionHandling;

public class WithGetMessage {
  public static void main(String[] args) {
	String pwd="121";
	if(pwd=="123") {
		System.out.println("Login Successfull");
	}
	else {
		try {
			throw new InvalidPasswordExceptionn("Wrong password");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
}
class InvalidPasswordExceptionn extends RuntimeException{
	private String message;
	public InvalidPasswordExceptionn(String message) {
		this.message=message;
	}
	public String getMessage() {
		return message;
	}
}
