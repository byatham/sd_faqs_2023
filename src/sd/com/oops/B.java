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
		b.initialize("Balu", "Yellow");
	}

}
