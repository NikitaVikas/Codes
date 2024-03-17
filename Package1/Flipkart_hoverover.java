package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart_hoverover 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.flipkart.com");
		driver.manage().window().maximize();
		Actions a1=new Actions(driver);
		a1.moveToElement(driver.findElement(By.xpath("(//span[.='Fashion'])[2]")));
		

	}

}
