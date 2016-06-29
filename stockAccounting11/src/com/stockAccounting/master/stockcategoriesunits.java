package com.stockAccounting.master;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class stockcategoriesunits
{
	public static String url1="http://webapp.qedgetech.com";
	public static void main(String[]args)
	{
		String expval="Unit of Measurement";
		String actval;
		System.setProperty("webdriver.chrome.driver", "D:\\Mahesh\\stockAccounting11\\src\\com\\stockAccounting\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url1);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("password")).sendKeys("master");
		driver.findElement(By.id("btnsubmit")).click();
		WebElement st_we=driver.findElement(By.linkText("Stock Items"));
		Actions ac=new Actions(driver);
		ac.moveToElement(st_we).build().perform();
		driver.findElement(By.xpath(".//*[@id='mi_a_unit_of_measurement']/a")).click();
		driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a/span")).click();
		driver.findElement(By.id("x_UOM_ID")).sendKeys("Ashok127");
		driver.findElement(By.id("x_UOM_Description")).sendKeys("mahesh45");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.findElement(By.id("btnAction")).click();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[4]/div[2]/button[1]")).click();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.findElement(By.xpath("html/body/div[3]/div[2]/div/div[3]/div/div")).getAttribute("xpath");
		driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[4]/div[2]/button")).click();
		actval=driver.findElement(By.id("ewPageCaption")).getText();
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
	