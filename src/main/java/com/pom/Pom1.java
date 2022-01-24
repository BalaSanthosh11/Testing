package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom1 {
	private WebDriver driver;

	@FindBy(xpath = "//a[@class='login']")
	private WebElement signin;

	public WebElement getSignin() {
		return signin;
	}

	public  Pom1(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}
}
