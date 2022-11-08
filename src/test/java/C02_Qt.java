import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Qt {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    //  http://zero.webappsecurity.com sayfasina gidin
        driver.get("http://zero.webappsecurity.com");
    //  Signin buttonuna tiklayin
        driver.findElement(By.id("signin_button")).click();
    //  Login alanine "username" yazdirin
        driver.findElement(By.id("user_login")).sendKeys("username");
    //  Password alanine "password" yazdirin
        driver.findElement(By.id("user_password")).sendKeys("password");
    //  Sign in buttonuna tiklayin
        driver.findElement(By.xpath("//input[@name='submit']")).click();
        driver.findElement(By.id("details-button")).click();
    //  Pay Bills sayfasina gidin
    //  amount kismina yatirmak istediginiz herhangi bir miktari yazin
    //  tarih kismina "2020-09-10" yazdirin
    //  Pay buttonuna tiklayin
    //  "The payment was successfully submitted.” mesajinin ciktigini control edin

    }
}
