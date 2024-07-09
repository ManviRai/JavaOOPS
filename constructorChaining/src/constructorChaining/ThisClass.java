package constructorChaining;

public class ThisClass {
   ThisClass(double sal){
	   System.out.println("Sal:"+sal);
   }
   ThisClass(float pf){
	   this(2000.087);
	   System.out.println("PF:"+pf);
   }
   ThisClass(String name,int age){
	   this(18);
	   System.out.println("Name:"+name+" Age:"+age);
   }
   ThisClass(int age){
	   this(1000.789);
	   System.out.println("Age:"+age);
   }
   ThisClass(String name){
	   this(8.78);
	   System.out.println("Name:"+name);
	   
   }
   public static void main(String[] args) {
	   ThisClass ob=new  ThisClass("Manvi",23);
}
}
