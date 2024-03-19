package assignments2;
//find factorial of a number
//not complete
import java.util.Scanner;
public class Factorial 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a number");
		Scanner s1=new Scanner(System.in);
		int num=s1.nextInt();
		//int num=10;
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		
		System.out.println("Factorial of entered number is: " +fact);

	}

}
