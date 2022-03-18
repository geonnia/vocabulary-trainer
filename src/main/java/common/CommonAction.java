package common;

import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.asserts.Assertion;

import java.util.concurrent.TimeUnit;

import static common.Config.BROWSER_AND_PLATFORM;
import static constants.Constants.TimeoutVariable.IMPLICIT_WAIT;

public class CommonAction {
    public static WebDriver createDriver(){
        WebDriver driver = null;
        switch (BROWSER_AND_PLATFORM){
            case "CHROME":
                System.setProperty("webdriver.chrome.driver", "src/main/resources/chrome/chromedriver");
                driver = new ChromeDriver();
                break;
            case "MOZILLA":
                System.setProperty("webdriver.gecko.driver", "src/main/resources/mozilla/geckodriver");
                driver = new FirefoxDriver();
                break;
            default:
                System.out.println("Incorrect browser name " + BROWSER_AND_PLATFORM);
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);
        return driver;
    }
}
