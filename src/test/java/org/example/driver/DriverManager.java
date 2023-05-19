package org.example.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class DriverManager {
    public static WebDriver driver;
    String browser = "chrome";
    String baseUrl = "https://demo.nopcommerce.com/";
    public DriverManager(){
        PageFactory.initElements(driver,this);
    }

    public void openLocalBrowser() throws IllegalAccessException {
        switch (browser){
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();

           // case "edge":
              //  WebDriverManager.edgedriver().setup();
              //  driver = new EdgeDriver();

          //  case  "firefox":
               // WebDriverManager.firefoxdriver().setup();
               // driver = new FirefoxDriver();

           // default:
              //  throw new IllegalAccessException();
        }
    }

    public void maximizingWindow(){
        driver.manage().window().maximize();
    }

    public void applyImplicitWait(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void closeBrowser(){
        driver.quit();
    }

    public void OpenUrl(){
        driver.get(baseUrl);
    }

    public String  getUrl(){
        return driver.getCurrentUrl();
    }
}
