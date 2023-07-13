package sd.com.oops;

public class B  extends A{
	
	private String name;
	
	public B()
	{
		System.out.println("B constructor");
	}
	
	public void bIntilize(String name)
	{
		System.out.println(this.name=name);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B b=new B();
		//B b1=new A();// we cannot assign parent class object child class reference. not possible
		b.initialize("Balu", "Yellow");
		System.out.println("***********************");
		//creating parent class object
		
		A a=new A();
		A a1=new B();// we can assign child class object parent class reference.
	}

}
