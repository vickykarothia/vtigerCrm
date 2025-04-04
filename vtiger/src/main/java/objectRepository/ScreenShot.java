package objectRepository;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;


public class ScreenShot {  
 
            @Test
     	public  void screenShot() throws IOException {
		// TODO Auto-generated method stub
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("http://localhost:8888/");
//       TakesScreenshot tks=(TakesScreenshot)driver;
//       File scr=tks.getScreenshotAs(OutputType.FILE);
//       File dest=new File("E:\\testing\\screenshot2.png");
//       FileHandler.copy(scr, dest); 
        
//        TakesScreenshot tks=(TakesScreenshot)driver;
//        File src=tks.getScreenshotAs(OutputType.FILE);
//        File dest=new File("E://testing//screen.png");
//        FileHandler.copy(src,dest);
        TakesScreenshot tks=(TakesScreenshot)driver;
        File src=tks.getScreenshotAs(OutputType.FILE);
        File dest=new File("E://testing//screen.png");
        FileHandler.copy(src,dest);
       
	}

}
