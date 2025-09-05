package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ImplicitWaitExample {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        driver.get("https://www.saucedemo.com/v1/");

        WebElement userNameField = driver.findElement(By.xpath("//input[@name='user-name']"));
        WebElement passWordField = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        WebElement loginButton = driver.findElement(By.xpath("//input[@id='login-button']"));

        userNameField.sendKeys("standard_user");
        passWordField.sendKeys("secret_sauce");
        loginButton.click();

        driver.close();
    }
}
