package driver;

import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Arrays;

public class ChromeOptionsFactory {
    ChromeOptions build(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        chromeOptions.addArguments("lang=pt-BR");
        chromeOptions.setCapability("chrome.switches", Arrays.
                asList("--ignore-certificate-errors,--web-security=false,--ssl-protocol=any,--ignore-ssl-errors=true"));
        chromeOptions.setAcceptInsecureCerts(true);
        return chromeOptions;
    }

}
