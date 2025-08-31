package swaglabslogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabsLoginOtherSelector {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.saucedemo.com/v1/");
        Thread.sleep(2000); //not good practice to make speed slow. Selenium wait is used: implicit, explicit, fluent wait is used
/* ID, classname*/
        WebElement userNameField = driver.findElement(By.className("form_input"));
        WebElement passWordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.className("btn_action"));

        userNameField.sendKeys("standard_user");
        Thread.sleep(2000); //not good practice to make speed slow
        passWordField.sendKeys("secret_sauce");
        Thread.sleep(2000);  //not good practice to make speed slow
        loginButton.click();
        Thread.sleep(3000);

        driver.close();  //close current tab where script is running
//        driver.quit();  //closes all the tabs of the browser
    }
}
