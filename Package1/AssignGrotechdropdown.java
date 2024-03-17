package Package1;
//Go to grotechminds page and try to work on drop down below.
//https://grotechminds.com/dropdown/

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class AssignGrotechdropdown 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/dropdown/");
		driver.manage().window().maximize();
		WebElement dd=driver.findElement(By.id("select2-form-field-Demo-container"));
		Select s1=new Select(dd);
		s1.selectByVisibleText("Select Choice 1");
//not working after this		
	}

}
