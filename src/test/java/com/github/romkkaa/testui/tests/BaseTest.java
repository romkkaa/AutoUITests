package com.github.romkkaa.testui.tests;

import com.github.romkkaa.testui.SpringConfig;
import com.github.romkkaa.testui.pageobject.MainPage;
import com.github.romkkaa.testui.pageobject.SearchResultsPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

@ContextConfiguration(classes = {SpringConfig.class})
public abstract class BaseTest extends AbstractJUnit4SpringContextTests {

    @Autowired
    MainPage mainPage;

    @Autowired
    SearchResultsPage searchResultsPage;

}
