package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeLocalDriverFactory {
    private ChromeOptions chromeOptions;

    ChromeLocalDriverFactory(ChromeOptions chromeOptions){
        this.chromeOptions=chromeOptions;
    }
    WebDriver driver(){
        return new ChromeDriver();
    }
    }


