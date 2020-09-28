package qa.util;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import qa.enums.Browser;
import java.net.URI;
import java.net.MalformedURLException;

@Component
public class DriverFactory {

    @Value("${grid.url}")
    private String gridUrl;

    @Value("${remote.execution}")
    private boolean remoteExecution;

    public WebDriver get(Browser browser) throws MalformedURLException {

        if(remoteExecution) {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setBrowserName(browser.name());
            capabilities.setCapability(capabilityName: "enableVNC", value: true);
            capabilities.setCapability(capabilityName: "enableVideo", value: true);
            RemoteWebDriver remoteWebDriver = new RemoteWebDriver(URI.create(gridUrl).toURL(),capabilities);
            return remoteWebDriver;

        } else if (Browser.chrome == browser) {
            new DesiredCapabilities();
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\berdinas\\IdeaProjects\\drivers\\win\\chromedriver.exe");
            return new ChromeDriver();
        } else if (Browser.firefox == browser) {
            new DesiredCapabilities();
            System.setProperty("webdriver.gecko.driver", "C:\\Users\\berdinas\\IdeaProjects\\drivers\\win\\geckodriver.exe");
            return new FirefoxDriver();
        }else {
            throw new IllegalArgumentException("Driver not found for browser: " + browser);
        }
    }

}

