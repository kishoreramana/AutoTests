package com.sample.projects.selenium;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.sample.projects.dvla.vehiclecheck.BrowserFactory;
import com.sample.projects.dvla.vehiclecheck.VehicleRegMakePage;

public class VehicleDetailsEntryTest {

	@Test
	public void check() throws InterruptedException{
		WebDriver driver = BrowserFactory.startBrowser("Chrome", "https://vehicleenquiry.service.gov.uk/");
		VehicleRegMakePage vehicleDetailsEntryCheck = PageFactory.initElements(driver, VehicleRegMakePage.class);
		vehicleDetailsEntryCheck.searchVehicleDetails("MT08ZTG", "NISSAN");
		Thread.sleep(5000);
		vehicleDetailsEntryCheck.closeDriver();
	}
}
