package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {
    protected static WebDriver driver;

    public void initializeDriver() {
//        System.setProperty("web driver.chrome.driver", "C:/Users/mysel/Desktop/Capestone_Project/Scenario1/src/test/resources/driver/chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.manage().window().maximize();

        String path=System.getProperty("user.dir");
        System.out.println(path);
        System.setProperty("web driver.chrome.driver",path+"src/test/resources/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    public void terminate(){
        driver.quit();
    }
}
