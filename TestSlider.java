package com.selenium;

public class TestSlider {

	public static void main(String[] args) {
		
		SliderEx objSliderEx= new SliderEx();
		objSliderEx.intializationDriver("https://jqueryui.com/slider/");
		objSliderEx.slider();
	}

}
