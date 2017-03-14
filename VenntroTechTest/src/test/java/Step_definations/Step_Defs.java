package Step_definations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Step_Defs {

	WebDriver driver;

	@Given("^I navigated to \"([^\"]*)\"$")
	public void i_navigated_to(String URL) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SAAHYA V PARSA\\Desktop\\MMM\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);

	}

	@And("^I click on From Auntication Example$")
	public void i_click_on_From_Auntication_Example() throws Throwable {

		driver.findElement(By.linkText("Form Authentication")).click();

	}

	@And("^I enter username as \"([^\"]*)\"$")
	public void i_enter_username_as(String Username) throws Throwable {

		driver.findElement(By.id("username")).sendKeys(Username);

	}

	@And("^I enter password as \"([^\"]*)\"$")
	public void i_enter_password_as(String Password) throws Throwable {

		driver.findElement(By.id("password")).sendKeys(Password);

	}

	@When("^I click on Login button$")
	public void i_click_on_Login_button() throws Throwable {

		driver.findElement(By.xpath(".//*[@id='login']/button")).click();

	}

	@Then("^I am able to see login validation \"([^\"]*)\" on the page$")
	public void i_am_able_to_see_login_validation_on_the_page(String Message) throws Throwable {

		driver.findElement(By.id("flash")).equals(Message);

		System.out.println("The Validation message is  ----" + Message);

	}

	@Given("^I click on Dynamic Controls Example$")
	public void i_click_on_Dynamic_Controls_Example() throws Throwable {

		driver.findElement(By.linkText("Dynamic Controls")).click();

	}

	@And("I verify Checkbox is Displayed$")
	public void i_verify_Checkbox_is_Displayed() throws Throwable {

		Thread.sleep(3000);
		System.out.println("Before clicking on Remove button Checkbox displayed? ----"
				+ driver.findElement(By.id("checkbox")).isDisplayed());

	}

	@And("^I click on \"([^\"]*)\" button$")
	public void i_click_on_button(String Button) throws Throwable {

		Thread.sleep(2000);
		driver.findElement(By.id("btn")).click();
		Thread.sleep(3000);

	}

	@And("^I see Checkbox is disappeared$")
	public void i_see_Checkbox_is_disappeared() throws Throwable {

		try {

			driver.findElement(By.id("checkbox")).isDisplayed();

		} catch (Exception e) {

			System.out.println("No Such Checkbox element");

		}

	}

	@And("^I see a confirmation message as \"([^\"]*)\"$")
	public void i_see_a_confirmation_message_as(String Message) throws Throwable {

		Thread.sleep(3000);
		driver.findElement(By.id("message")).equals(Message);
		System.out.println("The User message on the page  ----" + Message);
	}

	@Then("^I see Checkbox is appeared$")
	public void i_see_Checkbox_is_appeared() throws Throwable {

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		System.out.println("After clicking on Add button Checkbox Displayed ----"
				+ driver.findElement(By.id("checkbox")).isDisplayed());

	}

	@Given("^I click on Dynamic Loading Example$")
	public void i_click_on_Dynamic_Loading_Example() throws Throwable {

		Thread.sleep(2000);
		driver.findElement(By.linkText("Dynamic Loading")).click();

	}

	@And("^I click on first link$")
	public void i_click_on_first_link() throws Throwable {

		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='content']/div/a[1]")).click();
	}

	@And("^I click on Start$")
	public void i_click_on_Start() throws Throwable {

		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='start']/button")).click();
	}

	@And("^I check Loading bar appears$")
	public void i_check_for_Loading_bar_appears() throws Throwable {

		Thread.sleep(2000);
		System.out.println("I can see page is loading  ----" + driver.findElement(By.id("loading")).isDisplayed());
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	@Then("^I see \"([^\"]*)\" message displayed on the page$")
	public void i_see_message_displayed_on_the_page(String Message) throws Throwable {

		driver.findElement(By.id("finish")).equals(Message);
		System.out.println("After waiting for page load message is  ----" + Message);
	}

	@And("^I click on Sortable Data Tables Example$")
	public void i_click_on_Sortable_Data_Tables_Example() throws Throwable {

		driver.findElement(By.linkText("Sortable Data Tables")).click();

	}

	@And("^I Get the Email address is displaying for Jason Doe$")
	public void i_Get_the_Email_address_is_displaying_for_Jason_Doe() throws Throwable {

		WebElement table = driver.findElement(By.id("table2"));
		System.out.println("Number of coloumns " + table.findElements(By.tagName("td")).size());
		// String email = "jdoe@hotmail.com";
		WebElement emailaddress = driver.findElement(By.xpath("//*[@id='table2']/tbody/tr[3]/td[3]"));
		System.out.println(emailaddress.getText());// .equals(email));
		// System.out.println(email);

	}

	@And("^I close browser$")
	public void i_close_browser() throws Throwable {

		driver.quit();
	}

}
