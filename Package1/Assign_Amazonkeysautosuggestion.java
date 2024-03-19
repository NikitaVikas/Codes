package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//go to amazon,from all dropdown select amazon fresh-usings keys autosuggestion functionality.
public class Assign_Amazonkeysautosuggestion
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement all=driver.findElement(By.id("searchDropdownBox"));
		all.click();
		Thread.sleep(3000);//mandatory
		all.sendKeys(Keys.ARROW_DOWN);
		all.sendKeys(Keys.ARROW_DOWN);
		all.sendKeys(Keys.ARROW_DOWN);
		all.sendKeys(Keys.ARROW_DOWN);
		all.sendKeys(Keys.ENTER);
		
		//s1.selectByValue(null)
	}

}
