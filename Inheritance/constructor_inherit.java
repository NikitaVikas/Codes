package Inheritance;
//program to show mult level inheritance in one package
class Country1 //supermost class
{
	static void java()
	{
		System.out.println("Java from county");
	}
	static void selenium()
	{
		System.out.println("Selenium from country");
	}
	Country1()
	{
		System.out.println("This is a constructor");
	}
}


class state1 extends Country1//super class
{
	
	static void java_test()
	{
		System.out.println(" java testing in state");
	}
}
public class constructor_inherit extends state1//child class

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
		new Country1();
		
	}

}
