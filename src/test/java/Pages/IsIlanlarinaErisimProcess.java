package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class IsIlanlarinaErisimProcess {



    public IsIlanlarinaErisimProcess(){

        PageFactory.initElements(Driver.getDriver(),this);




    }

    @FindBy(xpath = "//*[@id=\"global-nav\"]/div/nav/ul/li[3]")

    public WebElement ustMenuIsIlanlari;

    @FindBy(xpath = "(//span[@class='t-black t-bold t-14'])[1]")

    public WebElement myWorks;









}
