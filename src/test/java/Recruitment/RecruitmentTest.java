package Recruitment;

import Recruitment.Data.Data;
import Recruitment.Data.MapJson;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import Recruitment.Service.HomePage;
import java.util.concurrent.TimeUnit;

public class RecruitmentTest {
    WebDriver crm1;
    WebDriver crm2;
    HomePage homepage;

    @BeforeClass
    public void openCRM(){
        crm1 = new ChromeDriver();
        crm2 = new ChromeDriver();
    }

    @Test
    public void createdCandidateTest(){
        homepage = new HomePage(crm1);
        homepage.openPage();
    }

    @Test
    public void cretedCandidateTest2(){
        homepage = new HomePage(crm2);
        homepage.openPage();
    }

    @AfterClass
    public void closeCRM() throws InterruptedException {
        crm1.quit();
        crm2.quit();
    }
}
