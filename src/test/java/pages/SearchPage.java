package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import sun.awt.windows.WBufferStrategy;
import utilities.Driver;

import java.util.List;

public class SearchPage {

    public SearchPage() { PageFactory.initElements(Driver.getDriver(),this); }

    //search products
    @FindBy(id = "searchval")
    public WebElement searchProducts;

    //search button
    @FindBy(xpath = "//div//button[@value='Search']")
    public WebElement searchButton;

    //search page header
    @FindBy(xpath = "//h1[@class='page-header search--title']")
    public WebElement searchPageTitle;

    //search result list on the  search pages
    @FindBy(xpath = "//div[@id='details']//a[contains(@href,'table')]")
    public List<WebElement> searchResultList;

    //search page 2 button
    @FindBy(xpath="//a[@aria-label='Page 2']")
    public WebElement searchPage2;

    //search page 3 button
    @FindBy(xpath="//a[@aria-label='Page 3']")
    public WebElement searchPage3;

    //search page 4 button
    @FindBy(xpath="//a[@aria-label='Page 4']")
    public WebElement searchPage4;

    //search page 5 button
    @FindBy(xpath="//a[@aria-label='Page 5']")
    public WebElement searchPage5;

    //search page 6 button
    @FindBy(xpath="//a[@aria-label='Page 6']")
    public WebElement searchPage6;

    //search page 7 button
    @FindBy(xpath="//a[@aria-label='Page 7']")
    public WebElement searchPage7;

    //search page 8 button
    @FindBy(xpath="//a[@aria-label='Page 8']")
    public WebElement searchPage8;

    //search page 9 button
    @FindBy(xpath="//a[@aria-label='Page 9']")
    public WebElement searchPage9;

    //add to card button
//    @FindBy(name = "addToCartButton")
//    public WebElement addToCardButton;
    @FindBy(id="buyButton")
    public WebElement addToCardButton;

    //cart
 //   @FindBy(xpath = "//a[@href='/viewcart.cfm']")
    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement viewCart;

    //empty cart button
    @FindBy(xpath = "//a[@class='emptyCartButton btn btn-mini btn-ui pull-right']")
    public WebElement emptyCartButton;

    //empty cart pop up confirmation button
    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement emptyCartPopUpConfirmationButton;

    //confirmation header
    @FindBy(className = "header-1")
    public WebElement confirmationHeader;





















}
