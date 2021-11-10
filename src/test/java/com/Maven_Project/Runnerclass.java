package com.Maven_Project;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.Nov_Project.Base_Class;
import com.Pom_Class.Address_Page;
import com.Pom_Class.Casual_Dress;
import com.Pom_Class.Checkout;
import com.Pom_Class.Home_Page;
import com.Pom_Class.Order;
import com.Pom_Class.Payment_Process;
import com.Pom_Class.Shipping;
import com.Pom_Class.SignIn_Page;

public class Runnerclass extends Base_Class {

	public static WebDriver driver = Base_Class.getBrowser("chrome");
	public static Home_Page hp = new Home_Page(driver);
	public static Casual_Dress cd = new Casual_Dress(driver);
	public static Checkout cc = new Checkout(driver);
	public static Order op = new Order(driver);
	public static SignIn_Page sp = new SignIn_Page(driver);
	public static Address_Page ap = new Address_Page(driver);
	public static Shipping s = new Shipping(driver);
	public static Payment_Process pp = new Payment_Process(driver);

	public static void main(String[] args) throws InterruptedException, IOException {

		getURL("http://automationpractice.com/index.php");
		max();
		moveToElement(hp.getWomen());
		moveToElement(hp.getCasual());
		clickOnElement(hp.getCasual());

		javaScriptExecutor();
		clickOnElement(cd.getDress());
		clickOnElement(cd.getAddtocart());

		timeOut(2);

//		moveToElement(cc.getModeinto());
//		clickOnElement(cc.getModeinto());
		moveToElement(cc.getProceedtocheckout());
		sleep(2000);
		clickOnElement(cc.getProceedtocheckout());

		javaScriptExecutor();
		clear(op.getQuantity());
		inputValueElement(op.getQuantity(), "10");
		clickOnElement(op.getProceedtocheck());

		inputValueElement(sp.getMailId(), "swa123@gmail.com");
		inputValueElement(sp.getPassword(), "123456789");
		clickOnElement(sp.getLogin());

		javaScriptExecutor();
		clickOnElement(ap.getProceedto());

		clickOnElement(s.getVerify());
		clickOnElement(s.getClick());

		javaScriptExecutor();
		clickOnElement(pp.getBankwire());
		clickOnElement(pp.getSubmit());

		sleep(3000);

		screenshots();

	}

}