package techproed.Tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.testng.Assert.assertEquals;


public class Day23_SoftAssertion {

    @Test
    public void softAssertTest() {

        //Soft assertion yapabilmek için 3 adım izliyoruz:
        //1. Adım: Soft Assert objesi oluşturun:
        SoftAssert softAssert = new SoftAssert();

        //2. Adım: Assertion yapın:
        //1. assertion
        softAssert.assertEquals(1, 2);//Soft assertion kullanıldığı için test fail olsa bile Java çalışmayı durdurmaz.
        System.out.println("Assetion 1 çalıştı");

        //2. assertion
        softAssert.assertTrue("Selenium".contains("a"));//Üstteki assertion fail oldu fakat bu assertin da çalıştı. Çünkü soft assertion kullanıldığından Java çalışmayı durdurmadı.
        System.out.println("Assetion 2 çalıştı");

        //2. assertion
        softAssert.assertTrue(false);
        System.out.println("Assetion 3 çalıştı");


        //3. Adım: assertAll() methodunu çalıştırın:
        softAssert.assertAll();

        System.out.println("Hello");//Bu kod çalışmayacak. Çünkü assertAll() methodu fail durumunda assertionlar sonrası çalışmayı durdurur.
/*
eni bir Class Olusturun : C03_SoftAssert
1. “http://zero.webappsecurity.com/” Adresine gidin
2. Sign in butonuna basin
3. Login kutusuna “username” yazin
4. Password kutusuna “password” yazin
5. Sign in tusuna basin
6. Online banking menusu icinde Pay Bills sayfasina gidin
7. “Purchase Foreign Currency” tusuna basin
8. “Currency” drop down menusunden Eurozone’u secin
9. soft assert kullanarak "Eurozone (Euro)" secildigini test edin
10.soft assert kullanarak DropDown listesinin su secenekleri oldugunu test
edin "Select One", "Australia (dollar)", "Canada (dollar)","Switzerland
(franc)","China (yuan)","Denmark (krone)","Eurozone (euro)","Great Britain
(pound)","Hong Kong (dollar)","Japan (yen)","Mexico (peso)","Norway
(krone)","New Zealand (dollar)","Sweden (krona)","Singapore
(dollar)","Thailand (baht)"
 */

    }

}