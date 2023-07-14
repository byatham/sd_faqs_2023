package sd.com.oops;

public class Student {
	public Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	private String name;
	private int id;
	
	@Override
	public boolean equals(Object obj)
	{
		Student st=(Student)obj;
		return this.id==st.getId() && this.name.equals(st.getName());
		
	}
	
	@Override
	public int hashCode()
	{
		return id;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public static void main(String[] args) {
		Student st=new Student("Balu",101);
		Student st1=new Student("Raju",101);
		System.out.println("hashCode() same :: "+(st.hashCode()==st1.hashCode()));
		
		System.out.println("is equals() same :: "+st.equals(st1));
		
		System.out.println("hello "+st.getName());

	}

}
