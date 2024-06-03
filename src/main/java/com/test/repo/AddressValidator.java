package com.test.repo;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import com.test.objects.objectsRepository;

public class AddressValidator {

	WebDriver driver;

	public AddressValidator(WebDriver driverParam) {

		this.driver = driverParam;
	}

	public void performLogin() throws InterruptedException {

		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(objectsRepository.hoverAccount)).perform();
		Thread.sleep(5000);

		WebElement loginbn = driver.findElement(objectsRepository.loginBtn);
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].setAttribute('style','background : yellow;border: 2px solid red');",	loginbn);
		Thread.sleep(6000);
		driver.findElement(objectsRepository.loginBtn).click();
		Thread.sleep(5000);

		driver.findElement(objectsRepository.txtMob).sendKeys("9769283591");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(objectsRepository.btnGetOTP).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Scanner scanner_user = new Scanner(System.in);
		System.out.println("Enter the OTP: ");
		String user = scanner_user.nextLine();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(objectsRepository.txtOTP).sendKeys(user);
		scanner_user.close();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(objectsRepository.btnLogin).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Verify Successful login
		// Verify Page Title
		if (driver.getTitle().contains("Buy Best Insect Repellent and Catcher Machine Online in India | HiCare")) {

			System.out.print("Login Successful, Welcome to Homepage\n");

			String scriptString = "alert('Login Success, Welcome!!!');";
			((JavascriptExecutor) driver).executeScript(scriptString);

		} else {

			System.out.println("Login failed!");
		}

	}

	public void addAddress() throws InterruptedException {
				

		driver.findElement(objectsRepository.cartLink).click();
		Thread.sleep(5000);
		
		driver.findElement(objectsRepository.addVoucher).sendKeys("hicarep02");
		Thread.sleep(3000);
					
		driver.findElement(objectsRepository.applyVoucher).click();
		Thread.sleep(3000);

		// Click proceed to checkout button
		driver.findElement(objectsRepository.checkoutBtn).click();
		Thread.sleep(5000);
		 
	     driver.findElement(objectsRepository.checkboxTick).click();
 	     Thread.sleep(5000);

		WebElement btnConfirmElement = driver.findElement(objectsRepository.btnConfirmPay);
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].setAttribute('style','background : yellow;border: 2px solid red');",	btnConfirmElement);
		Thread.sleep(6000);
		driver.findElement(objectsRepository.btnConfirmPay).click();
		jsExecutor.executeScript("arguments[0].setAttribute('style','');", btnConfirmElement);
		Thread.sleep(5000);
		
		WebElement txtnamElement = driver.findElement(objectsRepository.txtname);
		JavascriptExecutor jsExecutora = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].setAttribute('style','background : lightblue;border: 2px solid red');",	txtnamElement);
		driver.findElement(objectsRepository.txtname).sendKeys("Bhavin M");
		Thread.sleep(3000);
		driver.findElement(objectsRepository.btnConfirmPay).click();
		jsExecutora.executeScript("arguments[0].setAttribute('style','');", txtnamElement);
		Thread.sleep(3000);

		
		WebElement txtmobElement = driver.findElement(objectsRepository.txtmob);
		JavascriptExecutor jsExecutorb = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].setAttribute('style','background : lightblue;border: 2px solid red');",	txtmobElement);
		driver.findElement(objectsRepository.txtmob).sendKeys("976928");
		Thread.sleep(3000);
		driver.findElement(objectsRepository.btnConfirmPay).click();
		Thread.sleep(3000);
		driver.findElement(objectsRepository.txtmob).clear();
		Thread.sleep(3000);		
		driver.findElement(objectsRepository.txtmob).sendKeys("9769283591");
		Thread.sleep(3000);
		driver.findElement(objectsRepository.btnConfirmPay).click();
		jsExecutora.executeScript("arguments[0].setAttribute('style','');", txtmobElement);
		Thread.sleep(3000);
		
		
		WebElement txtemailElement = driver.findElement(objectsRepository.txtemail);
		JavascriptExecutor jsExecutorc = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].setAttribute('style','background : lightblue;border: 2px solid red');",	txtemailElement);
		driver.findElement(objectsRepository.txtemail).sendKeys("bhavin.mistry@");
		Thread.sleep(3000);
		driver.findElement(objectsRepository.btnConfirmPay).click();
		Thread.sleep(3000);
		driver.findElement(objectsRepository.txtemail).clear();
		Thread.sleep(2000);
		driver.findElement(objectsRepository.txtemail).sendKeys("bhavin.mistry@hicare.in");
		Thread.sleep(3000);
		driver.findElement(objectsRepository.btnConfirmPay).click();
		jsExecutora.executeScript("arguments[0].setAttribute('style','');", txtemailElement);
		Thread.sleep(3000);

		driver.findElement(objectsRepository.txtflat).sendKeys("T 555");
		Thread.sleep(3000);
		driver.findElement(objectsRepository.btnConfirmPay).click();
		Thread.sleep(3000);

		driver.findElement(objectsRepository.txtbldg).sendKeys("Jubilee CHS");
		Thread.sleep(3000);
		driver.findElement(objectsRepository.btnConfirmPay).click();
		Thread.sleep(3000);

		driver.findElement(objectsRepository.txtstreet).sendKeys("TPS");
		Thread.sleep(3000);
		driver.findElement(objectsRepository.btnConfirmPay).click();
		Thread.sleep(3000);

		driver.findElement(objectsRepository.txtloc).sendKeys("McDonalds");
		Thread.sleep(3000);
		driver.findElement(objectsRepository.btnConfirmPay).click();
		Thread.sleep(3000);

		driver.findElement(objectsRepository.txtlandmark).sendKeys("Ganesh Temple");
		Thread.sleep(3000);
		driver.findElement(objectsRepository.btnConfirmPay).click();
		Thread.sleep(3000);

		JavascriptExecutor jss = (JavascriptExecutor) driver;
		jss.executeScript("window.scrollBy(0, 250)");

		driver.findElement(objectsRepository.txtcity).sendKeys("Borivali");
		Thread.sleep(3000);
		driver.findElement(objectsRepository.btnConfirmPay).click();
		Thread.sleep(3000);

		driver.findElement(objectsRepository.txtpincode).sendKeys("400092");
		Thread.sleep(3000);
		driver.findElement(objectsRepository.btnConfirmPay).click();
		Thread.sleep(3000);

		driver.findElement(objectsRepository.txtgstno).sendKeys("12AAACXXXXXXB1Z1");
		Thread.sleep(3000);
		driver.findElement(objectsRepository.btnConfirmPay).click();
		Thread.sleep(3000);
		
		jss.executeScript("window.scrollBy(0, -250)");
		Thread.sleep(3000);
		
		jss.executeScript("window.scrollBy(0, -250)");
		Thread.sleep(3000);
		
		driver.findElement(objectsRepository.drpDwnShippingAddress).click();
		Thread.sleep(3000);
		driver.findElement(objectsRepository.selectShippingAddress).click();
		Thread.sleep(3000);
		
		driver.findElement(objectsRepository.btnConfirmPay).click();
		Thread.sleep(5000);		
		
		driver.findElement(objectsRepository.btnAccepterms).click();
		Thread.sleep(5000);
		
		driver.findElement(objectsRepository.btnConfirmPay).click();
		Thread.sleep(5000);
		
		

	}

}
