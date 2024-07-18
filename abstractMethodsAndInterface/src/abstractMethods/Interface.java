package abstractMethods;

public class Interface {
   public static void main(String[] args) {
	features f=new features();
	System.out.println("App:"+f.app);
	f.version1();
	f.version2();
}
}

interface Whatsapp{
	final String app="Whatsp";
	void version1();
	void version2();
}
class features implements Whatsapp{
	public void version1() {
		System.out.println("Single Tick");
	}
	public void version2() {
		System.out.println("double tick");
	}

}
