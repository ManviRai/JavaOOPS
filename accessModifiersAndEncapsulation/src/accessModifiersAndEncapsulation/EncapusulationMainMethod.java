package accessModifiersAndEncapsulation;

import java.util.Scanner;

public class EncapusulationMainMethod {
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  
	  Encapsulation e=new Encapsulation();
	  System.out.println("Enter your name");
	  String Name=sc.next();
	  System.out.println("Enter your age");
	  int age=sc.nextInt();
	  
	  e.setName(Name);
	  e.setAge(age);
	  

	  System.out.println("Name:"+e.getName());
	  System.out.println("Age:"+e.getAge());
	  
	  if(e.getName().equals("Manvi")) {
		  System.out.println("Welcome");
	  }
	  else {
		  System.out.println("No Access");
	  }
}
}
