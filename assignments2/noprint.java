package assignments2;
//Program to enter number 1 and 100 by user(using scanner class) and 
//remaining numbers should come automatically.
import java.util.*;
public class noprint 
{

	public static void main(String[] args)
	{
		System.out.println("program starts-enter 1");
		Scanner s1=new Scanner(System.in);
		int number1=s1.nextInt();
		
		System.out.println("Entered Number is: "+number1);
		for(int i=2;i<=99;i++)
		{
			System.out.println(i);
		}
		System.out.println("enter 100");
		int number2=s1.nextInt();
		
		System.out.println("program ends");
	}

}
