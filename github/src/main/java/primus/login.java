package primus;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class login
{   
	
	 WebDriver driver;
	 @Test
	 
	    public void primusbank() 
	 {

		
	    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\arte262_pavan\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		    driver.manage().window().maximize();
			driver.get("http://primusbank.qedgetech.com/");
	        driver.findElement(By.xpath("//*[@id='txtuId']")).sendKeys("Admin");
	        driver.findElement(By.xpath("//*[@id='txtPword']")).sendKeys("Admin");
	        driver.findElement(By.xpath("//*[@id='login']")).click();
	        driver.close();
}
}