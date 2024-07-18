package abstractMethods;

public class Interface2 {
  public static void main(String[] args) {
	Fea f=new Fea();
	f.ver1();
	f.ver2();
	f.Iver1();
	f.Iver2();
}
}
interface Whatsp{
	abstract void ver1();
	abstract void ver2();
}
interface Instagram{
	void Iver1();
	void Iver2();
}
class Fea implements Whatsp,Instagram{
	public void ver1() {
		System.out.println("Ver 1- messages");
	}
	public void ver2() {
		System.out.println("Ver 2- Stories");
	}
	public void Iver1() {
		System.out.println("Post");
	}
	public void Iver2() {
		System.out.println("Posts and stories");
	}
}

