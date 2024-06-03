package com.test.repo;

import java.util.Scanner;
import org.openqa.selenium.JavascriptExecutor;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.test.objects.objectsRepository;



public class Login {

	WebDriver driver;	
	
	objectsRepository objectsRepository;
	
	By hoverAccount = By.xpath("/html/body/div[1]/header/div[3]/div/div[1]/div[3]/ul/li[2]/div/a");

	By loginBtn = By.xpath("/html/body/div[1]/header/div[3]/div/div[1]/div[3]/ul/li[2]/div/div/ul/li/a");
	// By txtMob=By.xpath("//input[contains(@id,'user_mobile')]");

	By txtMob = By.id("user_mobile");

	By btnGetOTP = By.id("sendotp");

	By txtOTP = By.id("user_otp");

	By btnLogin = By.id("btn_login");

	By btnlogoutBy = By.xpath("//a[contains(@href,'/login?handler=LogOut')]");

	By linkCartBy = By.xpath("/html/body/div[1]/main/div[1]/div/div[2]/form/div[2]/div[2]/div[2]/div[1]/button");

	public Login(WebDriver driverParam) {

		this.driver = driverParam;
	}
	
	

	@SuppressWarnings("deprecation")
	public void accountHover() throws InterruptedException {

		// JavascriptExecutor js = (JavascriptExecutor) driver;
		// //use executeScript() method and pass the arguments
		// //Here i pass values based on css style. Yellow background color with solid
		// red color border.
		// js.executeScript("arguments[0].setAttribute('style', 'background: yellow;
		// border: 2px solid red;');", hoverAccount);
		// Thread.sleep(5000);

		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(hoverAccount)).perform();
		Thread.sleep(5000);

		WebElement loginbn = driver.findElement(loginBtn);
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].setAttribute('style','background : yellow;border: 2px solid red');",	loginbn);
		Thread.sleep(6000);
		driver.findElement(loginBtn).click();
		Thread.sleep(5000);

		driver.findElement(txtMob).sendKeys("9769283591");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(btnGetOTP).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Scanner scanner_user = new Scanner(System.in);
		System.out.println("Enter the OTP: ");
		String user = scanner_user.nextLine();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(txtOTP).sendKeys(user);
		scanner_user.close();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(btnLogin).click();
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
}
