package com.test.runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.test.repo.AddressAdder;
import com.test.repo.LinkNavigator;
import com.test.repo.Login;
import com.thread.storage.ThreadStorage;

public class LoginToCheckoutRunner {

	public WebDriver driver;

	Login objLogin;      
	LinkNavigator objLinkNavigation;
	AddressAdder objAddAddress;
	ThreadStorage objThreadStorage;

	@org.testng.annotations.Test(priority = 1)
	public void theUserIsOnLoginPage() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		Thread.sleep(10000);
		driver.get("https://product.hicare.in");		
		Thread.sleep(6000);
		driver.manage().window().maximize();
	}

	@org.testng.annotations.Test(priority = 2)
	public void theUserEntersValidCredentials() throws InterruptedException {

		Thread.sleep(5000);
		objLogin = new Login(driver);
		objLogin.accountHover();

	}

	@org.testng.annotations.Test(priority = 3)
	public void hoverLink() throws InterruptedException {

		Thread.sleep(10000);
		objLinkNavigation = new LinkNavigator(driver);
		objLinkNavigation.clickProductSubMenu();

	}

	@org.testng.annotations.Test(priority = 4)
	public void addProductToCart() throws InterruptedException {

		Thread.sleep(7000);
		objLinkNavigation = new LinkNavigator(driver);
		objLinkNavigation.addToCart();

	}

	@org.testng.annotations.Test(priority = 5)
	public void address() throws InterruptedException {

		Thread.sleep(7000);
		objAddAddress = new AddressAdder(driver);
		objAddAddress.addAddress();

	}

}
