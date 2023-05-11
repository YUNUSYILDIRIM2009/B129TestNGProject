package techproed.Tests;

import org.testng.annotations.Test;
import techproed.utilities.Driver;

public class Day23_Driver_ConfigReader_Test {

    @Test
    public void driverTest(){

        //https://techproeducation.com/ sayfasına gidiniz
        Driver.getDriver().get("https://techproeducation.com/");

        //Title testi yapınız

        //sayfayı kapatınız.
        Driver.closeDriver();




    }



}