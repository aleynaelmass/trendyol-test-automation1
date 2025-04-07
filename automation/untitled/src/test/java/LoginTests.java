import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests {

    @Test
    public void basariligiris() throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();;
        driver.get("https://www.trendyol.com/giris");
        driver.findElement(By.id("login-email")).sendKeys("votim17468@buides.com");
        driver.findElement(By.name("login-password")).sendKeys("Test123ale");
        driver.findElement(By.cssSelector("[class='q-primary q-fluid q-button-medium q-button submit']")).submit();
        Thread.sleep(3000);

        String text = driver.findElements(By.cssSelector("[class='link-text']")).get(0).getText();
        System.out.println(text);

        Assert.assertEquals(text, "Hesabım");
        driver.quit();
    }


    @Test
    public void basarisizgiris() throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();;
        driver.get("https://www.trendyol.com/giris");
        driver.findElement(By.id("login-email")).sendKeys("votim17468@buides.com");
        driver.findElement(By.name("login-password")).sendKeys("Test124ale");
        driver.findElement(By.cssSelector("[class='q-primary q-fluid q-button-medium q-button submit']")).submit();
        Thread.sleep(3000);

        String text = driver.findElement(By.cssSelector("[class='message']")).getText();
        System.out.println(text);

        Assert.assertEquals(text, "E-posta adresiniz ve/veya şifreniz hatalı.");
        driver.quit();
    }


}
