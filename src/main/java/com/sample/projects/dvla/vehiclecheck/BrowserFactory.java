package com.sample.projects.dvla.vehiclecheck;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {

	static WebDriver driver;
		
	public static WebDriver startBrowser(String browserName, String url){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ArchanaKishore\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}
}
