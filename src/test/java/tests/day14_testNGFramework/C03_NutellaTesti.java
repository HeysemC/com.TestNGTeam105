package tests.day14_testNGFramework;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

public class C03_NutellaTesti {


    @Test
    public void test01(){

        // amazon anasayfaya gidin
        Driver.getDriver().get("https://www.ramazon.com");
        // nutella icin arama yapin
        //WebElement aramaKutusu= Driver.getDriver().findElement(By.id("twotabsearchtextbox"));
        AmazonPage amazonPage= new AmazonPage();

        amazonPage.amazonAramaKutusu.sendKeys("Nutella" + Keys.ENTER);

        // sonuclarin Nutella icerdigini test edin
        // WebElement aramaSonucuElementi= Driver.getDriver().findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));

        String expectedKelime="Nutella";
        String actualAramaSonucu= amazonPage.aramaSonucuElementi.getText();

        Assert.assertTrue(actualAramaSonucu.contains(expectedKelime));

        Driver.closeDriver();

    }
}
