import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestAutomation {
    private WebDriver driver;
    private LoginPage loginPage;
    private ProjectPage projectPage;
    private IssuePage issuePage;

    @BeforeEach
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\shven\\chromedrivers\\chrome-win64"); // Укажите путь к драйверу
        driver = new ChromeDriver();
        driver.get("https://edujira.ifellow.ru/");
        loginPage = new LoginPage(driver);
        projectPage = new ProjectPage(driver);
        issuePage = new IssuePage(driver);
    }

    @Test
    public void testEdujira() {
        // 1. Авторизоваться
        loginPage.login("AT7", "Qwerty123");

        // 2. Перейти в проект “Test”
        driver.get("https://edujira.ifellow.ru/secure/RapidBoard.jspa?rapidView=1&projectKey=TEST&view=planning");

        // 3. Проверить общее количество заведенных задач
        int initialCount = projectPage.getTaskCount();

        // 4. Создать новую задачу
        projectPage.createIssue("New Test Issue", "Description for new test issue");

        // 5. Получить новое количество задач после создания
        int newCount = projectPage.getIssueCountAfterCreation();

        // 6. Проверить, что количество задач увеличилось на 1
        assertEquals(initialCount + 1, newCount, "Количество задач должно увеличиться на 1 после создания новой задачи.");

        // 8. Проверить статус и версию задачи
        String status = issuePage.getStatus();
        String version = issuePage.getVersion();

        // Проверка, что статус задачи соответствует ожидаемому
        assertEquals("Ожидаемый статус", status, "Статус задачи должен соответствовать ожидаемому значению.");

        // Проверка, что версия задачи соответствует ожидаемой
        assertEquals("Version 2.0", version, "Версия задачи должна быть 'Version 2.0'.");

        // Дополнительная проверка, что задача действительно создана
        assertTrue(status.contains("New Test Issue"), "Задача должна быть успешно создана и отображаться в списке задач.");
    }

    @AfterEach
    public void tearDown() {
        // Закрыть браузер после выполнения теста
        if (driver != null) {
            driver.quit();
        }
    }
}
