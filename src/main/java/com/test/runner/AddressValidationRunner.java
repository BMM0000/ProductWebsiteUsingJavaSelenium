package com.test.runner;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import com.test.objects.objectsRepository;
import com.test.repo.AddressValidator;
import com.test.repo.LinkNavigator;
import com.sun.tools.javac.resources.compiler;
import com.thread.storage.*;

public class AddressValidationRunner {

	public WebDriver driver;
	AddressValidator objaddressValidator;
	LinkNavigator objLinkNavigator;
	ThreadStorage objThreadStorage;

	@Test(priority = 1)
	public void navigateUrl() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		objThreadStorage.sleep3000();
		driver.get("https://product.hicare.in");
		objThreadStorage.sleep5000();
		driver.manage().window().maximize();
	}

	@Test(priority = 2)
	public void performLogin() throws InterruptedException {

		objThreadStorage.sleep5000();
		objaddressValidator = new AddressValidator(driver);
		objaddressValidator.performLogin();

	}

	@Test(priority = 3)
	public void addBillingAddress() throws InterruptedException {

		objThreadStorage.sleep5000();
		objLinkNavigator = new LinkNavigator(driver);
		objLinkNavigator.clickProductSubMenu();
		objThreadStorage.sleep3000();
		objLinkNavigator.addToCart();

		objThreadStorage.sleep3000();
		objaddressValidator = new AddressValidator(driver);
		objaddressValidator.addAddress();

	}
}
