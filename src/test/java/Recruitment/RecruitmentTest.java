package Recruitment;

import Recruitment.Data.MapJson;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Recruitment.Service.MainPage;
import java.util.concurrent.TimeUnit;

public class RecruitmentTest {
    WebDriver crm;
    MainPage mainpage;

    @BeforeClass
    public void openCRM(){
        crm = new ChromeDriver();
        mainpage = new MainPage(crm);
        crm.manage().window().maximize();
        crm.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        mainpage.openPage();
    }

    @Test()
    public void test1(){
        MapJson.GetData();
    }

    @AfterClass
    public void closeCRM() throws InterruptedException {
        crm.quit();
    }
}
