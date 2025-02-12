import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProjectPage {
    private WebDriver driver;

    // Локаторы
    private By taskCounter = By.xpath("//div[contains(text(), 'из')]");
    private By createIssueButton = By.xpath("//button[contains(text(), 'Создать задачу')]");

    public ProjectPage(WebDriver driver) {
        this.driver = driver;
    }

    public int getTaskCount() {
        String text = driver.findElement(taskCounter).getText();
        return Integer.parseInt(text.split(" ")[2]); // Извлечение числа из строки
    }

    public void createIssue(String summary, String description) {
        driver.findElement(createIssueButton).click();
        // Здесь нужно заполнить форму создания задачи
        driver.findElement(By.xpath("//input[@id='summary']")).sendKeys(summary);
        driver.findElement(By.xpath("//textarea[@id='description']")).sendKeys(description);
        driver.findElement(By.xpath("//button[contains(text(), 'Создать')]")).click();
    }

    public int getIssueCountAfterCreation() {
        String text = driver.findElement(taskCounter).getText();
        return Integer.parseInt(text.split(" ")[2]); // Извлечение числа из строки
    }
}
