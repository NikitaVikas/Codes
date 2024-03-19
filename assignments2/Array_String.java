package assignments2;
//array display for string datatype
import java.util.Arrays;

//array to display the string values
public class Array_String 
{

	public static void main(String[] args)
	{
		//for string
		String name[]=new String[3];
		name[0]="Ram";
		name[1]="Lakshman";
		name[2]="Sita";
		/*for(int i=0;i<=name.length-1;i++)
		{
			System.out.println(name[i]);
			
		}*/
		System.out.println(Arrays.toString(name));
		
		

	}

}
