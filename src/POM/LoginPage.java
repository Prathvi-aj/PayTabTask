package POM;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver webdriver){
		driver=webdriver;
	}
	
	private String userName="//input[@name='username']";
	private String password="//input[@name='password']";
	private String loginButton="//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']";

	public boolean setUserName(String username) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath(userName)).sendKeys(username);
		return true;
		
	}
	public boolean setPassword(String pswd) {
		driver.findElement(By.xpath(password)).sendKeys(pswd);
		return true;
		
	}
	public boolean clickLogin() {
		driver.findElement(By.xpath(loginButton)).click();
		return true;
		
	}
	

	
}
