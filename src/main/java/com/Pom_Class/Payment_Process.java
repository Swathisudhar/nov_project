package com.Pom_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment_Process {

	public WebDriver driver;

	@FindBy(className = "cheque")
	private WebElement bankwire;

	@FindBy(xpath = "//button[@class='button btn btn-default button-medium']")
	private WebElement submit;

	public Payment_Process(WebDriver g) {

		this.driver = g;

		PageFactory.initElements(driver, this);
	}

	public WebElement getBankwire() {
		return bankwire;
	}

	public WebElement getSubmit() {
		return submit;
	}

}
