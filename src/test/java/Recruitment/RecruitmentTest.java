package Recruitment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RecruitmentTest {
    @BeforeClass
    public void openCRM(){
        System.out.println("Open CRM");
    }

    @Test()
    public void Test1(){
        WebDriver chrome = new ChromeDriver();
        WebDriver mozilla = new FirefoxDriver();
        System.out.println("Test CRM");
        Assert.assertEquals("1", "1");
    }

    @AfterClass
    public void closeCRM(){
        System.out.println("Close CRM");
    }
}
