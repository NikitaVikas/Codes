package Package1;
//go to amazon ,type shoe and select 3rd one from autosuggestion
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_autosuggestion {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement searchtf=driver.findElement(By.id("twotabsearchtextbox"));
		searchtf.sendKeys("Shoe");
		Thread.sleep(3000); //mandatory
		List<WebElement> shoelist=driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		shoelist.get(2).click();
		
	
	}

}
