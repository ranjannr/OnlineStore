package stepdefination1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_step1 {
	
	public static WebDriver driver;
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://login.gecko.ai/");
		}
 
//	@When("^User Navigate to LogIn Page$")
//	public void user_Navigate_to_LogIn_Page() throws Throwable {
//		driver.findElement(By.xpath(".//*[@id='account']/a")).click();
//		}
 
	@When("^User enters UserName and Password$")
	public void user_enters_UserName_and_Password() throws Throwable {
		driver.findElement(By.xpath(".//*[@id='EmailID']")).sendKeys("testusrbdd@mailinator.com"); 	 
	    driver.findElement(By.xpath(".//*[@id='Password']")).sendKeys("#abcd123");
	    driver.findElement(By.xpath(".//*[@id='Login']/div/div[3]/button")).click();
		}
 
	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() throws Throwable {
		System.out.println("Login Successfully");
	}
 
	@When("^User LogOut from the Application$")
	public void user_LogOut_from_the_Application() throws Throwable {
		driver.findElement (By.xpath("//*[@id=\"logoutForm\"]/a/i")).click();
	}
 
	@Then("^Message displayed Logout Successfully$")
	public void message_displayed_Logout_Successfully() throws Throwable {
        System.out.println("LogOut Successfully");
	}


}
