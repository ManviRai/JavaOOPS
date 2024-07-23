package javaLibraries;

public class HashCodeMethod {
  public static void main(String[] args) {
	  HashCodeMethod h=new HashCodeMethod();
	  System.out.println(h.hashCode());
}
 public int hashCode() {        //override
	  return 99;
  }
}
