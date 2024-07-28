package tests;

import Pages.IsIlanlarinaErisimProcess;
import Pages.LinkedinOturumAcmaPage;
import Pages.WorkSearch;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class LinkedinOturumAc extends Driver {



    @Test

    public void loginProcess(){


        Driver.getDriver().get("https://www.linkedin.com/checkpoint/rm/sign-in-another-account?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");




        LinkedinOturumAcmaPage linkedinOturumAcmaPage = new LinkedinOturumAcmaPage();

        Assert.assertTrue(linkedinOturumAcmaPage.linkedinEmailArea.isDisplayed());

        linkedinOturumAcmaPage.linkedinEmailArea.sendKeys("uzuntas.mustafagokhan@gmail.com");

        ReusableMethods.bekle(1);

        Assert.assertTrue(linkedinOturumAcmaPage.linkedinPasswordArea.isDisplayed());

        linkedinOturumAcmaPage.linkedinPasswordArea.sendKeys("Nideknil159.951");

        ReusableMethods.bekle(1);

        Assert.assertTrue(linkedinOturumAcmaPage.linkedinOturumAcBtn.isDisplayed());

        linkedinOturumAcmaPage.linkedinOturumAcBtn.click();



    }

    @Test(dependsOnMethods = "loginProcess")

    public void isIlanlarinaErisim(){

        IsIlanlarinaErisimProcess isIlanlarinaErisimProcess = new IsIlanlarinaErisimProcess();


        isIlanlarinaErisimProcess.ustMenuIsIlanlari.click();

        ReusableMethods.bekle(1);

        isIlanlarinaErisimProcess.myWorks.click();

        ReusableMethods.bekle(1);

        driver.navigate().back();

        ReusableMethods.bekle(1);



    }

    @Test(dependsOnMethods = "isIlanlarinaErisim")

    public void workSearchProcess(){


        WorkSearch workSearch = new WorkSearch();

        workSearch.globalSearchArea.sendKeys("QA Engineer"+ Keys.ENTER);

        workSearch.aramaSonrasıIsIlanlarıBtn.click();

        ReusableMethods.bekle(1);







    }

    @Test(dependsOnMethods = "workSearchProcess")

    public void browseWorkList() throws InterruptedException {

        List<WebElement> isIlanlariList = driver.findElements(By.xpath("//ul[@class='scaffold-layout__list-container']"));

        WorkSearch workSearch = new WorkSearch();

        for (WebElement job : isIlanlariList) {
            job.click();
            Thread.sleep(2000);  // wait for job details to load

            if (workSearch.iseAlimTakimiAlani.isDisplayed()) {

                workSearch.isDetaydakiKaydetButonu.click();

                System.out.println("Bu is ilani ise alim takimi bilgisini iceriyor");

                driver.navigate().back();
            } else {
                System.out.println("Bu is ilani ise alim takimi bilgisini icermiyor");
                // Do something if the section is found
                driver.navigate().back();
            }


            Thread.sleep(2000);  // wait for job listings to load again






        }


        
    }



}
