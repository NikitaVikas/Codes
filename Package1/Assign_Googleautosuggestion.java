package Package1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//go to google, type Indias news channels and select last auto suggestion
public class Assign_Googleautosuggestion 
{

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("Indias news channels");
		Thread.sleep(2000);
		List<WebElement> autosuggestion=driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		//autosuggestion.get(9).click();//direct index to fetch
		int count=autosuggestion.size();
		System.out.println(count);
		autosuggestion.get(count-1).click();//preferred way
	}
	

}
