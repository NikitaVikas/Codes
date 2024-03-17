package Package1;

import org.openqa.selenium.chrome.ChromeDriver;

//register new account in amazon .in
public class AssignregAmazon 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();

	}

}
