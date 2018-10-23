package cucumberTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
	
	public static void main (String [] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		String baseUrl = "https://login.gecko.ai/";
		//Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(baseUrl);
		// Find the element that's ID attribute is 'account'(My Account) 
		//driver.findElement(By.xpath("//*[@id=\"account\"]/a")).click();
		
		// Find the element that's ID attribute is 'log' (Username)
		 
        // Enter Username on the element found by above desc.
		
		driver.findElement(By.xpath(".//*[@id='EmailID']")).sendKeys("testusrbdd@mailinator.com");
		
		// Find the element that's ID attribute is 'pwd' (Password)
		 
        // Enter Password on the element found by the above desc.
		
		driver.findElement(By.xpath(".//*[@id='Password']")).sendKeys("#abcd123");
		
		// Now submit the form. WebDriver will find the form for us from the element 
		
		driver.findElement(By.xpath(".//*[@id='Login']/div/div[3]/button")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
       // Print a Log In message to the screen

       System.out.println("Login Successfully");
       
    // Find the element that's ID attribute is 'account_logout' (Log Out)
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       
       driver.findElement(By.xpath("//*[@id=\"logoutForm\"]/a/i")).click();
       
       System.out.println("Logout Successfully");  		
		 
       
		
	}

}
