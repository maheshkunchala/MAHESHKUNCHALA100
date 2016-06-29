package com.stockAccounting.master;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class stockmaster1 
{
	 	public static WebDriver driver;
	 	public static Actions act;
	 	public static String url="http://webapp.qedgetech.com/login.php";
	 	public static String uname="admin",pwd="master";
	 	public static String expval,actval;
	 	public static boolean flag=false;

	 	/*FunctionName			 :stockAcc_Launch
	 	 * Arguments 			 :Url
	 	 * Description			 :It will launch the stockaccounting Application
	 	 * Return Type			 :String
	 	 * Author     			 :Mahesh
	 	 * Date of Implementation:09/06/2016 
	 	 */
	 	public String stockAcc_Launch(String url)
	 	{
	 		expval="login";
	 		driver=new FirefoxDriver();
	 		driver.get(url);
	 		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	 		driver.manage().window().maximize();
	 		actval=driver.findElement(By.id("btnsubmit")).getText();
	 		if (expval.equalsIgnoreCase(actval))
	 		{
	 			return "Pass";
	 		}
	 		else
	 		{
	 			return "Fail";
	 		}
	 	}
	 	

	 	/*FunctionName			 :stockAcc_Login
	 	 * Arguments 			 :Uname,pwd
	 	 * Description			 :It will login the stockaccounting Application
	 	 * Return Type			 :String
	 	 * Author     			 :Mahesh
	 	 * Date of Implementation:09/06/2016 
	 	 */
	 	
	 	public String stockAcc_Login(String uname,String pwd)
	 	{
	 		expval="administrator";
	 		driver.findElement(By.id("username")).clear();
	 		driver.findElement(By.id("username")).sendKeys(uname);
	 		driver.findElement(By.id("password")).clear();
	 		driver.findElement(By.id("password")).sendKeys(pwd);
	 		driver.findElement(By.id("btnsubmit")).click();
	 		actval=driver.findElement(By.xpath(".//*[@id='msUserName']/font/strong")).getText();
	 		if (expval.equalsIgnoreCase(actval))
	 		{
	 			return "Pass";
	 		}
	 		else
	 		{
	 			return "Fail";
	 		}
	 		
	 	}
	 	
	 	/*FunctionName			 :stockAcc_Logout
	 	 * Arguments 			 :N/A
	 	 * Description			 :It will logout the stockaccounting Application
	 	 * Return Type			 :String
	 	 * Author     			 :Mahesh
	 	 * Date of Implementation:09/06/2016 
	 	 */
	 	
	 	public String stockAcc_Logout()
	 	{
	 		
	 		expval="Login";
	 		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 	    driver.findElement(By.id("logout")).click();
	 	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 	    driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[4]/div[2]/button[1]")).click();
	 	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 	    actval=driver.findElement(By.id("btnsubmit")).getText();
	 	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 	    if (expval.equalsIgnoreCase(actval))
	 		{
	 			return "Pass";
	 		}
	 		else
	 		{
	 			return "Fail";
	 		}
	 	}
	 	
	 	/*FunctionName			 :stockAcc_Close
	 	 * Arguments 			 :N/A
	 	 * Description			 :It will close the stockaccounting Application
	 	 * Return Type			 :N/A
	 	 * Author     			 :Mahesh
	 	 * Date of Implementation:09/06/2016 
	 	 */
	 	public void stockAcc_Close()
	 	{
	 		driver.close();

			
	 	}
	 	/*FunctionName			 :stockAcc_SupplierCreation
	 	 * Arguments 			 :supname,add,city,cntry,cperson,pno,email,mno,notes
	 	 * Description			 :It will close the stockaccounting Application
	 	 * Return Type			 :String
	 	 * Author     			 :Mahesh
	 	 * Date of Implementation:10/06/2016 
	 	 */
	 	
	 	public String stockAcc_SupplierCreation(String supname,String add,String city,String cntry,String cperson,String pno,String email,String mno,String notes)
	 	{
	 		expval="Add succeeded";
	 		driver.findElement(By.linkText("Suppliers")).click();
	 		driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a")).click();
	 		driver.findElement(By.id("x_Supplier_Name")).sendKeys(supname);
	 		driver.findElement(By.id("x_Address")).sendKeys(add);
	 		driver.findElement(By.id("x_City")).sendKeys(city);
	 		driver.findElement(By.id("x_Country")).sendKeys(cntry);
	 		driver.findElement(By.id("x_Contact_Person")).sendKeys(cperson);
	 		driver.findElement(By.id("x_Phone_Number")).sendKeys(pno);
	 		driver.findElement(By.id("x__Email")).sendKeys(email);
	 		driver.findElement(By.id("x_Mobile_Number")).sendKeys(mno);
	 		driver.findElement(By.id("x_Notes")).sendKeys(notes);
	 		driver.findElement(By.id("btnAction")).click();
	 		driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[4]/div[2]/button")).click();
		    actval=driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[3]/div/div")).getText();
		 	driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		 	driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[4]/div[2]/button")).click();
		 	if (expval.equalsIgnoreCase(actval))
	 		{
	 			return "Pass";
	 		}
	 		else
	 		{
	 			return "Fail";
	 		}
	 	}
	 	
	 	
	 	/*FunctionName			 :stockAcs_stockcatCreation
	 	 * Arguments 			 :catname
	 	 * Description			 :It will create the stockaccounting category creation
	 	 * Return Type			 :String
	 	 * Author     			 :Mahesh
	 	 * Date of Implementation:13/06/2016 
	 	 */
	 	public String stockAcc_stockcatCreation(String catname)
	 	{
	 		WebElement sitem=driver.findElement(By.linkText("Stock Items"));
	 		act=new Actions(driver);
	 		act.moveToElement(sitem).build().perform();
	 		driver.findElement(By.linkText("Stock Categories")).click();
	 		driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a")).click();
	 		driver.findElement(By.id("x_Category_Name")).sendKeys(catname);
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
	 				if (acttext.equalsIgnoreCase(catname)) 
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
	 			} 
	 		while (pcount<=count1);
	 		if (flag==true) 
	 		{
	 			return "Pass";
	 		}
	 		else
	 		{
	 			return "Fail";
	 		}
	 		}
	 	
	 	/*FunctionName			 :stockAcs_UnitofMCreation
	 	 * Arguments 			 :catname
	 	 * Description			 :It will create the stockaccounting Unit of measurement creation
	 	 * Return Type			 :String
	 	 * Author     			 :Mahesh
	 	 * Date of Implementation:15/06/2016 
	 	 */
	 	public String stockAcc_UnitofMcreation(String Uid,String Udesc)
		{
			WebElement sitem=driver.findElement(By.linkText("Stock Items"));
			
			Actions act=new Actions(driver);
			act.moveToElement(sitem).build().perform();
			driver.findElement(By.linkText("Unit of Measurement")).click();
			driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a")).click();
			driver.findElement(By.id("x_UOM_ID")).sendKeys(Uid);
			driver.findElement(By.id("x_UOM_Description")).sendKeys(Udesc);
			driver.findElement(By.id("btnAction")).click();
			Sleeper.sleepTightInSeconds(10);
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
			String actval=driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[3]/div/div")).getText();
            driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[4]/div[2]/button")).click();
			Sleeper.sleepTightInSeconds(5);
			String count=driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[2]/form/div[2]/span[2]")).getText();
			String[] split=count.split(" ");
            int count1=Integer.parseInt(split[2]);
			int pcount=0;
			System.out.println(split[0]+"--"+split[1]+"--"+split[2]);
			do 
			{
				List<WebElement> rows=driver.findElements(By.xpath(".//*[@id='tbl_a_unit_of_measurementlist']/tbody/tr"));
				for (int i = 0; i < rows.size(); i++) 
				{
				    List<WebElement> cols=rows.get(i).findElements(By.tagName("td"));
					String acttext=cols.get(2).getText();
					if (acttext.equalsIgnoreCase(Uid)) 
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
				
			} 
			while (pcount<=count1);

			if (flag==true) 
			{
				return "Pass";
			}
			else
			{
				return "Fail";
			}
		}
	 	/*FunctionName			 :stockAcs_stockitemcreation
	 	 * Arguments 			 :categoey,supplier number,stock name,unit of measurement,buying price,selling,notes
	 	 * Description			 :It will create the stockaccounting stock items creation
	 	 * Return Type			 :String
	 	 * Author     			 :Mahesh
	 	 * Date of Implementation:18/06/2016 
	 	 */
	
	 	public String stockAcc_stockitems(String category,String Suppliernumber,String stockname,String unitofmeasurement,String purchasingprice,String sellingprice,String notes)
	 	{
	 		String expval="Add succeeded";
			String actval;
			driver.findElement(By.linkText("Stock Items")).click();
			driver.findElement(By.xpath(".//*[@id='ewContentColumn']/div[3]/div[1]/div[1]/div[1]/div/a")).click();
			driver.findElement(By.id("aol_x_Category")).click();
			driver.findElement(By.id("x_Category_Name")).sendKeys(category);
			driver.findElement(By.xpath(".//*[@id='ewAddOptDialog']/div/div/div[3]/button[1]")).click();
			driver.findElement(By.id("x_Supplier_Number")).sendKeys(Suppliernumber);
			driver.findElement(By.id("x_Stock_Name")).sendKeys(stockname);
	        driver.findElement(By.id("x_Unit_Of_Measurement")).sendKeys(unitofmeasurement);
	        driver.findElement(By.id("x_Purchasing_Price")).sendKeys(purchasingprice);
	        driver.findElement(By.id("x_Selling_Price")).sendKeys(sellingprice);
	        driver.findElement(By.id("x_Notes")).sendKeys(notes);
	        driver.findElement(By.id("btnAction")).click();
	        driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[4]/div[2]/button")).click();
	 		actval=driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[3]/div/div")).getText();
	 		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	 		driver.findElement(By.xpath("html/body/div[17]/div[2]/div/div[4]/div[2]/button")).click();
	        if(expval.equalsIgnoreCase(actval))
	        {
		    return "pass";
	        }
	       else
	        {
		   return"fail";
	        }
			


		}
	 	
}




