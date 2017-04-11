package com.sample.projects.dvla.vehiclecheck;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class VehicleDetailsPage {

	WebDriver driver;

	public VehicleDetailsPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//span[text()='Settings']")
	@CacheLookup
	WebElement vehicleRegNum;

	@FindBy(how = How.XPATH, using = "//span[text()='Settings']")
	@CacheLookup
	WebElement vehicleMake;

	
	public WebElement getVehicleRegNum() {
		return vehicleRegNum;
	}

	public WebElement getVehicleMake() {
		return vehicleMake;
	}

	public void closeDriver(){
		this.driver.close();
	}
}
