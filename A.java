public class A{
	String name = "Abc";
	int rollno = 100;
	String dept = "CSE";
	public String toString(){
		return "Class for student roll no "+rollno;
	}
	public static void main(String args[])
	{
		A a = new A();
		System.out.println(a);
	}
}