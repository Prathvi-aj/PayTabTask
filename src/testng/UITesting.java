package testng;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import POM.*;
public class UITesting {
  @Test
  public void loginTestCase() {
	 
	  //Data
	 String fname="abhi";
	 String lname="shek";
	 String userName="abhishek"+((new Random()).nextInt(900)+100);
	 String password="Abc@1234";
	 String name=fname+" "+lname;
	 String nickName="abhi";
	 String militryService="No";
	  
	  
	  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//chromedriver.exe");
	  WebDriver driver=new ChromeDriver();  
      
	  LoginPage loginPage=new LoginPage(driver);
	  ViewEmployeeList viewEmployeeList=new ViewEmployeeList(driver);
	  AddEmployee addEmployee=new AddEmployee(driver);
	  ViewMyDetails viewMyDetails=new ViewMyDetails(driver);
	  driver.manage().window().maximize(); 
    
	  
	 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
  //Login With Admin and admin123
   Assert.assertTrue(loginPage.setUserName("Admin"));
   Assert.assertTrue(loginPage.setPassword("admin123"));
   Assert.assertTrue(loginPage.clickLogin());
   
   
   //Click On add
   Assert.assertTrue(viewEmployeeList.clickAdd());
   
   
   //Create New User
   Assert.assertTrue(addEmployee.setFirstname(fname));
   Assert.assertTrue(addEmployee.setLastname(lname));
   Assert.assertTrue(addEmployee.setClickOnLoginDetails());
   Assert.assertTrue(addEmployee.setUserName(userName));
   Assert.assertTrue(addEmployee.setClickEnabled());
   Assert.assertTrue(addEmployee.setPassword(password));
   Assert.assertTrue(addEmployee.setConfirmPassword(password));
   Assert.assertTrue(addEmployee.setClickSave());
   
   //User Created 
   Assert.assertTrue(viewEmployeeList.isNameDisplay(name));
   
   //Logout
   Assert.assertTrue(viewEmployeeList.clickOnDropDown());
   Assert.assertTrue(viewEmployeeList.clickOnLogout());
   
   //Login with New User
   Assert.assertTrue(loginPage.setUserName(userName));
   Assert.assertTrue(loginPage.setPassword(password));
   Assert.assertTrue(loginPage.clickLogin());
   
   //update user info
   Assert.assertTrue(viewMyDetails.setNickName(nickName));
   Assert.assertTrue(viewMyDetails.ClickOnDropdown(0));
   Assert.assertTrue(viewMyDetails.setNationality());
   Assert.assertTrue(viewMyDetails.ClickOnDropdown(1));
   Assert.assertTrue(viewMyDetails.setMaritialStatus());
   Assert.assertTrue(viewMyDetails.setMilitryService(militryService));
   Assert.assertTrue(viewMyDetails.ClickOnSave(0));
   Assert.assertTrue(viewMyDetails.ClickOnDropdown(2));
   Assert.assertTrue(viewMyDetails.setBloodGroup());
   Assert.assertTrue(viewMyDetails.ClickOnSave(1));
   
   Assert.assertTrue(viewMyDetails.ClickOnAdd());
   Assert.assertTrue(viewMyDetails.ClickOnBrowse());
   Assert.assertTrue(viewMyDetails.ClickOnSave(2));
   
   
  }
  
}
