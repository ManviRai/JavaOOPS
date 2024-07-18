package typecastingdemo;

public class PolyImplementation {
  public static void main(String[] args) {
    Feature1 f=new Feature2();
    f.version1();
  }  
}
// void display(new feature2());
//}
class Feature1{
	public void version1() {
		System.out.println("Single Tick");
	}
}
class Feature2 extends Feature1{
	public void version1() {
		System.out.println("Double Tick");
	}
}
class Feature3 extends Feature1{
	public void version1() {
		System.out.println("Blue Tick");
	}
}
