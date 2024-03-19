package assignments2;
//check if the 2 arrays are equal or not
//check for other datatype
//not correct
import java.util.Arrays;
public class Array_Compare 
{

	public static void main(String[] args) 
	{
		String a1[]=new String[2];
		a1[0]="aaa";
		a1[1]="bbc";
		//a1[2]=30;
		String a2[]=new String[2];
		a2[0]="aaa";
		a2[1]="bbb";
		//a2[2]=30;
		System.out.println(Arrays.toString(a1));
		System.out.println(Arrays.toString(a2));
		Arrays.equals(a1, a2);
		if((Arrays.equals(a1,a2)==true))
		{
			System.out.println("They are equal");
		}
		else
		{
			System.out.println("They are not equal");
		}

}
}
