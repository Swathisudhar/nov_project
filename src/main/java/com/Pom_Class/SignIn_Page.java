package com.Pom_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignIn_Page {

	public WebDriver driver;

	@FindBy(id = "email")
	private WebElement mailId;

	@FindBy(id = "passwd")
	private WebElement password;

	@FindBy(id = "SubmitLogin")
	private WebElement login;

	public SignIn_Page(WebDriver d) {

		this.driver = d;
		PageFactory.initElements(driver, this);
	}

	public WebElement getMailId() {
		return mailId;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

}
