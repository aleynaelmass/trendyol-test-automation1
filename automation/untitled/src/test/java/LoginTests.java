import Base.BaseTest;
import Pages.LoginPage;
import Pages.MainPage;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {

    LoginPage loginPage = new LoginPage();
    MainPage mainPage =new MainPage();

    @Test(description = "Başarılı kullanıcı girişi testi.")
    public void basariligiris() {
        loginPage.fillEmail(email)
                .fillPassword(password)
                .clickLogin();
        sleep(3000);

        mainPage.accountControl();

    }



    @Test(description = "Başarısız kullanıcı girişi testi.")
    public void basarisizgiris() {
        loginPage.fillEmail(email)
                .fillPassword("1234.test")
                .clickLogin();
        sleep(3000);

        loginPage.errorMessageControl("E-posta adresiniz ve/veya şifreniz hatalı.");


    }




}
