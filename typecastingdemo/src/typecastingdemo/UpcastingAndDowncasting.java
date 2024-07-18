package typecastingdemo;

public class UpcastingAndDowncasting {
    public static void main(String[] args) {
		Whatsapp w=new Version();  //upcasting
		w.feature();
     	//w.version1();   cannot access subclass
		
		Version v=(Version)w;          //downcasting
		v.feature();
		v.version1();
		
	}
}
class Whatsapp{
	void feature() {
		System.out.println("Single Tick");
	}
}
class Version extends Whatsapp{
	void version1() {
		System.out.println("Version1 with double tick");
	}
}
