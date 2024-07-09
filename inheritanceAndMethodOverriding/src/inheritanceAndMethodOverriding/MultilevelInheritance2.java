package inheritanceAndMethodOverriding;

public class MultilevelInheritance2 {
    public static void main(String[] args) {
		clg det=new clg();
		det.clg_details();
		System.out.println("-------------------------");
		det.deptDetails();
		System.out.println("-------------------------");
		det.StudDetails();
	}
}
class Students{
	public void StudDetails() {
		String name="Deepa";
		String Edu="B.E";
		String USN="4GH20CS024";
		System.out.println("Name: "+name);
		System.out.println("Education: "+Edu);
		System.out.println("USN: "+USN);
	}
}

class Department extends Students {
	public void deptDetails() {
		String dept_name="CSE";
		int dept_id=1;
		System.out.println("Department name: "+dept_name);
		System.out.println("Department ID: "+dept_id);
	}
}
class clg extends Department{
	public void clg_details() {
    String college_name="GECH";
    System.out.println("Collage Name:"+college_name);
	}
}
