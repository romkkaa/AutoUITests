package com.github.romkkaa.testui.tests;

import org.junit.Test;

import static org.junit.Assert.*;

public class RepositorySearchTests extends BaseTest {

    @Test
    public void findNonexistentRepoTest() {
        mainPage.get()
                .typeInSearchQuery("qwertdsafs123")
                .pressEnter();
        assertTrue(searchResultsPage.couldNotFindAnythingText.isDisplayed());
        assertEquals(0, searchResultsPage.searchResultListItems.size());
    }

    @Test
    public void findExistingReposTest() {
        mainPage.get()
                .typeInSearchQuery("google")
                .pressEnter();
        assertTrue(searchResultsPage.searchResultListItems.size() > 0);
        searchResultsPage.searchResultListItems.forEach(item -> assertTrue(item.getText().toLowerCase().contains("google")));
    }

}
