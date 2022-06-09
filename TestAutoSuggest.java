package com.selenium;

public class TestAutoSuggest {

	public static void main(String[] args) {
		 AutoSuggest objAutoSuggest = new AutoSuggest();
		 objAutoSuggest.intializationDriver("https://www.tutorialspoint.com");
		 objAutoSuggest.autoSuggestClick();
	}

}
