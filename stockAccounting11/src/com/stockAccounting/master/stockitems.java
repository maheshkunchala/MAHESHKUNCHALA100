package com.stockAccounting.master;

import java.util.concurrent.TimeUnit;

import org.openqa.jetty.html.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class stockitems 
{
	public static void main(String[] args) 
	{
		String expval="Add succeeded";
		String actval;
		WebDriver driver=new FirefoxDriver();
		driver.get("http://webapp.qedgetech.com");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("master");
		driver.findElement(By.id("btnsubmit")).click();
		driver.findElement(By.linkText("Stock Items")).click();
		driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a")).click();
		driver.findElement(By.id("aol_x_Category")).click();
		driver.findElement(By.id("x_Category_Name")).sendKeys("books");
		driver.findElement(By.xpath(".//*[@id='ewAddOptDialog']/div/div/div[3]/button[1]")).click();
		driver.findElement(By.id("x_Supplier_Number")).sendKeys("mahesh");
		driver.findElement(By.id("x_Stock_Name")).sendKeys("books1234");
        driver.findElement(By.id("x_Unit_Of_Measurement")).sendKeys("mahesh");
        driver.findElement(By.id("x_Purchasing_Price")).sendKeys("1000");
        driver.findElement(By.id("x_Selling_Price")).sendKeys("1200");
        driver.findElement(By.id("x_Notes")).sendKeys("vvvimp");
        driver.findElement(By.id("btnAction")).click();
        driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[4]/div[2]/button")).click();
 		actval=driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[3]/div/div")).getText();
 		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
 		driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[4]/div[2]/button")).click();
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
