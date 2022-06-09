package com.selenium;

import org.openqa.selenium.By;
import com.FacebookAutomation.BaseTest;

public class ProgressBar extends BaseTest {

	
	public void progressBarClick()
	{
	driver.findElement(By.id("startStopButton")).click();
	System.out.println("Start button clicked");

	driver.findElement(By.id("startStopButton")).click();
	System.out.println("Start button stopped");
	}
}
