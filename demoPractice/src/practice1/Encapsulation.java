package practice1;

public class Encapsulation {
	public static void main(String[] args) {
		Emp e=new Emp();
		e.setValue("Muku");
		
		String m=e.getValue();
		System.out.println(m);
	}
}
class Emp{
	private String name;
	
	public String getValue()
	{
		return name;
	}
	public void setValue(String n) 
	{
		name=n;
	}
	
}
