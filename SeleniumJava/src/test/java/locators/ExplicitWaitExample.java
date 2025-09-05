package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWaitExample {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        WebDriverWait explicitW = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://www.saucedemo.com/v1/");

        WebElement userNameField = explicitW.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='user-name']")));
        userNameField.sendKeys("standard_user");

        WebElement passWordField = explicitW.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
        passWordField.sendKeys("secret_sauce");

        WebElement loginButton = explicitW.until(ExpectedConditions.visibilityOfElementLocated(By.id("login-button")));
        loginButton.click();
    }
}
