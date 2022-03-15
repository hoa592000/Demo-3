package PageObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login{
    @FindBy(id = "inputUsername")
    public WebElement txtUsername;
    @FindBy(name = "inputPassword")
    public WebElement txtPassword;
    @FindBy(css = "button[type='submit']")
    public WebElement btnLogin;
    @FindBy(css= "p.error")
    public WebElement linkSpec;
    public Login(WebDriver driver){
    PageFactory.initElements(driver, this);
    }
}