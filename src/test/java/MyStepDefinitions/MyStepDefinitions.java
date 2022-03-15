package MyStepDefinitions;
import PageObjects.Login;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

@RunWith(Cucumber.class)
public class MyStepDefinitions {
    WebDriver driver;
    Login login;
    @Before
    public void StartSenario(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        login = new Login(driver);
    }
    @Given("^User go to page$")
    public void user_go_to_page() throws Throwable {
        this.driver.get("https://rahulshettyacademy.com/locatorspractice/");
        this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @When("^User login into application with (.+) and (.+)$")
    public void user_login_into_application_with_something_and_password_something(String username, String password) {
        login.txtUsername.sendKeys(username);
        login.txtPassword.sendKeys(password);
        login.btnLogin.click();

    }

    @Then("Home page is populated with {string}")
    public void home_page_is_populated_with_something(String strArg1) throws Throwable  {
        Assert.assertEquals(strArg1, login.linkSpec.getText());
    }

    @And("^Close app$")
    public void close_app() throws Throwable {
        driver.close();
    }

}