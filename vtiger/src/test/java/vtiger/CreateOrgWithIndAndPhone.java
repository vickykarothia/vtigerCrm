package vtiger;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import objectRepository.LoginPage;
import vtiger.genericLibrary.GetExcelData;

public class CreateOrgWithIndAndPhone {

//WebDriver driver;
//	
	static String orgName;
//	CreateOrgWithIndAndPhone(WebDriver driver) throws IOException {
//		this.driver=driver;
//		Login loginObj=new Login();
//	     loginObj.login(driver);
//		
//	}
	
//	public void createOrg() throws EncryptedDocumentException, IOException, InterruptedException{
	@Test
	public  void createOrgWithIndAndPhone() throws EncryptedDocumentException, IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		LoginPage loginObj=new LoginPage(driver);
        loginObj.login();
		GetExcelData excelObj=new GetExcelData();
		 orgName=excelObj.getExcelData("Sheet1")+(int)(Math.random()*1000);
			driver.findElement(By.xpath("//a[text()='Organizations']")).click();
			driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
			driver.findElement(By.name("accountname")).sendKeys(orgName);
			driver.findElement(By.id("phone")).sendKeys("85858585885");
			//using select class
			WebElement webelement=driver.findElement(By.name("industry"));
			Select selObj=new Select(webelement);
			selObj.selectByValue("Education");
			driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
			Thread.sleep(2000);
//			driver.close();
	}
	
//	public void verify() throws InterruptedException {
//		driver.findElement(By.xpath("//a[text()='Organizations']")).click(); 
//		driver.findElement(By.name("search_text")).sendKeys(orgName);
//		WebElement webelement=driver.findElement(By.id("bas_searchfield"));
//		Select selObj=new Select(webelement);
//		selObj.selectByVisibleText("Organization Name");
//		driver.findElement(By.name("submit")).click();
//		Thread.sleep(2000);
////		driver.findElement(By.xpath("(//a[@title='Organizations'])[1]")).click();
//		driver.findElement(By.linkText(""+orgName+"")).click();
//	String	orName=driver.findElement(By.id("dtlview_Organization Name")).getText();
//	String	industry=driver.findElement(By.xpath("//span[@id='dtlview_Industry']/child::font")).getText();
//	String	phone=driver.findElement(By.id("mouseArea_Phone")).getText();
//	if(orName.contains(orgName) && industry.contains("Education") && phone.contains("85858585885"))
//		System.out.println("created succesfully"+orgName+"  "+industry+"  "+phone );
//	else
//		System.out.println("not created");
//	
//        
//	}


}
