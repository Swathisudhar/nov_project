package com.Pom_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {

	public WebDriver driver;

	@FindBy(xpath = "//a[@title='Women']")
	private WebElement women;

	@FindBy(xpath = "(//a[@title='Casual Dresses'])[1]")
	private WebElement casual;

	public Home_Page(WebDriver a) {

		this.driver = a;
		PageFactory.initElements(driver, this);
	}

	public WebElement getWomen() {
		return women;
	}

	public WebElement getCasual() {
		return casual;
	}

}
