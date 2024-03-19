package Package1;
//go to google, type india and see autosuggestion and give count
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class AutoSuggestion 
{

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("India");
		Thread.sleep(2000);
		List<WebElement> autosuggestion= driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		int count=autosuggestion.size();
		System.out.println(count);
	}

}
