package com.sample.projects.selenium;

import org.openqa.selenium.WebDriver;

public class VehicleDetailsEntry extends VehicleDetails {

	public VehicleDetailsEntry(WebDriver webDriver) {
		super(webDriver);
	}

	public void formFillUp(String vehicleRegNum, String vehicleMake) {
		getVehicleRegNum().clear();
		getVehicleRegNum().sendKeys(vehicleRegNum);
		getVehicleMake().clear();
		getVehicleMake().sendKeys(vehicleMake);
	}
}
