package practice;

import java.time.Duration;

import org.openqa.selenium.By;
//import org.openqa.selenium.Alert;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Popups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	ChromeOptions options=new ChromeOptions();---notifications pop up
//	options.addArguments("--disable-notifications");
	
	//--disable-notifications
//		ChromeOptions options = new ChromeOptions();

       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
       
//       driver.get("https://demowebshop.tricentis.com/");
//       driver.findElement(By.className("search-box-button")).click();
//       
//      Alert ale=driver.switchTo().alert();---java script pop up
//      ale.accept();
       
       
//       driver.get("https://www.easemytrip.com/");
//       driver.get("https://guest:guest@jigsaw.w3.org/HTTP/Basic/");---authentication pop up
       
//       driver.get("https://www.makemytrip.com/");
//       driver.findElement(By.xpath("//span[@data-cy='closeModal']")).click();
//       driver.findElement(By.xpath("(//span[@class='lbl_input appendBottom10'])[3]")).click();
//      driver.findElement(By.xpath("(//p[text()='13'])[1]")).click();
//      driver.findElement(By.xpath("(//span[@class='lbl_input appendBottom10'])[4]")).click();
//      driver.findElement(By.xpath("(//p[text()='15'])[1]")).click();//hidden devision pop up
       
       driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
       driver.findElement(By.xpath("(//div[@class='textWrap'])[1]")).click();
       driver.findElement(By.id("resumeUpload")).sendKeys("‪‪E:\\testing\\QSpiders Global - Class notes.pdf");
       
 }

}
