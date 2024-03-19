package assignments2;
//reverse name in horizontal manner
public class Reverse 
{

	public static void main(String[] args) 
	{
		String name="Nikita";
		int j=name.length();
		String output=" ";
		for (int i=(name.length()-1);i>=0;i--)
		{
			char b=name.charAt(i);
			output=output+b;
			
		}
		System.out.println(output);
	}

}
