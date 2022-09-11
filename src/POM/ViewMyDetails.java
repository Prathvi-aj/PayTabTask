package POM;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class ViewMyDetails {

	WebDriver driver;
	
	public ViewMyDetails(WebDriver webDriver){
		driver=webDriver;
	}
	
	private String clickOnAdd="//button[@class='oxd-button oxd-button--medium oxd-button--text']";
	private String clickOnBrowse="//div[@class='oxd-file-input-div']";
	private String SaveFile="//button[text()=' Save ']";
	private String enterDetails="//input[@class='oxd-input oxd-input--active']";
	private String nationality="//*[text()='Indian']";
	private String maritialStatus="//*[text()='Single']";
	private String bloodgroup="//*[text()='A+']";
	private String dropdown="//div[@class='oxd-select-text-input']";
	private String gender="//*[text()='Male']";
	
	
	public boolean ClickOnAdd() {
		driver.findElement(By.xpath(clickOnAdd)).click();
		
		return true;
	}
	public boolean ClickOnBrowse() {
		WebElement chooseFile=driver.findElement(By.xpath(clickOnBrowse));
		
		Actions act = new Actions(driver);
		 act.moveToElement(chooseFile).doubleClick().build().perform();

		act.sendKeys("C:\\Relocation_form corrected.pdf");
		
		return true;
	}
	
	public boolean ClickOnSave(int i) {
		List<WebElement> list=driver.findElements(By.xpath(SaveFile));
		list.get(i).click();
		
		return true;
	}
	
	public boolean ClickOnDropdown(int i) {
		List<WebElement> list=driver.findElements(By.xpath(dropdown));
		list.get(i).click();
		
		return true;
	}
	
	public boolean setNickName(String nickName) {
		List<WebElement> list=driver.findElements(By.xpath(enterDetails));
		list.get(1).sendKeys(nickName);
		return true;
	}
	
	public boolean setMaritialStatus() {
		driver.findElement(By.xpath(maritialStatus)).click();
		return true;
	}
	
	
	public boolean setBloodGroup() {
		driver.findElement(By.xpath(bloodgroup)).click();
		return true;
	}
	

	public boolean setGender() {
		driver.findElement(By.xpath(gender)).click();
		return true;
	}
	public boolean setNationality() {
		driver.findElement(By.xpath(nationality)).click();
		return true;
	}
	
	public boolean setMilitryService(String militryService) {
		List<WebElement> list=driver.findElements(By.xpath(enterDetails));
		list.get(9).sendKeys(militryService);
		return true;
	}
	
	
	
	
	
}
