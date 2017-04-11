package com.sample.projects.selenium;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SampleBaseTest {

	@Test
	public void testVehicleEntry() throws InterruptedException {
		SampleBase sampleBase = new SampleBase();
		WebDriver driver = sampleBase.getDriver();
		VehicleDetailsEntry vehicleDetailsEntry = PageFactory.initElements(driver, VehicleDetailsEntry.class);

		String url = "";
		driver.get(url);
		driver.manage().window().maximize();
		vehicleDetailsEntry.formFillUp("MT08ZTG", "NISSAN");
		Thread.sleep(5000);
		driver.close();
	}
}
