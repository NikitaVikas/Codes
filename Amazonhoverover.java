package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazonhoverover 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement account=driver.findElement(By.id("nav-link-accountlist"));
		Actions a1=new Actions(driver);
		a1.moveToElement(account).perform();
		driver.findElement(By.xpath("(//span[.='Sign in'])[1]"));

	}

}
