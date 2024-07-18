package typecastingdemo;

public class ClassCastExceptionHandling {
  public static void main(String[] args) {
	App p=new App1();//upcasting
	if(p instanceof App1) {   //Cast Exception handling using instaceof
		App1 ap=(App1) p;    //downcasting
		System.out.println("main app:"+ap.Application);
		ap.Version1();
		System.out.println("main app:"+ap.App);
		ap.Version2();
		
		
	}
}
}

class App{
	String Application="Whatsapp";
	void Version1() {
		System.out.println("Version 1- Single Tick");
	}
}

class App1 extends App{
	String App="Instagram";
	void Version2() {
		System.out.println("Version - Stories and post");
	}
}
