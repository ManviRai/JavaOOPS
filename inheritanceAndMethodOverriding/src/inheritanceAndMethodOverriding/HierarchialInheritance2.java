package inheritanceAndMethodOverriding;

public class HierarchialInheritance2 {
   public static void main(String[] args) {
	Collag clg=new Collag();
	clg.Collag_Det();
	System.out.println("Dept Name:"+clg.dept_name);
	System.out.println("Dept ID:"+clg.dept_id);
	System.out.println("---------------------------------");
	Stu st=new Stu("Manvitha",24);
	
}
	
}
class Dept{
	String dept_name="CSE";
	int dept_id=1;
}
class Stu extends Dept{
	String name;
	int USN;
	public Stu( String name,int USN) {
		super();
		this.name=name;
		this.USN=USN;
		
		System.out.println("Name:"+name);
		System.out.println("USN:"+USN);
		System.out.println("Dept Name:"+dept_name);
		System.out.println("Dept Name:"+dept_id);
	}	
}
class Collag extends Dept{
	String Collage_name="GECH";
	String Collage_Id="4GH";
	public void Collag_Det() {
		System.out.println("College_name:"+Collage_name);
		System.out.println("College_Id:"+Collage_Id);
		
	}
}
