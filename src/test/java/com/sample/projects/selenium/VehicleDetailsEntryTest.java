package com.sample.projects.selenium;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.sample.projects.dvla.vehiclecheck.BrowserFactory;
import com.sample.projects.dvla.vehiclecheck.VehicleDetailsPage;
import com.sample.projects.dvla.vehiclecheck.VehicleRegMakePage;

public class VehicleDetailsEntryTest {

	private static final String BROWSER = "Chrome";
	private static final String URL = "https://vehicleenquiry.service.gov.uk/";

	private WebDriver driver;
	private VehicleRegMakePage vehicleRegMakePage;
	private VehicleDetailsPage vehicleDetailsPage;

	private String vehicleRegNum = null;
	private String vehicleMake = null;

	@Before
	public void setUp() {
		driver = BrowserFactory.startBrowser(BROWSER, URL);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@After
	public void tearDown() {
		driver.close();
	}

	@Test
	public void verifyVehicleDetails_01() throws InterruptedException {
		vehicleRegNum = "MT08 ZTG";
		vehicleMake = "NISSAN";
		vehicleRegMakePage = new VehicleRegMakePage(driver);
		vehicleRegMakePage.searchVehicle(vehicleRegNum, vehicleMake);
		vehicleDetailsPage = new VehicleDetailsPage(driver);

		Assert.assertTrue(vehicleDetailsPage.getVdRegNum().getText().equalsIgnoreCase(vehicleRegNum));
	}

	@Test
	public void verifyVehicleDetails_02() throws InterruptedException {
		vehicleRegNum = "EA07 AWR";
		vehicleMake = "FIAT";
		vehicleRegMakePage = new VehicleRegMakePage(driver);
		vehicleRegMakePage.searchVehicle(vehicleRegNum, vehicleMake);
		vehicleDetailsPage = new VehicleDetailsPage(driver);

		Assert.assertTrue(vehicleDetailsPage.getVdRegNum().getText().equalsIgnoreCase(vehicleRegNum));
	}

	@Test
	public void verifyVehicleDetails_03() throws InterruptedException {
		vehicleRegNum = "EA07 AWS";
		vehicleMake = "FIAT";
		vehicleRegMakePage = new VehicleRegMakePage(driver);
		vehicleRegMakePage.searchVehicle(vehicleRegNum, vehicleMake);
		vehicleDetailsPage = new VehicleDetailsPage(driver);
		Assert.assertTrue(vehicleDetailsPage.getVdNotFound().getText().equalsIgnoreCase("Vehicle details could not be found"));
	}
}
