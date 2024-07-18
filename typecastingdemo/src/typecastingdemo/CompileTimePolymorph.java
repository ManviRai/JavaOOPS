package typecastingdemo;

public class CompileTimePolymorph {
  public static void main(String[] args) {
	CompileTimePolymorph cm=new  CompileTimePolymorph();
	cm.display("Man");
	cm.display(8);
	cm.display(7.8);
}
  void display(int a) {
	  System.out.println("Int:"+a);
  }
  void display(String b) {
	  System.out.println("String:"+b);
  }
  void display(double c) {
	  System.out.println("Double:"+c);
  }
}
