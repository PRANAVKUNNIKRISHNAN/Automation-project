package base_p;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Base {
	public WebDriver driver;
	@BeforeTest
	public void Url()
	{
		driver=new ChromeDriver();
		String link=("https://homeshop18.shop/users/registration");
		driver.get(link);
		driver.manage().window().maximize();
	}
	}
	
	
		
	


