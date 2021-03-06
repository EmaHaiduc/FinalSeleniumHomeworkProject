package org.fasttrackit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

    protected WebDriver driver;
   @Before
   public void setUp(){

       System.setProperty("webdriver.chrome.driver", AppConfig.getChromeDriverPath());
       driver= DriverFactory.initWebDriver("chrome");

       driver.get(AppConfig.getSiteUrl());
   }
  // @After
    public void tearDown(){
       driver.quit();
   }

}
