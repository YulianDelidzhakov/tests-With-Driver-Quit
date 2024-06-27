package str1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.time.Duration;


public class Test6Login {
    WebDriver driver;


    @BeforeMethod
    public void setUp() {
        // Инициализация на Edge браузъра
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--start-maximized", "--disable-extensions");
        driver = new EdgeDriver(options);
        driver.get("https://www.abv.bg");

    }
        @Test
        public void loginTest () {


            driver.switchTo().frame("abv-GDPR-frame");

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

            WebElement acceptButton = driver.findElement(By.id("didomi-notice-agree-button"));
           acceptButton.click();

            driver.switchTo().defaultContent();

            // Намиране на полето за потребителско име чрез id и въвеждане на текст

             WebElement usernameField = driver.findElement(By.id("username"));
            usernameField.sendKeys("name");

            // Намиране на полето за парола чрез id и въвеждане на текст

            WebElement passwordField = driver.findElement(By.id("password"));
            passwordField.sendKeys("password");

            // Намиране на бутона за логин чрез id и кликване върху него

            WebElement loginButton = driver.findElement(By.id("loginBut"));
            loginButton.click();

            // Добави проверки за успешен логин, ако е необходимо
        }

        @AfterMethod
        public void tearDown () {

            // Затваряне на браузъра

            //  if (driver != null) {
            //   driver.quit();
            }
        }
  //  }






















