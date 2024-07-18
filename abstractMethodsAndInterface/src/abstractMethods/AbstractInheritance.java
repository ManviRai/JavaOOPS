package abstractMethods;

 class AbstractInheritance {
    public static void main(String[] args) {
		subject s=new IT();
		
		s.syl();
		s.Learn();
	}
}
 abstract class subject{
	 subject(){
		 System.out.println("Subjects");
	 }
	 abstract void syl();
	    void Learn() {
		 System.out.println("Learning!!!!");
	 }
 }
 
 class IT extends subject{
	 void syl() {
		 System.out.println("C,Java...");
	 }
	 
 }
