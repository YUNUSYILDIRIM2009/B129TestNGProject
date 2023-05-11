package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;
import utilities.Driver;

public class AmazonPage {


    public AmazonPage() {

        Driver Driver;
        PageFactory.initElements(Driver.getDriver(),this);
    }



    @FindBy(xpath = "//select[@id='searchDropdownBox']")
    public WebElement ddm;



    @FindBy(xpath = "//input[@id='twotabsearchtextbox']")
    public WebElement aramaKutusu;



    @FindBy(xpath = "(//img[@class='s-image'])[2]")
    public WebElement ikinciUrun;














}