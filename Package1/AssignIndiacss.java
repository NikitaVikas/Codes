package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Go to Google,type India with Css locator-(TN.CN)
public class AssignIndiacss
{

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		WebElement type=driver.findElement(By.cssSelector("textarea.gLFyf"));
		type.sendKeys("India");
		type.sendKeys(Keys.ENTER);
		
		
		
	}

}
