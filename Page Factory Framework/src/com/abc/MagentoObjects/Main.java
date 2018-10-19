package com.abc.MagentoObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Main {

	WebDriver d;

	@FindBy(linkText = "My Account")
	WebElement myacc;
	
	

	public Main(WebDriver driver) {
		this.d = driver;
		PageFactory.initElements(d, this);
	}

	public void clickOnMyacc() {
		myacc.click();
	}
}
