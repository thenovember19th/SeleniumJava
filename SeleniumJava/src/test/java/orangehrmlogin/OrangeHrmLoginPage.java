package orangehrmlogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmLoginPage {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(5000);

        WebElement userNameField = driver.findElement(By.name("username"));
        WebElement passWordField = driver.findElement(By.name("password"));
        WebElement loginButton = driver.findElement(By.className("orangehrm-login-button"));

        userNameField.sendKeys("Admin");
        Thread.sleep(5000);
        passWordField.sendKeys("admin123");
        Thread.sleep(5000);
        loginButton.click();
        Thread.sleep(5000);

//        driver.close();
    }
}
