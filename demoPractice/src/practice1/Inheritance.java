package practice1;

public class Inheritance {
	public static void main(String[] args) {
		
		child c=new child();
		c.m2();
		c.m1();
	}
}
class parent{
	public void m1()
	{
		System.out.println("hii");
	}
}
class child extends parent{
	public void m2()
	{
		System.out.println("hello");
	}
}
