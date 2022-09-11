package POM;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ViewEmployeeList {
	
	WebDriver driver;
	public ViewEmployeeList(WebDriver webdriver){
		driver=webdriver;
	}
 
	private String addButton="//button[@class='oxd-button oxd-button--medium oxd-button--secondary']";
	private String dropDown="//p[@class='oxd-userdropdown-name']";
	private String clickOnLogout="//a[text()='Logout']";
	//private String name="//*[text()='test test']";
	
	public boolean clickAdd() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath(addButton)).click();
		return true;
		
	}
	
	public boolean clickOnDropDown() {
	
		driver.findElement(By.xpath(dropDown)).click();
		return true;
		
	}
	
	public boolean clickOnLogout() {
		
		driver.findElement(By.xpath(clickOnLogout)).click();
		return true;
		
	}
	
	public boolean isNameDisplay(String name) {
		 
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='"+name+"']")));
		return true;
	}
	
}
