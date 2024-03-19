package assignments2;
import java.util.InputMismatchException;
//give scanner input as int and enter string (handle in exception)
import java.util.Scanner;
public class Excep1 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter a value");
		Scanner s1=new Scanner(System.in);
		//int value=s1.nextInt();
		try
		{
		int value=s1.nextInt();
		System.out.println("Entered value is: " +value);
		}
		catch(InputMismatchException a1)
		{
			System.out.println("Input has to be of int datatype");
		}
		
		
		

	}

}
