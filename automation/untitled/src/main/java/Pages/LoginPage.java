package Pages;

import Base.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.testng.Assert;

public class LoginPage extends BaseTest {

    @Step("eposta alanı doldurulur.")
    public LoginPage fillEmail(String email){
        driver.findElement(By.id("login-email")).sendKeys(email);
        return this;

    }

    @Step("Parola alanımız doldurulur.")
    public LoginPage fillPassword(String password){
        driver.findElement(By.name("login-password")).sendKeys(password);
        return this;

    }

    @Step("Login alanına tıklanır.")
    public LoginPage clickLogin(){
        driver.findElement(By.cssSelector("[class='q-primary q-fluid q-button-medium q-button submit']")).submit();
        return this;

    }

    @Step("Hata mesajı kontrol edilir.")
    public LoginPage errorMessageControl(String value){
        String text = driver.findElement(By.cssSelector("[class='message']")).getText();
        Assert.assertEquals(text, value);

        return this;
    }

}
