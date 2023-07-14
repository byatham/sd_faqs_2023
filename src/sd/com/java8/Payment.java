package sd.com.java8;

public interface Payment {
	
	public void doTransaction();
	
	default void addCoupon()
	{
		System.out.println("add 5 rupees cash back coupon");
	}
	
  static void  generateTransactionReport()
	{
		System.out.println("generate each transaction report ");
	}

}
