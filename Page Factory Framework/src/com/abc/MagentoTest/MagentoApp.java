package com.abc.MagentoTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.abc.MagentoObjects.Login;
import com.abc.MagentoObjects.Logout;
import com.abc.MagentoObjects.Main;

public class MagentoApp {
	public static void main(String[] args) throws Exception {

		String url = "https://magento.com/";
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		d.get(url);

		Main m = new Main(d);
		m.clickOnMyacc();
		Thread.sleep(3000);

		Login l1 = new Login(d);
		l1.typeEmail("subramanyaraj87@gmail.com");
		l1.typePwd("Welcome123");

		l1.clickLogin();
		Thread.sleep(3000);

		Logout l2 = new Logout(d);
		l2.clikLogout();
		Thread.sleep(3000);

		d.quit();
	}
}
