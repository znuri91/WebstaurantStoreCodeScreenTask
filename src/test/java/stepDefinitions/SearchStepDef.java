package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.SearchPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.SeleniumUtils;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

public class SearchStepDef {

    SearchPage searchPage = new SearchPage();
    List<String>listOfProducts = new LinkedList<>();

    @Given("I am on the HomePage")
    public void i_am_on_the_home_page() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @When("I search for {string}")
    public void i_search_for(String productName) {
        searchPage.searchProducts.sendKeys(productName);
        searchPage.searchButton.click();

    }

    @Then("I should land on the search page with result")
    public void i_should_land_on_the_search_page_with_result() {
        Assert.assertEquals("Search Results for: stainless work table",searchPage.searchPageTitle.getText());

    }

    @Then("All products on the search list should have the word {string} in its title")
    public void all_products_on_the_search_list_should_have_the_word_in_its_title(String keyWord) {
         //only 1st search page implementation
        //for more similar steps we just need to click on each page

        for (WebElement product: searchPage.searchResultList) {
            Assert.assertTrue(product.getText().toLowerCase().contains(keyWord));
        }
   //  System.out.println(listOfProducts);

    }

    @When("I add last found item into the cart")
    public void i_add_last_found_item_into_the_cart() {
        searchPage.searchPage9.click();
        searchPage.searchResultList.get(searchPage.searchResultList.size()-1).click();
        searchPage.addToCardButton.click();



    }

    @Then("I should be able to go to the cart and empty cart")
    public void i_should_be_able_to_go_to_the_cart_and_empty_cart() throws InterruptedException {
        Thread.sleep(2000);
        searchPage.viewCart.click();
        searchPage.emptyCartButton.click();
        searchPage.emptyCartPopUpConfirmationButton.click();



    }

    @Then("I should be able to see {string} message")
    public void i_should_be_able_to_see_message(String message) {
        Assert.assertTrue(Driver.getDriver().getPageSource().contains(message));

    }
}
