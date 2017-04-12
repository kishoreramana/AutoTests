package com.sample.projects.dvla.vehiclecheck;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class VehicleDetailsPage {

	WebDriver driver;

	public VehicleDetailsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//span[@class='registrationNumber']")
	@CacheLookup
	WebElement vdRegNum;

	@FindBy(tagName="li[1]", how = How.XPATH, using = "//span[text='Vehicle make']")
	@CacheLookup
	WebElement vdMake;

	public WebElement getVdRegNum() {
		return vdRegNum;
	}

	public WebElement getVdMake() {
		return vdMake;
	}

	public void closeDriver() {
		this.driver.close();
	}
}
