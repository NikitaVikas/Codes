package assignments2;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Excep2 
{

	public static void main(String[] args)
	{
		
		Scanner s1=new Scanner(System.in);
		int arr[]=new int[3];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the number");
			try
			{
			arr[i]=s1.nextInt();
			}
			catch(InputMismatchException a1)
			{
				System.out.println("The input must be int datatype");
			}
//			catch(ArrayIndexOutOfBoundsException a2)
//			{
//				System.out.println("Array length is exceeding");
//			}
		}
		
	}

}
