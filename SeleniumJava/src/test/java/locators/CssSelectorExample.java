package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorExample {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.saucedemo.com/v1/");

        WebElement userName = driver.findElement(By.cssSelector("input#user-name"));
        userName.sendKeys("standard_user");
        WebElement passWord = driver.findElement(By.cssSelector("input#password"));
        passWord.sendKeys("secret_sauce");
        WebElement loginButton = driver.findElement(By.cssSelector("input.btn_action"));
        loginButton.click();
    }
}
