package automationtestingsite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GuiElements {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://testautomationpractice.blogspot.com/");
        Thread.sleep(3000);
        WebElement userNameField = driver.findElement(By.cssSelector("input#name"));
        WebElement emailField = driver.findElement(By.cssSelector("input#email"));
        WebElement textAreaField = driver.findElement(By.cssSelector("textarea#textarea"));
        WebElement loginButton = driver.findElement(By.cssSelector("button.start"));

        userNameField.sendKeys("hello");
        Thread.sleep(3000);
        emailField.sendKeys("hello@gmail.com");
        Thread.sleep(3000);
        textAreaField.sendKeys("Koteshwor");
        Thread.sleep(3000);
        loginButton.click();
        Thread.sleep(5000);



        driver.findElement(By.linkText("Errorcode 404")).click();
    }
}
