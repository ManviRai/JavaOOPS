package abstractionAndSingleTonClass;

public class Abstraction {
  public static void main(String[] args) {
	Student s=new Studetails();
	s.details();
	s.test();
	System.out.println("value:"+s.a);
}
}
abstract class Student{
	abstract void details();
	abstract void test();
	final int a=24;
}
class Studetails extends Student{
	void details() {
		System.out.println("Students Reg Details");
	}
	void test() {
		System.out.println("Test Results");
	}
}
