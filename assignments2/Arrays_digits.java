package assignments2;
//check if the string contains only digits
import java.util.Arrays;

public class Arrays_digits 
{

	public static void main(String[] args) 
	{
		String name="world123";
		int noofchar=0;
		int noofint=0;
		char a1[]=name.toCharArray();
		
		System.out.println(Arrays.toString(a1));
		//boolean ans=Character.isAlphabetic(a1[0]);
		//System.out.println(Arrays.toString(a1));
		
		for (int i=0;i<a1.length;i++)
		{
			boolean ans=Character.isAlphabetic(a1[i]);
			if(ans==true)
			{
				noofchar++;
								
			}
			//System.out.println("String has only digits");
			else
			{
				noofint++;
			}
		}
		System.out.println("The no of char:"+noofchar);
		System.out.println("The no of numbers are:"+noofint);
		if(noofchar>0)
		{
			System.out.println("String does not contain only digits");
		}
		else 
		{
			System.out.println("String contains only didgits");
		}
	}


	

}
