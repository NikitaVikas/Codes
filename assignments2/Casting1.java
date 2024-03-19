package assignments2;
//upcasting with object class as parent.
public class Casting1 
{

	void add()
	{
		System.out.println("Add");
	}
	public static void main(String[] args)
	{
		Object o1=new Casting1();
		o1.getClass();
		System.out.println(o1.getClass());

	}

}
