package Recruitment;

import Recruitment.Data.Data;
import Recruitment.Data.MapJson;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Recruitment.Service.HomePage;
import java.util.concurrent.TimeUnit;

public class RecruitmentTest {
    WebDriver crm;
    HomePage homepage;

    @BeforeClass
    public void openCRM(){
        crm = new ChromeDriver();
        homepage = new HomePage(crm);
        crm.manage().window().maximize();
        crm.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        homepage.openPage();
    }

    @Test()
    public void test1(){
        Data res = new Data();
        String url = "https://raw.githubusercontent.com/gunitptvz/CRMTestJava/master/Config1.json";
        res = MapJson.getData(url);
    }

    @AfterClass
    public void closeCRM() throws InterruptedException {
        crm.quit();
    }
}
