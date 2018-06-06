package Recruitment.Service;

import Recruitment.Data.Data;
import Recruitment.Data.MapJson;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

/**
 * Contains methods for working with CRM homepage
 */
    public class HomePage {
        Data data = MapJson.getData("https://raw.githubusercontent.com/gunitptvz/CRMTestJava/master/src/jsonfiles/Config1.json");
        WebDriver crm;
        String inlinedialogframe = "InlineDialog_Iframe";
        @FindBy(id="buttonClose")
        WebElement closehellowwindowbutton;

    public HomePage(WebDriver crm){
        this.crm = crm;
        PageFactory.initElements(crm, this);
    }

    public void openPage(){
        crm.manage().window().maximize();
        crm.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        crm.get("http://" + data.getLogin() + ":" + data.getPassword() + "@" + data.getUrl());
        crm.switchTo().frame(inlinedialogframe);
        closehellowwindowbutton.click();
    }
}
