package pageObejects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(id="Email")
	WebElement email;
	
	@FindBy(id="Password")
	WebElement password;
	
	@FindBy(xpath="/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button")
	WebElement login;
	
	@FindBy(xpath="//*[@id=\'navbarText\']/ul/li[3]/a")
	WebElement logout;
	
	public void setemail(String uname)
	{
		email.clear();
		email.sendKeys(uname);
	}
	public void setpassword(String pwd)
	{
		password.clear();
		password.sendKeys(pwd);
	}
	public void loginclick()
	{
		
		login.click();
	}
	public void logoutclick()
	{
		logout.click();
	}

}
