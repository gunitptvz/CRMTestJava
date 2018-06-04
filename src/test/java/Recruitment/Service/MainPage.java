package Recruitment.Service;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

    public class MainPage {
    WebDriver crm;
    String inlinedialogframe = "InlineDialog_Iframe";
    @FindBy(id="buttonClose")
    WebElement closehellowwindowbutton;

    public MainPage(WebDriver driver){
        this.crm = driver;
        PageFactory.initElements(driver, this);
    }

    public void openPage(){
        crm.get("http://Administrator:Index139240!@195.88.73.192/CDVRecruitmentDev/main.aspx#745119928");
        crm.switchTo().frame(inlinedialogframe);
        closehellowwindowbutton.click();
    }
}
