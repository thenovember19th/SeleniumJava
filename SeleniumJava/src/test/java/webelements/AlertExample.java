package webelements;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AlertExample {
    public void simpleAlert(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        WebElement JsAlertButton = driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
        JsAlertButton.click();

        driver.switchTo().alert().accept();
    }

    public void otherAlert(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        WebElement alertButton = driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
        alertButton.click();

        driver.switchTo().alert().dismiss();


    }

    public void textAlert(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        WebElement alertButton = driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
        alertButton.click();

        driver.switchTo().alert().sendKeys("Hello");
        driver.switchTo().alert().accept();

    }

    public void authenticationAlert(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
    }

    public static void main(String[] args) {
        AlertExample simple = new AlertExample();
//        simple.simpleAlert();
//        simple.otherAlert();
//        simple.textAlert();
          simple.authenticationAlert();


    }
}
