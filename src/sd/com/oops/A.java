package sd.com.oops;

public class A {
	
	public String name;
	public String color;
	public A()
	{
		System.out.println("inside A constructor");
	}
	
	public void initialize(String name, String color)
	{
		System.out.println(this.name=name);
		System.out.println(this.color=color);

	}

}
