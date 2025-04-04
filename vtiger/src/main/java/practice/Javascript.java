package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//      driver.get("http://localhost:8888/");
      
      JavascriptExecutor js=(JavascriptExecutor)driver;
      js.executeScript("window.location=arguments[0]","https://en.wikipedia.org/wiki/MS_Dhoni");//open a website
//    WebElement name= driver.findElement(By.name("user_name"));
//    WebElement pass= driver.findElement(By.name("user_password"));
//   WebElement button=driver.findElement(By.id("submitButton"));
//      js.executeScript("arguments[0].value=arguments[1]",name,"admin");//type some text
//      js.executeScript("arguments[0].value='admin'",pass);
//      js.executeScript("arguments[0].click()",button);//click action 
//   //scrolling actions using 
//      
      js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
      Thread.sleep(2000);
      js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
      
//      Thread.sleep(2000);
//      js.executeScript("window.scrollTo(0,500)");
//      js.executeScript("window.scrollTo(0,500)");
//      js.executeScript("window.scrollTo(0,500)");
//      js.executeScript("window.scrollTo(0,500)");
      
//        js.executeScript("window.scrollBy(0,500)");
//      WebElement text= driver.findElement(By.linkText("Castrol Indian Cricketer of the Year"));
//      js.executeScript("arguments[0].scrollIntoView(true)",text);
	}

}
