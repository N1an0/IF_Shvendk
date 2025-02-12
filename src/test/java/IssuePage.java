import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IssuePage {
    private WebDriver driver;

    // Локаторы
    private By statusField = By.xpath("//span[contains(text(), 'Сделать')]");
    private By versionField = By.xpath("//span[contains(text(), 'Version 2.0')]");

    public IssuePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getStatus() {
        return driver.findElement(statusField).getText();
    }

    public String getVersion() {
        return driver.findElement(versionField).getText();
    }
}
