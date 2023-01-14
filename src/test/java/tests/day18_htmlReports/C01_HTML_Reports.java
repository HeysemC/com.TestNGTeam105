package tests.day18_htmlReports;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class C01_HTML_Reports extends TestBaseRapor {

    @Test
    public void test01(){

        extentTest=extentReports.createTest("Nutella testi","Kullanici amazonda Nutella aratti");

        //amazona gidelim
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        extentTest.info("Amazon anasayfaya gidildi");

        // nutella aratalım
        AmazonPage amazonPage=new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys("Nutella"+ Keys.ENTER);
        extentTest.info("Arama kutusuna Nutella yazip,aratildi");

        //sonucların nutella içerdiğini test edelim
        String actualSonucYazisi=amazonPage.amazonAramaKutusu.getText();
        String expectedKelime="Nutella";
        extentTest.info("Arama sonuclari kaydedildi");

        Assert.assertTrue(actualSonucYazisi.contains(expectedKelime));
        extentTest.info("Arama sonuclarinin Nutella icerdigi test edildi");

    }





}
