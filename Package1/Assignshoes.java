package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

//Launch flipkart and search for shoes using 
//name locator.
public class Assignshoes 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.findElement(By.name("q")).sendKeys("Shoes");
	}

}
