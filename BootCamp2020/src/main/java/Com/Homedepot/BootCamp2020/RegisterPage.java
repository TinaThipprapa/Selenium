package Com.Homedepot.BootCamp2020;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	WebDriver driver;
	
	@FindBy(id="email")
	WebElement email;
	@FindBy(id="password-input-field")
	WebElement pass;
	@FindBy(id="zipCode")
	WebElement zipcode;
	@FindBy(id="phone")
	WebElement phone;
	@FindBy(xpath = "//*[@id=\"single-signin__body\"]/div/div[2]/form/button/span")
	WebElement createbutton;
	
	public RegisterPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void Email(String Email) {
		email.sendKeys(Email);
	}
	public void Password(String Password) {
		pass.sendKeys(Password);
	}
	public void Zipcode(String ZipCode) {
		zipcode.sendKeys(ZipCode);
	}
	public void Phonenuber(String PhoneNo) {
		phone.sendKeys(PhoneNo);
	}
	public void Create() {
		createbutton.click();
	}

}
