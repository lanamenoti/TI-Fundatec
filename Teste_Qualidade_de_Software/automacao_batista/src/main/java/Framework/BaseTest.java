package Framework;

import Framework.Browser.DriverManager;
import Framework.Browser.TypeDriver;
import Framework.Report.Report;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

public class BaseTest extends DriverManager {

    private static WebDriver driver;

    private String url = "https://automacaocombatista.herokuapp.com";

    public WebDriver getDriver(){

        return driver = getDriver(TypeDriver.CHROME);

    }

    @BeforeEach
    public void setUp(){

        Report.setExtentReports();
        getDriver().get(url);
    }

    @AfterEach
    public void tearDown(){

        Report.endReport();
        quitDriver();
    }




}

