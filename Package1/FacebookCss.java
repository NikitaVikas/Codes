package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookCss 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement mail=driver.findElement(By.cssSelector("input#email"));
		mail.sendKeys("nikita@gmail.com");
		WebElement log=driver.findElement(By.cssSelector("input#pass"));
		log.sendKeys("1234");
		log.sendKeys(Keys.ENTER);
		driver.findElement(By.cssSelector("button#u_0_5_E0")).click();

	}

}
