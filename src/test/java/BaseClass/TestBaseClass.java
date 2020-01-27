package BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestBaseClass {

    public static Properties prop;
    public static WebDriver driver;


    public TestBaseClass() throws IOException {
        prop = new Properties();
        try {
            FileInputStream Util = new FileInputStream("/Users/sai/eclipse-workspace/Automation/src/Confict/Properties/Config.Properties");
            prop.load(Util);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void initialization() throws InterruptedException{

        driver=new ChromeDriver();
        //driver = new FirefoxDriver();

        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.get(prop.getProperty("Url"));



    }
}
