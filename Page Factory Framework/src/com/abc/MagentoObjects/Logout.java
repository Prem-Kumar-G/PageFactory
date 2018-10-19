package com.abc.MagentoObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {

	WebDriver d;

	@FindBy(linkText = "Log Out")
	WebElement logout;

	public Logout(WebDriver d) {
		this.d = d;
		PageFactory.initElements(d, this);
	}

	public void clikLogout() {
		logout.click();
	}
}
