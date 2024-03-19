package assignments2;

import java.util.Arrays;
import java.util.Scanner;

//do scanner input for boolean datatype
public class Scanner_boolean
{

	public static void main(String[] args) 
	{
		boolean rollno[]=new boolean[1];
		Scanner input=new Scanner(System.in);
		for(int i=0;i<=1;i++)
		{
		
		rollno[i]=input.nextBoolean();
		
		}
		System.out.println(Arrays.toString(rollno));

	}

}
