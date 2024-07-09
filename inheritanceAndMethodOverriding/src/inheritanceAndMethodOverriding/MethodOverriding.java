package inheritanceAndMethodOverriding;

public class MethodOverriding {
	public static void main(String[] args) {
		Student1 stus=new Student1();
		stus.stud();
		Student2 stu=new Student2();
	       stu.stud();
	}	
}
class Student1{
	public void stud() {
		String name="Bhavya";
		System.out.println("Name:" +name);
	}
}
class Student2 extends Student1{
	public void stud() {
		String name="Rai";
		System.out.println("Name:" +name);
	}
}
