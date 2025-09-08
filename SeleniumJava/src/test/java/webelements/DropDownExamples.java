package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class DropDownExamples {
    public void normalDropdown(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://practice-automation.com/form-fields/");

        WebElement drpDwn = driver.findElement(By.id("automation"));
        Select drpDwnElement = new Select(drpDwn);

        drpDwnElement.selectByVisibleText("Yes");
        drpDwnElement.selectByVisibleText("Undecided");
        drpDwnElement.selectByIndex(1);

        List<WebElement> allOptions = drpDwnElement.getOptions();
        System.out.println(allOptions.size());
    }

    public  void hiddenDropDown(){
        WebDriver driver  = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//        driver.get("https://opensource-demo.orangehrmlive");
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        WebElement loginButton = driver.findElement(By.tagName("button"));

        username.sendKeys("Admin");
        password.sendKeys("admin123");
        loginButton.click();

        WebElement sideBarElem = driver.findElement(By.xpath("//span[text()='PIM']"));
        sideBarElem.click();

        WebElement actualDropdown = driver.findElement(By.xpath("//label[text()='Job Title']/parent::div/following-sibling::div"));
        actualDropdown.click();

        WebElement droOpt = driver.findElement(By.xpath("//span[text()='Chief Technical Officer']"));
        droOpt.click();
    }

    public static void main(String[] args) {
        DropDownExamples drp = new DropDownExamples();
//        drp.normalDropdown();
        drp.hiddenDropDown();
    }
}
