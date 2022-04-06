package com.github.romkkaa.testui.pageobject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

@Component
public class MainPage extends BasePage {

    @FindBy(css = "input[name='q']")
    public WebElement searchQueryInput;

    public MainPage get() {
        driverManager.getWebDriver().get(GITHUB_URL);
        return this;
    }

    public MainPage typeInSearchQuery(String searchQuery) {
        searchQueryInput.sendKeys(searchQuery);
        return this;
    }

    public MainPage pressEnter() {
        searchQueryInput.sendKeys(Keys.RETURN);
        return this;
    }

}
