package com.Pom_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Address_Page {

	public WebDriver driver;

	@FindBy(xpath = "//button[@class='button btn btn-default button-medium']")
	private WebElement proceedto;

	public Address_Page(WebDriver e) {

		this.driver = e;

		PageFactory.initElements(driver, this);
	}

	public WebElement getProceedto() {
		return proceedto;
	}

}
