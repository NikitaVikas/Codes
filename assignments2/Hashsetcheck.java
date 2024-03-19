package assignments2;

import java.util.HashSet;

public class Hashsetcheck 
{

	public static void main(String[] args) 
	{
		HashSet a1=new HashSet();
		a1.add("Abhishek");
		a1.add("Uthra");
		a1.add("Sonali");
		a1.add("Sane");
		a1.add("Nikita");
		a1.add("Nikita");
		a1.add(11);
		a1.add(21);
		a1.add(31);
		a1.add('c');
		a1.add(11.12333);
		a1.add(12.1122333444);
		a1.add('c');
		a1.add('c');
		a1.add(null);
		//a1.add(null);
		a1.add(null);
		a1.add(null);
		System.out.println(a1);

	}

}
