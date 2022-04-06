package com.github.romkkaa.testui.pageobject;

import com.github.romkkaa.testui.DriverManager;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public abstract class BasePage {

    static final String GITHUB_URL = "https://github.com/";

    @Autowired
    DriverManager driverManager;

    @PostConstruct
    void initElements() {
        PageFactory.initElements(driverManager.getWebDriver(), this);
    }

}
