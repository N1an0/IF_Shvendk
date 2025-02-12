import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    // Локаторы
    private By usernameField = By.xpath("//input[@id='login-form-username']");
    private By passwordField = By.xpath("//input[@id='login-form-password']");
    private By loginButton = By.xpath("//input[@id='login']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String username, String password) {
        driver.findElement(usernameField).sendKeys(username);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(loginButton).click();
    }
}
