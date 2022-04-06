package com.github.romkkaa.testui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.concurrent.TimeUnit;

@Component
public class DriverManager {

    private static final String PATH_TO_DRIVERS = "src/main/resources/drivers/";

    static {
        String operatingSystem = System.getProperty("os");
        System.setProperty("webdriver.chrome.driver",  PATH_TO_DRIVERS + operatingSystem + "/chromedriver");
        System.setProperty("webdriver.gecko.driver",  PATH_TO_DRIVERS + operatingSystem + "/geckodriver");
    }

    private WebDriver webDriver;

    public WebDriver getWebDriver() {
        return webDriver;
    }

    @PostConstruct
    public void initWebDriver() {
        String browser = System.getProperty("browser");
        if (browser.equals("firefox")) setUpFirefoxDriver();
        else setUpChromeDriver();
    }

    private void setUpChromeDriver() {
        webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    private void setUpFirefoxDriver() {
        webDriver = new FirefoxDriver();
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @PreDestroy
    private void quitWebDriver() {
        webDriver.quit();
    }
}
