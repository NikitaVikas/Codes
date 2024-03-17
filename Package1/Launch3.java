package Package1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Launch3 {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		//driver.findElement(By.name("q")).sendKeys("India");
		WebElement link=driver.findElement(By.tagName("textarea"));
		//link.click();
		link.sendKeys("India");
		link.click();
	}

}
