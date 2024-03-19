package assignments2;
//check if 2 strings are palindrome
public class Strings2_Pallin 
{

	public static void main(String[] args)
	{
		String input="madam";
		String output="";
		for(int i=input.length()-1;i>=0;i--)
		{
			char char1=input.charAt(i);
			output= output+char1;
		}
		System.out.println(output);
		
		
		if(input.equals(output))
		{
			System.out.println("Its a palindrome");
		}
		else
		{
			System.out.println("Its not a palindrome");
		}
//use if(input.equalsIgnorecase(output))for "Madam" 
	}

}
