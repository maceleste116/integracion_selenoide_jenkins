package qa.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class PageBase {
    protected WebDriver webDriver;

    @Autowired
    public PageBase(WebDriver webDriver){
        this.webDriver = webDriver;
        webDriver.manage().window().maximize();
        //webDriver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
        PageFactory.initElements(webDriver,this);
    }
}
