package Base;

import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class BaseLibrary extends Data {



    public void  sleep(int time){
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw  new RuntimeException(e);
        }



    }
}
