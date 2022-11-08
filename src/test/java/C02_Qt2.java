import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;

public class C02_Qt2 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();

    //  https://www.google.com/ adresine gidin
        driver.get("https://www.google.com/ ");
    //  cookies uyarisini kabul ederek kapatin
        driver.findElement(By.xpath("(//div[@class='QS5gu sy4vM'])[2]")).click();
    //  Sayfa basliginin “Google” ifadesi icerdigini test edin
        String pageTitle = driver.getTitle();
        if (pageTitle.contains("Google")) {
            System.out.println("Title contains Google");
        } else {
            System.out.println("Title does NOT contain Google");
        }
    //  Arama cubuguna “Nutella” yazip aratin
        driver.findElement(By.xpath("//input[@title='Sök']")).sendKeys("Nutella" + Keys.ENTER);
    //  Bulunan sonuc sayisini yazdirin
        WebElement resultText = driver.findElement(By.xpath("//div[@id='result-stats']"));
        String result = resultText.getText();
        System.out.println(result);
    //  sonuc sayisinin 10 milyon’dan fazla oldugunu test edin
        String resultWords[] = result.split("Ungefär ");

        System.out.println(Arrays.toString(resultWords));
    //  Sayfayi kapatin

    }
}
