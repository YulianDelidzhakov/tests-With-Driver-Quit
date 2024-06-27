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

public class Test3 {

    private WebDriver driver;

    @BeforeMethod
    public void setup() {
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--start-maximized", "--disable-extensions");
        driver = new EdgeDriver(options);
        driver.get("https://strypes.eu/");
    }
    @Test
    public void acceptCookies(){

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        WebElement acceptCookies = driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[2]/button[3]"));
        acceptCookies.click();

        WebElement searchButton = driver.findElement(By.xpath("/html/body/div[5]/div[1]/section[1]/div/div/div/section[1]/div/div[2]/div/div/div/search/form/div[1]"));
        searchButton.click();
    }
    @AfterMethod
    public void quit(){
        // Затваряне на браузъра
      // if (driver != null) {
       //   driver.quit();
        }

    }

//}
