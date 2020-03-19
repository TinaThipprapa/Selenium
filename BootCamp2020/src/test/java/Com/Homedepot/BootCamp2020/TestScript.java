package Com.Homedepot.BootCamp2020;

import org.testng.annotations.Test;

import Common.Browser;

public class TestScript extends Browser{
  @Test
  public void f() throws InterruptedException {
	  Hompage home= new Hompage(driver);
	  home.account();
	  Thread.sleep(6000);
	  home.register();
	  RegisterPage reg=new RegisterPage(driver);
	  reg.Email("Tina@gmail.com");
	  reg.Password("12345bgbhjdQ");
	  reg.Zipcode("25253");
	  reg.Phonenuber("1234567891");
	  reg.Create();
  }
}
