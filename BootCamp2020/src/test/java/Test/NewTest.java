package Test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
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
	  driver.findElement(By.xpath("//*[@id=\"flight-module-2020-03-27t08:15:00+07:00-coach-bkk-nrt-jl-708-coach-nrt-ngo-jl-3087_2020-04-12t14:45:00+09:00-coach-ngo-nrt-jl-3084-coach-nrt-bkk-jl-707_\"]/div[1]/div[1]/div[2]/div/div[2]/button")).click();
	  driver.findElement(By.xpath("//*[@id=\"flight-module-2020-03-27t08:15:00+07:00-coach-bkk-nrt-jl-708-coach-nrt-ngo-jl-3087_2020-04-12t14:45:00+09:00-coach-ngo-nrt-jl-3084-coach-nrt-bkk-jl-707_\"]/div[1]/div[1]/div[2]/div/div[2]/button")).click();
	  Thread.sleep(10000);
	  ArrayList<String> tab2 = new ArrayList<String>(driver.getWindowHandles());
	  driver.switchTo().window(tab2.get(1));
	  
	  WebElement click =driver.findElement(By.xpath("//*[contains(text(),'Continue Booking')]"));
	  Actions action= new Actions(driver);
	  action.moveToElement(click).click().build().perform();
	  
	  driver.findElement(By.id("firstname[0]")).sendKeys("Tina");
	  driver.findElement(By.id("lastname[0]")).sendKeys("Popiyar");
	  
	  WebElement Country = driver.findElement(By.xpath("//*[@id=\"country_code[0]\"]"));
	  Select con = new Select(Country);
	  con.selectByVisibleText("Thailand +66");
	  driver.findElement(By.id("phone-number[0]")).sendKeys("0818770587");
	 
	  WebElement passport = driver.findElement(By.id("passport[0]"));
	  Select pass = new Select(passport);
	  pass.selectByVisibleText("Thailand");
	  
	  driver.findElement(By.xpath("//*[@id=\"email\"]/div[1]/fieldset/label/input")).sendKeys("tina@gmail.com");
	  driver.switchTo().window(tab2.get(0));
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
