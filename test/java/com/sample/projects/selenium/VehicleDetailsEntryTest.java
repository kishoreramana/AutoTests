package com.sample.projects.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.sample.projects.dvla.vehiclecheck.BrowserFactory;
import com.sample.projects.dvla.vehiclecheck.VehicleDetailsPage;
import com.sample.projects.dvla.vehiclecheck.VehicleRegMakePage;

public class VehicleDetailsEntryTest {

	WebDriver driver;
	VehicleRegMakePage vehicleRegMakePage;
	VehicleDetailsPage vehicleDetailsPage;

	@BeforeTest
	public void setup() {
		driver = BrowserFactory.startBrowser("Chrome", "https://vehicleenquiry.service.gov.uk/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test(priority = 0)
	public void check() throws InterruptedException {
		vehicleRegMakePage = new VehicleRegMakePage(driver);
		vehicleRegMakePage.searchVehicleDetails("MT08 ZTG", "NISSAN");

		vehicleDetailsPage = new VehicleDetailsPage(driver);

		System.out.println("vehicleDetailsPage.getVdRegNum().getText() : "+vehicleDetailsPage.getVdRegNum().getText());
		System.out.println("vehicleDetailsPage.getVdMake().getText() : "+vehicleDetailsPage.getVdMake().getText());
		Assert.assertTrue(vehicleDetailsPage.getVdRegNum().getText().equalsIgnoreCase("MT08 ZTG"));

		Thread.sleep(5000);
		vehicleDetailsPage.closeDriver();
	}
}
