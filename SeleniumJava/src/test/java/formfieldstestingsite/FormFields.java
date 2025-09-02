package formfieldstestingsite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FormFields {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice-automation.com/form-fields/");

        WebElement name = driver.findElement(By.cssSelector("input#name-input"));
        WebElement passWord = driver.findElement(By.cssSelector("input[type='password']"));

        name.sendKeys("hello");
        Thread.sleep(3000);

        List<WebElement> elem = driver.findElements(By.tagName("a"));
        System.out.println(elem.size());

        driver.findElement(By.linkText("Home")).click();
        Thread.sleep(3000);

        driver.findElement(By.linkText("Sliders")).click();
        Thread.sleep(3000);

        driver.navigate().back();
        Thread.sleep(3000);

        driver.findElement(By.linkText("entering text into an input field")).click();

        driver.close();
    }
}
