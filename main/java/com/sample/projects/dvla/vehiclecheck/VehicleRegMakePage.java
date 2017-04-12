package com.sample.projects.dvla.vehiclecheck;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class VehicleRegMakePage {

	WebDriver driver;

	public VehicleRegMakePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "Vrm")
	@CacheLookup
	WebElement vehicleRegNum;

	@FindBy(id = "Make")
	@CacheLookup
	WebElement vehicleMake;

	@FindBy(how = How.ID, using = "Search")
	@CacheLookup
	WebElement submitButton;

	public void searchVehicleDetails(String vehicleRegNum, String vehicleMake) {
		this.vehicleRegNum.sendKeys(vehicleRegNum);
		this.vehicleMake.sendKeys(vehicleMake);
		submitButton.click();
	}
	
	public void closeDriver(){
		this.driver.close();
	}
}
