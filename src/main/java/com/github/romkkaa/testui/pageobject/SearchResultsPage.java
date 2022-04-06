package com.github.romkkaa.testui.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SearchResultsPage extends BasePage {

    @FindBy(xpath = "//h3[contains(text(),'couldn’t find any repositories')]")
    public WebElement couldNotFindAnythingText;

    @FindBy(css = ".repo-list-item")
    public List<WebElement> searchResultListItems;
}
