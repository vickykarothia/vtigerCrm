package vtiger;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectRepository.LoginPage;

public class CreateConteact {
	
	@Test
	public void createContact() throws IOException {
		WebDriver driver=new ChromeDriver();
		LoginPage loginObj=new LoginPage(driver);
		loginObj.login();
		
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.xpath("//img[@title='Create Contact...']")).click();
		driver.findElement(By.name("lastname")).sendKeys("karotia");
		driver.findElement(By.xpath("(//img[@title='Select'])[1]")).click();
    	String parentWindow=driver.getWindowHandle();
    	Set<String> allIds=driver.getWindowHandles();
    	
    	for(String id: allIds) {
    	String url	=driver.switchTo().window(id).getCurrentUrl();
    		if(url.contains("specific_contact_account_address&form")) {
    			driver.findElement(By.linkText("John212")).click();
                
    			
    		}
    	}
    	
    	
     	driver.switchTo().window(parentWindow);
     	driver.findElement(By.xpath("(//input[@title='Save [Alt+S]'])[1]")).click();
//    	driver.close();
    	
    	
	}

}
