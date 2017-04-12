package com.sample.projects.dvla.vehiclecheck;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class VehicleDetailsPage {

	WebDriver driver;

	private static String VEHICLE_MAKE = "FIAT";

	public VehicleDetailsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//span[@class='registrationNumber']")
	WebElement vdRegNum;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Vehicle make')]/")
	WebElement vdMake;

	@FindBy(how = How.XPATH, using = "//h3[contains(text(),'Vehicle details could not be found')]")
	WebElement vdNotFound;

	public WebElement getVdRegNum() {
		return vdRegNum;
	}

	public WebElement getVdMake() {
		return vdMake;
	}

	public WebElement getVdNotFound() {
		return vdNotFound;
	}
}
