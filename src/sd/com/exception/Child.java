package sd.com.exception;

public class Child extends Parent{
	// if we throw exception in parent class then we no need to handle in child class
	//but if you declare or throw exception in child class then you need redeclare same exception in parent class also

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		//super.m1();
		System.out.println("child m1 ");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Parent p1=new Child();
   //Parent p1=new Parent();
   p1.m1();
   
   System.out.println(p1.getClass());
   Parent.m2();
   
	}

}
