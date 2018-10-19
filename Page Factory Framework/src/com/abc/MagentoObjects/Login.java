package com.abc.MagentoObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	WebDriver d;

	@FindBy(id = "email")
	WebElement email;
	@FindBy(id = "pass")
	WebElement pass;
	@FindBy(id = "send2")
	WebElement login;

	public Login(WebDriver d) {
		this.d = d;
		PageFactory.initElements(d, this);
	}

	public void typeEmail(String data) {
		email.sendKeys(data);
	}

	public void typePwd(String data) {
		pass.sendKeys(data);
	}

	public void clickLogin() {
		login.click();
	}
}
