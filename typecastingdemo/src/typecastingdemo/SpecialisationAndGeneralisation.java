package typecastingdemo;

public class SpecialisationAndGeneralisation {
   public static void main(String[] args) {
	Main m1=new apps1();
	Main m2=new apps2();   //specialisation
//	   Main m=new apps1();
//     Main m=new apps2();    //Generalisation
	if(m1 instanceof apps1) {
		apps1 ap=(apps1)m1;
		ap.version();
		System.out.println("Main app:"+ap.app);
		ap.version1();
		System.out.println("---------------------");
	}
	if(m2 instanceof apps2) {
		apps2 ap=(apps2)m2;     
		ap.version();
		System.out.println("Main app:"+ap.app);
		ap.version2();
	}
	
}  
}

class Main{
	public void version() {
		System.out.println("Different Versions");
	}
}
class apps1 extends Main{
	String app="Whatsapp";
	public void version1() {
		System.out.println("Version 1 - Single tick");
	}
}
class apps2 extends Main{
	String app="Instagram";
	public void version2() {
		System.out.println("Version 1 - Posts");
	}
}
