package Package1;
//Launch flipkart application,get its title and put every 
//word in 1 ,1 array index position
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentLaunch {

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		String title1=driver.getTitle();
		System.out.println(title1);
		
		String []strarr=title1.split(" ");
		for(int i=0;i<strarr.length;i++) 
		{
			
			System.out.println(strarr[i]);
		}
		
	}

}
