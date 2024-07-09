package inheritanceAndMethodOverriding;

public class SimpleInheritance2 extends Student {
   int USN=50;
   public static void main(String[] args) {
	   SimpleInheritance2 emp=new SimpleInheritance2();
	   System.out.println("Students age="+emp.age+ " and USN =" +emp.USN);
}
}

class Student{
	int age=24;
}
