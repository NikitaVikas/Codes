package assignments2;
//up and down cast
class Class4
{
	void add1()
	{
		System.out.println("add1");
	}
	
}
class Class3 extends Class4
{
	void add()
	{
		System.out.println("add");
	}
	
}

class Class2 extends Class3
{
	void subtract()
	{
		System.out.println("Subtract");
	}
}
public class Casting2 
{
	void multiply()
	{
		System.out.println("multiply");
	}
	public static void main(String[] args) 
	{
			Grandparent g1=new Parent1();
			g1.add();
			Grandparent g1=new Parent1();
			Casting c1=(Casting)g1;
			c1.subtract();
			c1.multiply();

	}

}
