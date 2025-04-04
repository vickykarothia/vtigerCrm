package objectRepository;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import vtiger.genericLibrary.GetCommonData;
//import org.openqa.selenium.chrome.ChromeDriver;
public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		
		this.driver=driver;
		
	}
	


	
	
	 
    public  void login() throws IOException {
     
    driver.manage().window().maximize();
   	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
   	
    GetCommonData getData=new GetCommonData();
    driver.get(getData.getCommonData("url"));
   driver.findElement(By.name("user_name")).sendKeys(getData.getCommonData("un"));   
   driver.findElement(By.name("user_password")).sendKeys(getData.getCommonData("pass"));
  driver.findElement(By.id("submitButton")).click();
         
 }

}
