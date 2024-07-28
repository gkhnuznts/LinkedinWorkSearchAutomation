package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WorkSearch {

    public WorkSearch(){

        PageFactory.initElements(Driver.getDriver(),this);




    }

    @FindBy(xpath = "//input[@placeholder='Arama yap']")

    public WebElement globalSearchArea;

    @FindBy (xpath = "//div[@class='jobs-search-results-list__subtitle']")

    public WebElement aramasonucu;

    @FindBy (xpath = "//*[@id=\"search-reusables__filters-bar\"]/ul/li[3]/button")

    public WebElement aramaSonrasıIsIlanlarıBtn;

    @FindBy (xpath = "//div[@class='mh4 pt4 pb3']")

    public WebElement iseAlimTakimiAlani;

    @FindBy (xpath = "//button[@class='jobs-save-button artdeco-button artdeco-button--secondary artdeco-button--3']")

    public WebElement isDetaydakiKaydetButonu;

    // WWebElement Locate leri icin açıklama kısmı yazıldı






}
