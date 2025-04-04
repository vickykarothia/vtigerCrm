package practice;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigat {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.navigate().to("https://www.google.com/");
//		driver.navigate().back();
//		Thread.sleep(2000);
//		driver.navigate().forward();
//		driver.close();
//		driver.manage().window().setSize(new Dimension(2000,2000));
//	Dimension size=driver.manage().window().getSize();
//	System.out.println(size.getHeight());
//	System.out.println(size.getWidth());
		driver.manage().window().setPosition(new Point(500,500));
		Point p=driver.manage().window().getPosition();
		System.out.println(p.getX());
		System.out.println(p.getY());
	

	}

}
