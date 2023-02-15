package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
		}
	@FindBy(id="Email")
	WebElement txtEmail;
	@FindBy(id="Password")
	WebElement txtPassword;
	@FindBy (xpath="//button[@type='submit']")
	WebElement btnLogin;
	//@FindBy (linkText = "Logout")
	@FindBy (xpath="//a[@class='nav-link' and contains(text(),'Logout')]")
	WebElement lnkLogout;
	
	public void setUserName(String uname) {
		txtEmail.clear();
		txtEmail.sendKeys(uname);
		}
	
	public void setPassword(String pwd) {
		txtPassword.clear();
		txtPassword.sendKeys(pwd);
		}
	
	
	public void clickLoginBtn() {
		btnLogin.click();
	}
	public void clickLogout() {
		lnkLogout.click();
	}

}
