package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {

	public static void main(String[] args) {
		// TODO Auto-generated method stu

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//		driver.get("https://demowebshop.tricentis.com/computers");
//		WebElement	webelement=driver.findElement(By.xpath("(//a[@href='/computers'])[1]"));
		driver.get("https://demoapp.skillrary.com/product.php");
		WebElement	webelement=driver.findElement(By.xpath("(//a[@href='/computers'])[1]"));
	
	
//	webelement.click();
	Actions act=new Actions(driver);
	
	act.moveToElement(webelement).perform();
//	act.click(webelement).perform();
//	act.contextClick(webelement).perform();
	
		
	}

	

}
