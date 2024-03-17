package Package1;
//goto amazon registeration page,perform action on each component except dropdown
//using relative xpath(//).
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign_Relativexpath {

	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F_encoding%3DUTF8%26ref_%3Dnav_custrec_newcust&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		WebElement text=driver.findElement(By.xpath("((//input)[6])"));
		text.sendKeys("Nikita Vikas");
		text.sendKeys(Keys.ENTER);
		WebElement text2=driver.findElement(By.xpath("((//input)[7])"));
		text2.sendKeys("12345");
		text2.sendKeys(Keys.ENTER);
		WebElement text3=driver.findElement(By.xpath("((//input)[8])"));
		text3.sendKeys("password");
		text3.sendKeys(Keys.ENTER);
		WebElement text4=driver.findElement(By.xpath("((//input)[9])"));
		text4.click();		
	}

}
