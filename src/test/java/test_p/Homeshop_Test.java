package test_p;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page_p.Homeshop_18_class;

public class Homeshop_Test{
	WebDriver driver;
	@BeforeTest()
	public void test()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod()
	public void url()
	{
		driver.get("https://homeshop18.shop/");
		driver.manage().window().maximize();
	}
	@Test()
	public void testt()throws Exception
	{
		Homeshop_18_class ho=new Homeshop_18_class(driver);
		ho.setlogin_values("prnavnair.kannan@gmail.com", "235564");
		ho.conti();
		ho.Titleverification();
		ho.pageverification();
		ho.linkvalidation();
		ho.Logoverification();
		ho.Scrolldown();
		ho.Windowandtab();
		ho.screenshot();
	}
	
}




	
	
	
	
		
	
	
	
	
		
		
	
	
	
	
		
		
		
	
	








	
	
	

		
	
		
		
		
		
	
	
	
	
	
	
	
		
	


