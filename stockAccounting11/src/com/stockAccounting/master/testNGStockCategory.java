package com.stockAccounting.master;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testNGStockCategory extends testNG

{
	Actions act;
	boolean flag=false;

@Test
	public void stockAcc_stockcatCreation() throws AWTException
 	{
 		WebElement sitem=driver.findElement(By.linkText("Stock Items"));
 		
 		act=new Actions(driver);
 		act.moveToElement(sitem).build().perform();
 		
 		driver.findElement(By.linkText("Stock Categories")).click();
 		driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a")).click();
 		driver.findElement(By.id("x_Category_Name")).sendKeys("Mahesh");
 		driver.findElement(By.id("btnAction")).click();
 		Sleeper.sleepTightInSeconds(10);
 		List<WebElement> button=driver.findElements(By.tagName("button"));

 		for (int i = 0; i < button.size(); i++) 
 		{
 			String text=button.get(i).getText();
 			
 			if (text.equalsIgnoreCase("OK!"))
 			{
 				button.get(i).click();
 				break;
 			}
 			
 		}


 		driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[4]/div[2]/button")).click();
 		Sleeper.sleepTightInSeconds(5);
        String count=driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[2]/form/div[2]/span[2]")).getText();
 		String[] split=count.split(" ");
        int count1=Integer.parseInt(split[2]);
 		int pcount=0;
        do 
 		{
 			List<WebElement> rows=driver.findElements(By.xpath("//*[@id='tbl_a_stock_categorieslist']/tbody/tr"));
 			for (int i = 0; i < rows.size(); i++) 
 			{
 				List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
 				String acttext=cols.get(3).getText();

 				if (acttext.equalsIgnoreCase("mahesh")) 
 				{
 					flag=true;
 					break;
 				}
 			
 			}
 			if (flag==false) 
 			{
 				driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/form/div[2]/div/div/div[2]/a[1]")).click();
 			}
 			pcount++;
 			Assert.assertEquals(actval, expval,"stock category creation has failed");
 		} 
 	
 		while (pcount<=count1);

Assert.assertEquals(actval, expval,"Stock Category creation has failed");

}
}
