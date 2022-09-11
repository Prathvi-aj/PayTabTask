package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class AddEmployee {
	
	WebDriver driver;
	
	public AddEmployee(WebDriver webDriver){
		driver=webDriver;
	}
	
	private String firstname="//input[@name='firstName']";
	private String lastname="//input[@name='lastName']";
	private String clickOnLoginDetails="//span[@class='oxd-switch-input oxd-switch-input--active --label-right']";
	private String userName="//input[@class='oxd-input oxd-input--active']";
	private String clickEnabled="//label[text()='Enabled']";
	private String password="//input[@type='password']";
	private String clickSave="//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']";
	
	public boolean setFirstname(String fname) {
		driver.findElement(By.xpath(firstname)).sendKeys(fname);
		return true;
	}

	public boolean setLastname(String lname) {
		driver.findElement(By.xpath(lastname)).sendKeys(lname);
		return true;
	}
	
	public boolean setClickOnLoginDetails() {
		driver.findElement(By.xpath(clickOnLoginDetails)).click();
		return true;
	}
	
	public boolean setUserName(String username) {
		List<WebElement> list=driver.findElements(By.xpath(userName));
		list.get(2).sendKeys(username);
		return true;
	}
	
	public boolean setClickEnabled() {
		driver.findElement(By.xpath(clickEnabled)).click();
		return true;
	}
	
	public boolean setPassword(String pswd) {
		List<WebElement> list=driver.findElements(By.xpath(password));
		list.get(0).sendKeys(pswd);
		return true;
	}
	
	public boolean setConfirmPassword(String pswd) {
		List<WebElement> list=driver.findElements(By.xpath(password));
		list.get(1).sendKeys(pswd);
		return true;
	}
	
	public boolean setClickSave() {
		driver.findElement(By.xpath(clickSave)).click();
		
		return true;
	} 
	
	
	
	
	
}
