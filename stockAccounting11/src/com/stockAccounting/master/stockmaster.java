package com.stockAccounting.master;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class stockmaster
{
public static FileInputStream fi;
public static Properties pr;
public static String url="http://webapp.qedgetech.com";
public static WebDriver driver;
public static String expval,actval;
public static String prop="D:\\Mahesh\\stockAccounting\\src\\com\\stockAccounting\\properties\\stockAcc.properties";
public String uname;
public String pwd;
public String stockAcc_Launch(String url) throws IOException
{
	fi=new FileInputStream(prop);
	pr=new Properties();
	pr.load(fi);
	expval="Login";
	driver=new FirefoxDriver();
	driver.get(url);
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	actval=driver.findElement(By.id(pr.getProperty("login"))).getText();
	if(expval.equalsIgnoreCase(actval))
	{
		return "pass";
	}
	else
	{
		return "fail";
	}
	
	
}
public String stockAcc_Login(String UserName,String Password)
{
	expval="administrator";
	driver.findElement(By.id(pr.getProperty("username"))).clear();
	driver.findElement(By.id(pr.getProperty("username"))).sendKeys(UserName);
	driver.findElement(By.id(pr.getProperty("password"))).clear();
	driver.findElement(By.id(pr.getProperty("password"))).sendKeys(Password);
	driver.findElement(By.id(pr.getProperty("login"))).click();
	actval=driver.findElement(By.xpath(pr.getProperty("administrator"))).getText();
	if(expval.equalsIgnoreCase(actval))
	{
		return "pass";
	}
	else
	{
		return "fail";
		}
}
public String stockAcc_logout()
{
    expval="Login";
    driver.findElement(By.id(pr.getProperty("logout"))).click();
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    driver.findElement(By.xpath(pr.getProperty("ok"))).click();
    actval=driver.findElement(By.id(pr.getProperty("login"))).getText();
	if(expval.equalsIgnoreCase(actval))
	{
		return "pass";
	}
	else
	{
		return "fail";
	}
	
}
public String stockAcc_quit()
{
	driver.close();
	return null;
}

}

	
	


