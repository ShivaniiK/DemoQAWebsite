package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.FacebookAutomation.BaseTest;

public class SliderEx extends BaseTest {

	public void slider()
	{
	try
	{
	Actions action = new Actions(driver);
	driver.switchTo().frame(0);
	WebElement elem_slider = driver.findElement(By.cssSelector(".ui-slider-handle"));

	action.clickAndHold(elem_slider).moveByOffset(40,0).release().perform();

	System.out.println("Slider Dragged successfully\n");
	
	}
	catch (Exception e)
	{
	System.out.println(e.getMessage());
	}
}
}
