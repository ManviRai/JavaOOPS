package userDefinedExceptionHandling;

import java.util.Scanner;

public class WithGet {
   public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter password");
	int n=sc.nextInt();
	if(n==123) {
		System.out.println("login Successfull");
	}
	else {
		try {
			throw new InvalidPassword("Wrong password!!!");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
}
class InvalidPassword extends RuntimeException{
	private String message;
	public InvalidPassword(String message) {
		this.message=message;
	}
	public String getMessage() {
		return message;
	}
}
