package hooks;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login extends BaseClass 
{
	@Given("Load the URL")
	public void enterURL()
	{
	driver.get("http://leaftaps.com/opentaps/");	
	}
	@Given("Enter the userName")
	public void enterUSERNAME()
	{
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	}
	@Given("Enter the password")
	public void enterPWD()
	{
		driver.findElement(By.id("password")).sendKeys("crmsfa");
	}
	@When("click the login button")
	public void clickLogin()
	{
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	
	@Then("Homepage")
	public void verifyHomePage()
	{
		String title = driver.getTitle();
		System.out.println(title);
		String expected="Leaftaps - TestLeaf Automation Platform";
		Assert.assertEquals(title, expected,"title");//hard assert used

		//Soft assert
		/*	SoftAssert softAssert=new SoftAssert();
		softAssert.assertEquals(title, expected);
		softAssert.assertAll();
		*/		
	}
}
