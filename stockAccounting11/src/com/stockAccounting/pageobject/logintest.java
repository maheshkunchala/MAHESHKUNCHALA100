package com.stockAccounting.pageobject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class logintest 
{
	@Test
	public void login()
	{
		WebDriver driver=new FirefoxDriver();
		loginpage lp=PageFactory.initElements(driver, loginpage.class);
		adminhomepage am=PageFactory.initElements(driver, adminhomepage.class);
		driver.get(lp.url);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	    lp.S_login(lp.u, lp.p);
		Sleeper.sleepTightInSeconds(5);
		am.administratorclick();
		am.cutomersclick();
		am.dashboardclick();
		am.outstandingsclick();
		am.stockitemsclick();
		am.purchasesclick();
		am.salesclick();
		am.settingsclick();
		Sleeper.sleepTightInSeconds(5);
		am.logoutclick();
		Sleeper.sleepTightInSeconds(5);
		driver.close();
}

	
		
	}

