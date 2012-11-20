package com.bishop.pages.admin;


import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;
import java.net.URI;
import java.net.URISyntaxException;

import static org.junit.Assert.assertTrue;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"application-context-test.xml"})
public class IT {

    @Inject
    private URI siteBase;

    @Inject
    private WebDriver driver;

    @Test
    public void getIndex() throws URISyntaxException {

        driver.get(siteBase.toString());
        assertTrue(driver.getPageSource().contains("Category Name"));
    }

    @Test
    public void testUploadFile(){
        driver.get(siteBase.toString());
        WebElement fileUploader = driver.findElement(By.id("j_idt19:fileUploader"));
        fileUploader.sendKeys("C:\\Users\\shevchik\\Dropbox\\projects\\java\\bishop\\src\\test\\java\\com.bishop\\pages\\admin\\test.png");

    }
    @After
    public void close(){
        driver.close();
    }
}
