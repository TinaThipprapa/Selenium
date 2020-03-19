package Com.Homedepot.BootCamp2020;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hompage {
	WebDriver driver;
	@FindBy(linkText = "My Account")
	WebElement account;
	@FindBy(linkText = "Register")
	WebElement register;
	
	public Hompage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	} 
	public void account() {
		account.click();
	}
	public void register() {
		register.click();
	}
	
}
