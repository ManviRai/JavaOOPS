package inheritanceAndMethodOverriding;

public class Hybrid2 {
	public static void main(String[] args) {
  four fr=new four();
  System.out.println("USN:"+fr.USN+"\n"+"Age:"+fr.age+"\n"+"Salary:"+fr.sal);
  System.out.println("----------------------------------");
  three th=new three();
  System.out.println("Name:"+th.name+"\n"+"Age:"+th.age+"\n"+"Salary:"+th.sal);
	}	  
}
class one{
	int sal=10000;
}
class two extends one{
	int age=2;
}
class three extends two{
	String name="Man";
}
class four extends two{
	String USN="4GH20CS024";
}
