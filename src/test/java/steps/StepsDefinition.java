package steps;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepsDefinition {

	public class StepDefinitions {

		WebDriver driver;
		
		@After
		public void teardown()
		{
			driver.quit();
		}

	@Given("user starts {string} browser")
	public void user_starts_browser(String browserName) {
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
	  
		
	}

	@Given("user launch adactin app using url {string}")
	public void user_launch_adactin_app_using_url(String url) {
		
		driver.get(url);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   
	}

	@When("user enter username {string} in textbox using xpath {string}")
	public void user_enter_username_in_textbox_using_xpath(String text, String xpath) {
	    
		driver.findElement(By.xpath(xpath)).sendKeys(text);
	}
	@When("user enter password {string} in textbox using xpath {string}")
	public void user_enter_password_in_textbox_using_xpath(String text, String xpath) {
	    
		driver.findElement(By.xpath(xpath)).sendKeys(text);
	}

	@When("user click login  button using xpath {string}")
	public void user_click_login_button_using_xpath(String xpath) {
	    
		driver.findElement(By.xpath(xpath)).click();
	}

	@Then("verify the title of the page to be {string}")
	public void verify_the_title_of_the_page_to_be(String expTitle) {
		
		Assert.assertEquals(expTitle, driver.getTitle());
	    
	}

	@Then("verify the presence of text using xpath {string}")
	public void verify_the_presence_of_text_using_xpath(String xpath, DataTable dataTable) {
	   
		List<Map<String,String>>  listOfMaps=dataTable.asMaps();
		
		String actualText=driver.findElement(By.xpath(xpath)).getText();
		
		System.out.println(actualText);
		
		System.out.println(listOfMaps.get(0).get("error message"));
		
		Assert.assertEquals(listOfMaps.get(0).get("error message"), actualText);
		
	}
 

	}

}
