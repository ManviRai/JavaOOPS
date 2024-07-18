package typecastingdemo;

public class RunTimePolymorph {
	public static void main(String[] args) {
   Test t=new Test2();
   t.version1();
   Test t1=new Test3();
   t1.version1();
	}
}
class Test{
	public void version1() {
		System.out.println("Ver 1-Single Tick");
	}
}
class Test2 extends Test{
	@Override
	public void version1() {
		System.out.println("ver 2- Double Tick");
	}	
}
class Test3 extends Test{
	public void version1() {
		System.out.println("Ver 3- Blue Tick");
	}
}
