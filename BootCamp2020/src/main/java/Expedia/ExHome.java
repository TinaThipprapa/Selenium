package Expedia;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ExHome {
	WebDriver driver;
	
	@FindBy(xpath = "//*[@id=\"tab-flight-tab-hp\"]/span[2]")
	WebElement fight;
	@FindBy(xpath = "//*[@id=\"flight-origin-hp-flight\"]")
	WebElement origin;
	@FindBy(xpath = "//*[@id=\"flight-destination-hp-flight\"]")
	WebElement destination;
	@FindBy(xpath = "//*[@id=\"flight-departing-hp-flight\"]")
	WebElement oridate;
	//@FindBy(xpath = "")
	

}
