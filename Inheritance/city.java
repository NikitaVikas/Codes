package Inheritance;
//program to show mult level inheritance in one package
class Country //supermost class
{
	static void java()
	{
		System.out.println("Java from county");
	}
	static void selenium()
	{
		System.out.println("Selenium from country");
	}
}

class state extends Country//super class
{
	
	static void java_test()
	{
		System.out.println(" java testing in state");
	}
}
public class city extends state//child class

{
	static void selenium_test()
	{
		System.out.println("Testing selenium in city");	
	}

	public static void main(String[] args) 
	
	{
		selenium_test();
		java_test();
		java();
		selenium();
		
	}

}
