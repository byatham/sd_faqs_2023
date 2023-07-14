package sd.com.exception;

public class Final_Finally_Finalize {
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("this is a finalize ");
	}
	

	public static void main(String[] args) {
		
		try
		{
			 int a=100;
			 int b=20;
			 int c;
			 c=a/b;
			 System.out.println("c value is "+c);
			 
		}catch (Exception e) {
		System.out.println("The problem occured in exception block "+e);
			
		}
		finally
		{
		System.out.println("this sis finally block ");
		}
		
		Final_Finally_Finalize fn=new Final_Finally_Finalize();
		fn=null;
		// to call finalize() 
		System.gc();
	}

}
