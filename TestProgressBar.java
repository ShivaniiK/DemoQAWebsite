package com.selenium;

public class TestProgressBar {

	public static void main(String[] args) {
	
		ProgressBar objProgressBar= new ProgressBar();
		objProgressBar.intializationDriver("https://demoqa.com/progress-bar");
		objProgressBar.progressBarClick();
	}

}
