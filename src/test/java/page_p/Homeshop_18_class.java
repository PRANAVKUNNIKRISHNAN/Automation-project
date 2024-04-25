package page_p;

import java.io.File;
import java.net.HttpURLConnection;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homeshop_18_class{
	WebDriver driver;
	By login= By.xpath("/html/body/div[1]/div[1]/div/div/div[2]/ul/li[2]/a");
	By email= By.id("email");
	By password=By.xpath("//*[@id=\"password\"]");
	By enter= By.xpath("/html/body/div[1]/section[1]/div/div/div/div/div/div[2]/div[1]/form/div[4]/button");
	By drpdown= By.xpath("//*[@id=\"category-sidebar\"]/ul/li[3]/a/span");
	
	public Homeshop_18_class(WebDriver driver)
	{
		this.driver=driver;
	}
	public void setlogin_values(String addemail,String passwordd) throws InterruptedException
	{
		Thread.sleep(1000);
		driver.findElement(login).click();
		driver.findElement(email).sendKeys(addemail);
		driver.findElement(password);
		
	}
	public void conti()
	{
		driver.findElement(enter).click();
	}
	public void Titleverification()
	{
		String Title=driver.getTitle();
		System.out.println(Title);
		String Expectedtitle="HOMESHOP18";
		if(Title.equalsIgnoreCase(Expectedtitle))
		{
			System.out.println("The title is matched");
		}
		else
		{
			System.out.println("The title is not matched");
		}
	}
	public void pageverification()
	{
		String page=driver.getPageSource();
		if(page.contains("Google"))
		{
			System.out.println("The content is available");
		}
		else
		{
			System.out.println("The content is not available");
		}
	}
	public void screenshot() throws Exception
	{
		File image=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(image, new File("E:\\Homeshop.png"));
	}
	public void linkvalidation() throws Exception
	{
		String link="https://homeshop18.shop/";
		URL ob=new URL(link);
		HttpURLConnection con=(HttpURLConnection)ob.openConnection();
		con.connect();
		if(con.getResponseCode()==200)
		{
			System.out.println("Link is valid");
		}
		else
		{
			System.out.println("Link is invalid");
		}
		
	}
	public void Logoverification()
	{
		By logo=By.xpath("/html/body/div[1]/header/div[1]/div/div/div[1]/a/img");
		WebElement design=driver.findElement(logo);
		boolean display=design.isDisplayed();
		if(display)
		{
			System.out.println("Logo is present");
		}
		else
		{
			System.out.println("Logo is not present");
		}
	}
	public void Scrolldown()throws Exception
	{
		Thread.sleep(600);
		JavascriptExecutor ws=(JavascriptExecutor)driver;
		ws.executeScript("window.scrollBy(0,3200)");
	}
	public void Windowandtab()
	{
		driver.switchTo().newWindow(WindowType.TAB);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://homeshop18.shop/");
	}
}










	
	
	
	
	
	

	
		
	
	
	
	

		
		
		
		
	
	
	
		
		
	
	
	
	

	
			
	
		
	
	
	

		
		

	
	


	
	
		
	
	
	
	
		
		

	
		
		
		
		
	
	
	
		
		
		
		
		
	
		
		
		
			
			
		
	
	
	
	
	
	
	
		
	
	
	
		
	
	
	



	
	
	
	
	

	
			
	
	
	
	
	
	
	
	
	
	

	




	

	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
		
	
	
	
		
		
		
	
		
	
	
		
	
	


