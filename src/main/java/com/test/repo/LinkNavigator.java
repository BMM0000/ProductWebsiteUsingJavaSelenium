package com.test.repo;

import java.security.PublicKey;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.test.objects.objectsRepository;

public class LinkNavigator {

	WebDriver driver;

	By homeLink = By.xpath("/html/body/div[1]/header/div[3]/div/div/nav/div/ul/li[1]/a");
	By productLink = By.xpath("/html/body/div[1]/header/div[2]/div/div/nav/div/ul/li[2]/a[1]");
	By subMenuProduct = By.xpath("//a[contains(@href,'/product/2/automos/refill-pack-90-days')]");
	By incrementBtn = By.xpath("/html/body/div[1]/main/div[1]/div/div[2]/form/div[2]/div[1]/div/div/div/div[3]");
	By decrementBtn = By.xpath("/html/body/div[1]/main/div[1]/div/div[2]/form/div[2]/div[1]/div/div/div/div[4]");
	By btnCartGo = By.xpath("/html/body/div[1]/main/div[1]/div/div[2]/form/div[2]/div[2]/div[2]/div[1]/button");
	By addVoucher=By.id("coupon-code");
	By applyVoucher=By.xpath("/html/body/div[1]/main/div[1]/div[2]/div[1]/div/div/div/div[2]/button[1]");
	                         
	public LinkNavigator(WebDriver driverParam) {

		this.driver = driverParam;

	}

	public void clickProductSubMenu() throws InterruptedException {

		try {

			Actions actions = new Actions(driver);
			actions.moveToElement(driver.findElement(homeLink)).perform();
			Thread.sleep(5000);
			driver.findElement(homeLink).click();
		} catch (Exception e) {

			e.printStackTrace();
		}

		try {

			WebElement productlinkElement = driver.findElement(productLink);
			JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
			javascriptExecutor.executeScript("arguments[0].setAttribute('style', 'background: yellow ; border : 2px solid red');",productlinkElement);
			Thread.sleep(4000);

			Actions actions = new Actions(driver);
			actions.moveToElement(driver.findElement(productLink)).perform();
			Thread.sleep(4000);
		} catch (Exception e) {

			e.printStackTrace();
		}

		WebElement subMenuProductElement = driver.findElement(subMenuProduct);
		JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
		javascriptExecutor.executeScript(
				"arguments[0].setAttribute('style', 'background: yellow ; border : 2px solid red');",
				subMenuProductElement);
		Thread.sleep(4000);
		driver.findElement(subMenuProduct).click();
		Thread.sleep(5000);
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0, 260)");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Increase/decrease quantity & add product to cart
	public void addToCart() {

		try {

			WebElement incrementWebElement = driver.findElement(incrementBtn);
			JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
			javascriptExecutor.executeScript("arguments[0].setAttribute('style', 'background: yellow ; border : 2px solid red');",incrementWebElement);
			Thread.sleep(4000);
			driver.findElement(incrementBtn).click();
			Thread.sleep(4000);
			javascriptExecutor.executeScript("arguments[0].setAttribute('style','');", incrementWebElement);
			Thread.sleep(4000);
			javascriptExecutor.executeScript("arguments[0].setAttribute('style', 'background: yellow ; border : 2px solid red');",incrementWebElement);
			driver.findElement(incrementBtn).click();
			Thread.sleep(4000);
			javascriptExecutor.executeScript("arguments[0].setAttribute('style','');", incrementWebElement);
			Thread.sleep(4000);

			WebElement decrementWebElement = driver.findElement(decrementBtn);
			JavascriptExecutor javascriptExecutor0 = (JavascriptExecutor) driver;
			javascriptExecutor0.executeScript("arguments[0].setAttribute('style', 'background: yellow ; border : 2px solid red');",	decrementWebElement);
			Thread.sleep(4000);
			driver.findElement(decrementBtn).click();
			Thread.sleep(4000);
			javascriptExecutor.executeScript("arguments[0].setAttribute('style','');", decrementWebElement);
			Thread.sleep(3000);		
			

			WebElement btnCartGoElement = driver.findElement(btnCartGo);
			JavascriptExecutor javascriptExecutor1 = (JavascriptExecutor) driver;
			javascriptExecutor1.executeScript("arguments[0].setAttribute('style', 'background: yellow ; border : 2px solid red');",	btnCartGoElement);
			Thread.sleep(4000);			
			
			driver.findElement(btnCartGo).click();
			Thread.sleep(5000);
			
		} catch (Exception e) {

			e.printStackTrace();
		}

	}
	
}
