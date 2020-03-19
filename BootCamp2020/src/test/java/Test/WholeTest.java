package Test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class WholeTest {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  driver.findElement(By.linkText("My Account")).click();
	  Thread.sleep(6000);
	  driver.findElement(By.xpath("//*[@id=\"SPSORegister\"]/a/span")).click();
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver","/Users/tina/Downloads/Project/Training/Driver/chromedriver 2");
	  driver = new ChromeDriver();
	  driver.navigate().to("https://www.homedepot.com");
	  driver.manage().window().maximize();
  }

  @AfterClass
  public void afterClass() {
  }

}
