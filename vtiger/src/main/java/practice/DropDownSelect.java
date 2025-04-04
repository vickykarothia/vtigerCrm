package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class DropDownSelect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		driver.switchTo().frame("iframeResult");
		
	WebElement	webElement=driver.findElement(By.xpath("//select[@id='cars']"));
	
	Select selObj=new Select(webElement);
	selObj.selectByValue("saab");
	selObj.selectByValue("opel");
	selObj.selectByValue("volvo");
	
List<WebElement>list=selObj.getAllSelectedOptions();

for(WebElement id:list)
{
	String str=id.getText();
	System.out.println(str);
}
		
	}

}
