package tests.day15_SoftAssert;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class C05_SoftAssert {

    @Test
    public void  test01(){
        //1.adım softAsset objesi oluşturmak
        SoftAssert softAssert=new SoftAssert();
        // 2. adım softAsset objesini kullanarak istenilen assertion'ları yapın
        softAssert.assertEquals(6,8); //FAILED
        System.out.println("1.assertion sonrası");
        softAssert.assertTrue(5>3); // PASSED
        System.out.println("2.assertion sonrası");
        softAssert.assertFalse(8>5); // FAILED
        System.out.println("3.assertion sonrası");
        //3. adım softAsset'e raporla diyecegiz
        softAssert.assertAll(); // bu satırda çalışma durur çünkü FAILED olan assertion var
        System.out.println("assertAll sonrasi");
    }

}
