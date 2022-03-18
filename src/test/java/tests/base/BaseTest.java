package tests.base;

import common.CommonAction;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;
import pages.login.LoginPage;

public class BaseTest {
    protected WebDriver driver = CommonAction.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected LoginPage loginPage = new LoginPage(driver);
}
