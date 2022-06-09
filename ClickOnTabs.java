package com.selenium;

import org.openqa.selenium.By;

import com.FacebookAutomation.BaseTest;

public class ClickOnTabs extends BaseTest {

	public void clickTabs()
	{
	driver.findElement(By.id("demo-tab-what")).click();

	System.out.println("Clicked on Origin Tab.");
	driver.findElement(By.id("demo-tab-use")).click();

	System.out.println("Clicked on Use Tab.");
	driver.findElement(By.id("demo-tab-use")).click();
	
	System.out.println("Clicked on What Tab.");

	}
}
