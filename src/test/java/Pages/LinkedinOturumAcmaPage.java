package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LinkedinOturumAcmaPage {


    public LinkedinOturumAcmaPage(){

        PageFactory.initElements(Driver.getDriver(),this);



    }


    @FindBy(xpath = "//input[@id='username']")

    public WebElement linkedinEmailArea;

    @FindBy(xpath = "//input[@id='password']")

    public WebElement linkedinPasswordArea;

    @FindBy(xpath = "//button[@class='btn__primary--large from__button--floating']")

    public WebElement linkedinOturumAcBtn;

















}
