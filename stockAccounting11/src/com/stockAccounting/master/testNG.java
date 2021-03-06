package com.stockAccounting.master;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;


public class testNG 
{
public static String url="http://webapp.qedgetech.com";
public static WebDriver driver;
public FileInputStream fi;
public Properties pr;
public static String expval,actval;
@BeforeSuite
public void stockAcc_Launch() throws IOException
{
	fi=new FileInputStream("D:\\Mahesh\\stockAccounting11\\src\\com\\stockAccounting\\properties\\stockAcc.properties");
	pr=new Properties();
	pr.load(fi);
	expval="btnsubmit";
	String br=pr.getProperty("browser");
	
	if (br.equalsIgnoreCase("firefox")) 
	{
		driver=new FirefoxDriver();
	}
	else if (br.equalsIgnoreCase("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Mahesh\\stockAccounting11\\src\\com\\stockAccounting\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	else if (br.equalsIgnoreCase("ie")) 
	{
		System.setProperty("webdriver.ie.driver", "D:\\Mahesh\\stockAccounting11\\src\\com\\stockAccounting\\Driver\\IEDriverServer.exe");
		driver=new InternetExplorerDriver();
	}
	
	driver.get(url);
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	actval=driver.findElement(By.id("btnsubmit")).getAttribute("id");
	
	Assert.assertEquals(actval, expval,"Launch Has Failed");
	
}

@AfterSuite
public void stockAcc_close()
{
	driver.quit();
	
}

@BeforeTest
public void stockAcc_Login()
	{
    expval="Administrator";
	driver.findElement(By.id("username")).clear();
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.id("password")).clear();
	driver.findElement(By.id("password")).sendKeys("master");
	driver.findElement(By.id("btnsubmit")).click();
	actval=driver.findElement(By.xpath(".//*[@id='msUserName']/font/strong")).getText();
	Assert.assertEquals(actval, expval,"stock acc login has failed");

}
@AfterTest
public void stockAcc_Logout()
	{
		
	expval="btnsubmit";
	
	driver.findElement(By.id("logout")).click();
	Sleeper.sleepTight(5000);

	 List<WebElement> button=driver.findElements(By.tagName("button"));
     System.out.println(button.size());
 		for (int i = 0; i < button.size(); i++) 
 		{
 			String text=button.get(i).getText();
 			
 			if (text.equalsIgnoreCase("OK!"))
 			{
 				button.get(i).click();
 				break;
 			}
 			}
    actval=driver.findElement(By.id("btnsubmit")).getAttribute("id");
    System.out.println(actval);
    Sleeper.sleepTightInSeconds(5000);
   
		 
    Assert.assertEquals(actval, expval,"stock acc logout has failed");


}
}