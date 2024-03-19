package assignments2;
//how to achieve multiple level inheritance -5 interfaces 
//are used
interface OneParent
{
	void add();
}
interface TwoParent
{
	void subtract();
}

interface ThreeParent
{
	void mul();
}
interface FourParent
{
	void divide();
}

interface FiveParent
{
	void mod();
}

public class Fiveinterface implements OneParent,TwoParent,ThreeParent,FourParent,FiveParent
{

	public static void main(String[] args)
	{
		System.out.println("Output");
		Fiveinterface f1=new Fiveinterface();
		f1.add();
		f1.subtract();
		f1.mul();
		f1.divide();
		f1.mod();

	}

	@Override
	public void mod() 
	{
		
		System.out.println("Modulus is done here");
	}

	@Override
	public void divide()
	{
		
		System.out.println("Division is done here");
	}

	@Override
	public void mul()
	{
		System.out.println("Multiplication is done here");
		
	}

	@Override
	public void subtract() 
	{
		
		System.out.println("Subtraction is done here");
	}

	@Override
	public void add() 
	{
		System.out.println("Addition is done here");
		
	}

}
