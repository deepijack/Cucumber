package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pageObejects.LoginPage;

public class loginSteps {
	public WebDriver driver;
	public LoginPage lp;
	
	@Given("User Lanch chrome browser")
	public void user_lanch_chrome_browser() {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Driver//chromedriver.exe");
		driver=new ChromeDriver();
		
	    lp=new LoginPage(driver);
	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) {
	   driver.get(url);
	}

	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(String email, String password) {
	    lp.setemail(email);
	    lp.setpassword(password);
	}

	@When("Click on login")
	public void click_on_login() throws InterruptedException {
		 Thread.sleep(3000);
	    lp.loginclick();
	    Thread.sleep(3000);
	}

	@Then("page Title should be {string}")
	public void page_title_should_be(String title) throws InterruptedException {
	    if(driver.getPageSource().contains("Login was unsuccessful")) {
	    	driver.close();
	    	Assert.assertTrue(false);
	    }
	    else {
	    	Assert.assertEquals(title,driver.getTitle());
	    }
	    Thread.sleep(3000);
	}
	

	@When("User click on log out link")
	public void user_click_on_log_out_link() throws InterruptedException {
		 Thread.sleep(3000);
	  lp.logoutclick();
	  Thread.sleep(3000);
	  
	}
	@Then("Page Title should be {string}")
	public void page_title(String title) throws InterruptedException {
		 if(driver.getPageSource().contains("Login was unsuccessful")) {
		    	driver.close();
		    	Assert.assertTrue(false);
		    	
		    }
		    else {
		    	Assert.assertEquals(title,driver.getTitle());
		    }
		    Thread.sleep(3000);
		}
	
	
	
	@Then("close browser")
	public void close_browser() {
	  driver.quit();
	}


}
