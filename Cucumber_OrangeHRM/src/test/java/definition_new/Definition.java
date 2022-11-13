package definition_new;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Definition {
	WebDriver driver;

	@Given("I should go to login page")
	public void i_should_go_to_login_page() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	   
	}
	
	@When("Enter the username {string}")
	public void enter_the_username(String string) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='username']")).sendKeys(string);
	   
	}
	@When("Enter the password {string}")
	public void enter_the_password(String string) {
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys(string);
	   
	}
	@When("Click on login button")
	public void click_on_login_button() {
		driver.findElement(By.xpath("//*[@type='submit']")).click();
	   
	}
	@Then("I should see the username as {string}")
	public void i_should_see_the_username_as(String string) {
		System.out.println(driver.getTitle());
	   
	}


		}
