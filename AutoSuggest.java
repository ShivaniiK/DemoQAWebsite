package com.selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.FacebookAutomation.BaseTest;

public class AutoSuggest extends BaseTest {

	
	public void autoSuggestClick()
	{
	
		WebElement autoSuggest = driver.findElement(By.className("form-control"));
	   autoSuggest.sendKeys("Selenium Tutorials");
	 // print the auto suggest
	    System.out.println("Selenium Webriver Results");
	    
	    
	    /*
		* driver.findElement(By.id("autoCompleteMultipleContainer")).sendKeys("Red");
		*WebElement autoSuggest =
		* driver.findElements(By.className("auto-complete__control css-yk16xz-control")
		*  autoSuggest.sendKeys("SeleniumWebriver"); alpha.click();
		* break; }
		*/
}
}