package com.stockAccounting.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginpage 
{
	public static String url="http://webapp.qedgetech.com";
	public static String u="admin",p="master";
	
	@FindBy(id="username")
	WebElement Username;
	@FindBy(id="password")
	WebElement Password;
	@FindBy(id="btnsubmit")
	WebElement Login;
	@FindBy(id="btnreset")
	WebElement Reset;
	
public void S_login(String u,String p)
{
	Username.clear();
	Username.sendKeys(u);
	Password.clear();
	Password.sendKeys(p);
	Login.click();
	
}


}
