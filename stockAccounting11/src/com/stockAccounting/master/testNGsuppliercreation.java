package com.stockAccounting.master;





import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testNGsuppliercreation extends testNG
{
@Test
public void stockAcc_SupplierCreation() 
 	{
 		expval="Add succeeded";
 		driver.findElement(By.linkText("Suppliers")).click();
 		driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a")).click();
 		driver.findElement(By.id("x_Supplier_Name")).sendKeys("mahesh");
 		driver.findElement(By.id("x_Address")).sendKeys("SrNagar");
        driver.findElement(By.id("x_City")).sendKeys("Hyderabad");
 		driver.findElement(By.id("x_Country")).sendKeys("India");
 		driver.findElement(By.id("x_Contact_Person")).sendKeys("Ramesh");
 		driver.findElement(By.id("x_Phone_Number")).sendKeys("04055451245");
 		driver.findElement(By.id("x__Email")).sendKeys("Mahesh@gmail.com");
 		driver.findElement(By.id("x_Mobile_Number")).sendKeys("9676846100");
 		driver.findElement(By.id("x_Notes")).sendKeys("sales");
        driver.findElement(By.id("btnAction")).click();
 	    driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[4]/div[2]/button")).click();
 	    actval=driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[3]/div/div")).getText();
 	    System.out.println(actval);
	 	driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[4]/div[2]/button")).click();
	 	Assert.assertEquals(actval, expval,"Supplier creation Failed");
 	}
}
	 	