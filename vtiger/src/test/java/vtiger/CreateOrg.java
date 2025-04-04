package vtiger;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectRepository.LoginPage;
import vtiger.genericLibrary.GetExcelData;

public class CreateOrg {

	
//	public void createOrg(WebDriver driver) throws EncryptedDocumentException, IOException {
//		String orgName="qspider...";
	
//	public static void main(String[] args) throws IOException {
	      @Test
		public void createOrg() throws IOException {
    	WebDriver driver=new ChromeDriver();
		LoginPage loginObj=new LoginPage(driver);
		loginObj.login();
		GetExcelData excelObj=new GetExcelData();
	    String orgName=excelObj.getExcelData("Sheet1")+(int)(Math.random()*1000);
		driver.findElement(By.xpath("//a[text()='Organizations']")).click();
		driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
		driver.findElement(By.name("accountname")).sendKeys(orgName); 
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
		
		
		

	}
}
