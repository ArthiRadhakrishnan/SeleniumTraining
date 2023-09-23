package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPojo extends BaseClass {
	public SignInPojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Create new account']")
	private WebElement createNewAccount;

	@FindBy(xpath = "//input[@placeholder='First name']")
	private WebElement firstname;

	@FindBy(name = "lastname")
	private WebElement surname;

	@FindBy(xpath = "(//input[@type='text'])[4]")
	private WebElement mobile;

	@FindBy(name = "reg_passwd__")
	private WebElement passwd;

	public WebElement getCreateNewAccount() {
		return createNewAccount;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getSurname() {
		return surname;
	}

	public WebElement getMobile() {
		return mobile;
	}

	public WebElement getPasswd() {
		return passwd;
	}

}
