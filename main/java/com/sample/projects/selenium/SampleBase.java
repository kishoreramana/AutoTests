package com.sample.projects.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleBase {

	public WebDriver webDriver = null;

	public WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver","C:/Program Files (x86)/Google/Chrome/Application/chrome.exe");
		webDriver = new ChromeDriver();
		return webDriver;
	}

}
