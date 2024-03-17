package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//registeration page complete check
public class Grotechfull 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		WebElement em=driver.findElement(By.id("email"));
		em.sendKeys("niki@gmail.com");
		//em.sendKeys(Keys.ENTER);
		WebElement pw=driver.findElement(By.id("password"));
		pw.sendKeys("1211");
		//pw.sendKeys(Keys.ENTER);
		WebElement radio=driver.findElement(By.id("Female"));
		radio.click();
		if(radio.isSelected()==true)
		{
			System.out.println("Female is selected");
		}
		else
		{
			System.out.println("Female is not selected");
		}
		
		
		WebElement dd=driver.findElement(By.id("Skills"));
		//dd.click();
		Select s1=new Select(dd);
		s1.selectByIndex(1);
		
		WebElement subskill=driver.findElement(By.name("technicalskills c-s"));
		//dd.click();
		Select s2=new Select(subskill);
		s2.selectByIndex(1);
		
		WebElement country=driver.findElement(By.id("Country"));
		//dd.click();
		Select s3=new Select(country);
		s3.selectByVisibleText("Bangladesh");
		
		WebElement address=driver.findElement(By.xpath("//textarea[@id='Present-Address']"));
		address.sendKeys("Bangalore karnataka");
		

		WebElement address2=driver.findElement(By.xpath("//textarea[@id='Permanent-Address']"));
		address2.sendKeys("whitefield ,Bangalore karnataka");
		WebElement file=driver.findElement(By.name("file"));
		//for every backslash give double backslash else wont work
		file.sendKeys("C:\\Users\\Nikita\\OneDrive\\Desktop\\git doc.txt");
		WebElement relocate=driver.findElement(By.id("relocate"));
		relocate.click();
		
	}

}
