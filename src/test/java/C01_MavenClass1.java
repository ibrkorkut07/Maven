import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_MavenClass1 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        int i;

//    https://www.amazon.com/ sayfasina gidelim
        driver.get("https://www.amazon.com/");
//    arama kutusunu locate edelim
        WebElement searchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
//    “Samsung headphones” ile arama yapalim
        searchBox.sendKeys("Samsung headphones" + Keys.ENTER);
//    Bulunan sonuc sayisini yazdiralim
        WebElement resultText = driver.findElement(By.xpath("(//div[@class='sg-col-inner'])[1]"));
        System.out.println(resultText.getText());
//    Ilk urunu tiklayalim
        driver.findElement(By.xpath("(//img[@data-image-source-density='1'])[1]")).click();
//    Urun basligini yazdiralim
        System.out.println(driver.findElement(By.xpath("//span[@id='productTitle']")).getText());
        System.out.println(driver.getTitle());
//    bir onceki sayfaya donelim
        driver.navigate().back();
//    Sayfadaki tum basliklari yazdiralim
        List<WebElement> sectionList = driver.findElements(By.xpath("//a[@class='a-link-normal s-navigation-item']"));
        for (i = 0;i<sectionList.size(); i++) {
            System.out.println(sectionList.get(i).getText());
        }

    }

}
