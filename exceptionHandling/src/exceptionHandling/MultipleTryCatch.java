package exceptionHandling;

import java.util.Scanner;

public class MultipleTryCatch {
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 no.s");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int arr[]= {1,2,3,4,5};
		
		try {
			System.out.println(a/b);
			}
		catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
		try {
			System.out.println(arr[9]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e.getMessage());
		}
		
}
}
