package str1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Test5 {
    private WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver = new EdgeDriver();
    }

    @Test

    public void HomePageS(){
        driver.get("https://strypes.eu/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement acceptCookies = driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[2]/button[3]"));
        acceptCookies.click();

        WebElement menu = driver.findElement(By.xpath("/html/body/div[5]/div[1]/section[1]/div/div/div/section[2]/div/div[2]/div/div/div/div/i[1]"));
        menu.click();

        WebElement customers = driver.findElement(By.xpath("/html/body/div[5]/div[1]/section[1]/div/div/div/section[2]/div/div[2]/div/div/div/nav[2]/ul/li[4]"));
        customers.click();

        WebElement getInTouch = driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div/main/article/div/div/section[10]/div/div/div/div[2]/div/span/span/a"));
        getInTouch.click();

    }

    @AfterMethod
    public void quit(){
        // Затваряне на браузъра
     //   if (driver != null) {
      //      driver.quit();
        }

    }

//}
