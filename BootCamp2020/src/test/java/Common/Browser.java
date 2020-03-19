package Common;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class Browser {
	
	public static WebDriver driver;
  
  @BeforeClass
  @Parameters({"url","browser"})
  public void beforeClass(String wbsite, String br) {
	  if(br.equalsIgnoreCase("Chrome")) {
		  System.setProperty("webdriver.chrome.driver","/Users/tina/eclipse-workspace/BootCamp2020/Driver/chromedriver 2");
		  driver = new ChromeDriver();
		  driver.navigate().to(wbsite);
		 // driver.manage().window().maximize();
	  } else if(br.equalsIgnoreCase("Firefox")) {
		  System.setProperty("webdriver.gecko.driver","/Users/tina/eclipse-workspace/BootCamp2020/Driver/geckodriver");
		  driver = new FirefoxDriver();
		  driver.navigate().to(wbsite);
		  driver.manage().window().maximize();
	  } else {
		  System.out.println(br);
	  }
  }

  @AfterClass
  public void afterClass() {
  }

}
