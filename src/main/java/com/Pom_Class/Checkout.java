package com.Pom_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkout {

	public WebDriver driver;

//	@FindBy(xpath = "/(//div[@class='button-container'])[1]")
//	private WebElement modeinto;

	@FindBy(xpath = "//a[@title='Proceed to checkout']")
	private WebElement proceedtocheckout;

	public Checkout(WebDriver h) {

		this.driver = h;
		PageFactory.initElements(driver, this);
	}

	public WebElement getProceedtocheckout() {
		return proceedtocheckout;
	}

//	public WebElement getModeinto() {
//		return modeinto;
//	}

}
