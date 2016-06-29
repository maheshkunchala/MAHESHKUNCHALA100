package com.stockAccounting.master;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;


public class suppilermaster 
{
	public static FileInputStream fi;
	public static Properties pr;
	public static String prop="D:\\Mahesh\\stockAccounting11\\src\\com\\stockAccounting\\properties\\stockAcc.properties";
	
	public static void main(String[]args) throws IOException
	{
		fi=new FileInputStream(prop);
		pr=new Properties();
		pr.load(fi);
		String expval="Suppliers";
		String actval;
	System.setProperty("webdriver.chrome.driver", "D:\\Mahesh\\stockAccounting11\\src\\com\\stockAccounting\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://webapp.qedgetech.com");
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.findElement(By.id(pr.getProperty("username"))).clear();
	driver.findElement(By.id(pr.getProperty("username"))).sendKeys("admin");
	driver.findElement(By.id(pr.getProperty("password"))).clear();
	driver.findElement(By.id(pr.getProperty("password"))).sendKeys("master");
	driver.findElement(By.id(pr.getProperty("login"))).click();
	driver.findElement(By.xpath(pr.getProperty("suppliers"))).click();
	driver.findElement(By.xpath(pr.getProperty("add"))).click();
	driver.findElement(By.id(pr.getProperty("supname"))).sendKeys("mahesh");
	driver.findElement(By.id(pr.getProperty("supadd"))).sendKeys("sr nagar");
	driver.findElement(By.id(pr.getProperty("supcity"))).sendKeys("hyderabad");
	driver.findElement(By.id(pr.getProperty("supcountry"))).sendKeys("india");	
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	driver.findElement(By.id(pr.getProperty("contact"))).sendKeys("mahesh");
	driver.findElement(By.id(pr.getProperty("phone"))).sendKeys("04040404040");
	driver.findElement(By.id(pr.getProperty("mail"))).sendKeys("maheshkunchala100@gmail.com");
	driver.findElement(By.id(pr.getProperty("mobile"))).sendKeys("9676846100");
	driver.findElement(By.id(pr.getProperty("note"))).sendKeys("mahesh");
	((JavascriptExecutor)driver).executeScript("window.scrollBy(0,250)","");
	driver.findElement(By.id(pr.getProperty("adding"))).click();
    driver.findElement(By.xpath(pr.getProperty("okbutton"))).click();
    driver.findElement(By.xpath(pr.getProperty("addsuccess"))).getText();
	driver.findElement(By.xpath(pr.getProperty("succok"))).click();
	actval=driver.findElement(By.id(pr.getProperty("supplier"))).getText();
    if(expval.equalsIgnoreCase(actval))
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}
	
	}
	

}
