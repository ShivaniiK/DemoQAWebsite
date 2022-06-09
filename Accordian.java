package com.selenium;

import org.openqa.selenium.By;

import com.FacebookAutomation.BaseTest;

public class Accordian extends BaseTest {

	public void accordianExample()
	{
	driver.findElement(By.className("card-header")).click();
	
	System.out.println("Accordian clicked");
	}
}
