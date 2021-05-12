package org.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import reusable.pack.BaseClass;

public class AdactinWebElements extends BaseClass {

	
	
	public AdactinWebElements() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	private WebElement user;
	
	@FindBy(id="password")
	private WebElement pass;

	@FindBy(id="login")
	private WebElement btnlogin;
	@FindBy(xpath="//b[contains(text(),'Invalid Login details or Your ')]")
	private WebElement errormsg;
	
	@FindBy(xpath="//td[contains(text(),'Welcome to Adactin Group of Hotels')]")
	private WebElement nxtPg;

	public WebElement getUser() {
		return user;
	}
	public WebElement getpass(){
		return pass;
	}
	public WebElement getBtnLogin(){
		return btnlogin;
	}
	public WebElement getErrorMsg() {
		return errormsg;
	}
	public WebElement getNxtPg() {
		return nxtPg;
	}
}
	
	

