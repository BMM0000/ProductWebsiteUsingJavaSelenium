package com.test.objects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class objectsRepository {

	public static By hoverAccount = By.xpath("/html/body/div[1]/header/div[3]/div/div[1]/div[3]/ul/li[2]/div/a");
	public static By loginBtn = By.xpath("/html/body/div[1]/header/div[3]/div/div[1]/div[3]/ul/li[2]/div/div/ul/li/a");
	public static By txtMob = By.id("user_mobile");
	public static By btnGetOTP = By.id("sendotp");
	public static By txtOTP = By.id("user_otp");
	public static By btnLogin = By.id("btn_login");
	public static By btnlogoutBy = By.xpath("//a[contains(@href,'/login?handler=LogOut')]");
	public static By linkCartBy = By.xpath("/html/body/div[1]/main/div[1]/div/div[2]/form/div[2]/div[2]/div[2]/div[1]/button");
	public static By cartLink = By.id("cart-count");
	public static By checkoutBtn = By.xpath("//a[contains(@href,'/checkout\')]");
	public static By checkboxTick = By.xpath("/html/body/div[1]/main/div[1]/div[2]/div[1]/div/div/div/div[2]/label/span");
	public static By txtname = By.id("pay_fname");
	public static By txtmob = By.id("pay_mobile");
	public static By txtemail = By.id("pay_email");
	public static By txtflat = By.id("pay_flat");
	public static By txtbldg = By.id("pay_building");
	public static By txtstreet = By.id("pay_street");
	public static By txtloc = By.id("pay_locality");
	public static By txtlandmark = By.id("pay_landmark");
	public static By txtcity = By.id("pay_city");
	public static By txtpincode = By.id("pay_pincode");
	public static By txtgstno = By.id("pay_gst_no");
	public static By btnAccepterms = By.xpath("/html/body/div[1]/main/div[1]/div[2]/div[3]/div/div/div[2]/label/span");
	public static By btnConfirmPay = By.id("btn_rzp_payment");
	public static By drpDwnShippingAddress = By.xpath("/html/body/div[1]/main/div[1]/div[2]/div[1]/div/div/div/div[1]/div/div/a/img");
	public static By selectShippingAddress = By.xpath("/html/body/div[1]/main/div[1]/div[2]/div[1]/div/div/div/div[1]/div/ul/li[2]/a/img");
	public static By addVoucher=By.id("coupon-code");
	public static By applyVoucher=By.xpath("/html/body/div[1]/main/div[1]/div[2]/div[1]/div/div/div/div[2]/button[1]");
	
} 
