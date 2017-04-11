package com.sample.projects.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VehicleDetails extends SampleBase {

	public WebDriver webDriver;
	public By vehicleRegNum = By.id("Vrm");
	public By vehicleMake = By.id("Make");

	public VehicleDetails(WebDriver webDriver) {
		this.webDriver = webDriver;
	}

	public WebElement getVehicleRegNum() {
		return webDriver.findElement(vehicleRegNum);
	}

	public WebElement getVehicleMake() {
		return webDriver.findElement(vehicleMake);
	}
}
