package com.test.repo;

import com.test.objects.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class AddressAdder {

	WebDriver driver;

	public AddressAdder(WebDriver driverParam) {

		this.driver = driverParam;

	}

	public void addAddress() throws InterruptedException {

		// Click Cart Link
		driver.findElement(objectsRepository.cartLink).click();
		Thread.sleep(5000);

		// Click proceed to checkout button
		driver.findElement(objectsRepository.checkoutBtn).click();
		Thread.sleep(5000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 250)");

		// Click to check check box
		driver.findElement(objectsRepository.checkboxTick).click();
		Thread.sleep(5000);

		// Fill all address details
		driver.findElement(objectsRepository.txtname).sendKeys("Bhavin M");
		Thread.sleep(5000);

		driver.findElement(objectsRepository.txtmob).sendKeys("9769283591");
		Thread.sleep(5000);

		driver.findElement(objectsRepository.txtemail).sendKeys("bhavin.mistry@hicare.in");
		Thread.sleep(5000);

		driver.findElement(objectsRepository.txtflat).sendKeys("T 555");
		Thread.sleep(5000);

		driver.findElement(objectsRepository.txtbldg).sendKeys("Exotica");
		Thread.sleep(5000);

		driver.findElement(objectsRepository.txtstreet).sendKeys("TPS");
		Thread.sleep(5000);

		driver.findElement(objectsRepository.txtloc).sendKeys("McDonalds");
		Thread.sleep(5000);

		driver.findElement(objectsRepository.txtlandmark).sendKeys("Gym");
		Thread.sleep(5000);

		JavascriptExecutor jss = (JavascriptExecutor) driver;
		jss.executeScript("window.scrollBy(0, 250)");

		driver.findElement(objectsRepository.txtcity).sendKeys("Borivali");
		Thread.sleep(5000);

		driver.findElement(objectsRepository.txtpincode).sendKeys("400092");
		Thread.sleep(5000);

		driver.findElement(objectsRepository.txtgstno).sendKeys("12AAACXXXXXXB1Z1");
		Thread.sleep(5000);

		driver.findElement(objectsRepository.btnAccepterms).click();
		Thread.sleep(5000);

		driver.findElement(objectsRepository.btnConfirmPay).click();
		Thread.sleep(5000);

		System.out.println("Process Complete");

	}

}
