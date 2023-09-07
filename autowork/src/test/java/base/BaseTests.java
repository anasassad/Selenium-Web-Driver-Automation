package base;

import java.io.File;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.automation_school.HomePage;
import com.automation_school.LoginPage;

public class BaseTests {

    private WebDriver driver ;
    protected LoginPage loginPage ;
    protected HomePage homePage ;

    @BeforeClass
    public void setUp(){

        // Relative path to where chromedriver.exe is stored
        String chromeDriverPath = "src/main/resources/chromedriver.exe";

        // ChromeDriver executable object representation file
        File chromeDriverFile = new File(chromeDriverPath);

        if(chromeDriverFile.exists()){

            // Grab the absolute path (full path)
            // Recommanded approach
            System.setProperty("webdriver.chrome.driver", chromeDriverFile.getAbsolutePath());

            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://the-internet.herokuapp.com/");

            loginPage = new LoginPage(driver);
            homePage = new HomePage(driver);

        }

    }

    @AfterClass
    public void tearDown(){
            driver.quit();
    }
}
