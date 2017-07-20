package com.simbirsoft.mvnbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test1 {

    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");

        driver = new ChromeDriver();
    }

    @Test
    public void test1() {
        driver.get("https://google.com/");
        Assert.assertEquals(1, 1);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

}
