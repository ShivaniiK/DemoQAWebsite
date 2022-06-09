package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.FacebookAutomation.BaseTest;

public class UploadDownload extends BaseTest {

	
	public void uploadFile() {                       //FileUpload
		
		Actions act = new Actions(driver);
		WebElement chooseFile = driver.findElement(By.id("uploadFile"));
		act.moveToElement(chooseFile).perform();
		chooseFile.sendKeys("D:\\Selenium\\facebook assignment.txt");
		System.out.println("File Uploaded Sucessfully");
	
		
	}
	
	
	public void fileDownload()  {               //FileDownload
		
		driver.findElement(By.id("downloadButton")).click();
		System.out.println("File Downloaded Sucessfully");
	}
}
