package vtiger;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {
     @Test(priority = -2)
	public void a() {
		Reporter.log("A");
	}
     
     @Test
 	public void b() {
 		Reporter.log("B");
 	}
     @Test(priority = -1)
 	public void c() {
 		Reporter.log("");
 	}
     
}
