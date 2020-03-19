package Test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class NewTest {
	WebDriver driver;
	
  @Test
  public void f() throws InterruptedException {
	  driver.findElement(By.xpath("//*[@id=\"tab-flight-tab-hp\"]/span[2]")).click();
	  driver.findElement(By.xpath("//*[@id=\"flight-origin-hp-flight\"]")).sendKeys("bangkok");
	  driver.findElement(By.xpath("//*[@id=\"flight-destination-hp-flight\"]")).sendKeys("japan");
	  driver.findElement(By.xpath("//*[@id=\"flight-departing-hp-flight\"]")).click();
	  driver.findElement(By.xpath("//*[@id=\"flight-departing-wrapper-hp-flight\"]/div/div/div[2]/table/tbody/tr[4]/td[6]/button")).click();
	  Thread.sleep(6000);
	  driver.findElement(By.id("flight-returning-hp-flight")).click();
	  Thread.sleep(6000);
	  driver.findElement(By.xpath("//*[@id=\"flight-returning-wrapper-hp-flight\"]/div/div[2]/div[3]/table/tbody/tr[3]/td[1]/button")).click();
	  Thread.sleep(6000);
	  driver.findElement(By.xpath("//*[@id=\"gcw-flights-form-hp-flight\"]/div[7]/label/button")).click();
	  //driver.findElement(By.xpath("//*[text()='Search']")).click();
	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS );
	  driver.findElement(By.xpath("//*[@id=\"flight-module-2020-03-27t10:55:00+07:00-coach-bkk-tpe-ci-834-coach-tpe-ngo-ci-150_2020-04-12t12:15:00+09:00-coach-ngo-tpe-ci-155-coach-tpe-bkk-ci-833_\"]/div[1]/div[1]/div[2]/div/div[2]/button")).click();
	  driver.findElement(By.xpath("//*[@id=\"flight-module-2020-03-27t10:55:00+07:00-coach-bkk-tpe-ci-834-coach-tpe-ngo-ci-150_2020-04-12t09:55:00+09:00-coach-ngo-tpe-ci-151-coach-tpe-bkk-ci-835_\"]/div[1]/div[1]/div[2]/div/div[2]/button")).click();
	  Thread.sleep(10000);
	  WebElement click =driver.findElement(By.xpath("//*[contains(text(),'Continue Booking')]"));
	  click.click();
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver","/Users/tina/Downloads/Project/Training/Driver/chromedriver 2");
	  driver = new ChromeDriver();
	  driver.navigate().to("https://www.expedia.com");
	  driver.manage().window().maximize();
  }

  @AfterClass
  public void afterClass() {
  }

}
