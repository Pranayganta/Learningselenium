package com.thetestingacademy.selenium1;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class Cssselector1 {

    EdgeDriver driver;

    @BeforeTest
    public void openBrowser() {
        EdgeOptions options = new EdgeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("--guest");
        driver = new EdgeDriver(options);
    }

    @Test(groups = "QA")
    @Description("Test Case Description")
    public void testEbay() throws InterruptedException {

        driver.get("https://www.ebay.com/b/Desktops-All-In-One-Computers/171957/bn_1643067");
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();
        /*
         Search Element - cass selectors
         #gh-ac
         input[id="gh-ac"] --> xpath - //input[@id="gh-ac"]
        */
        WebElement searchBox = driver.findElement(By.cssSelector("input[id='gh-ac']"));
        searchBox.sendKeys("mamini");

        // click on search
        // click .gh-spr
        // input[value='Search']

        WebElement searchBoxButton = driver.findElement(By.cssSelector("input[value='Search']"));
        searchBoxButton.click();

        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        List<WebElement> searchTitles = driver.findElements(By.cssSelector(".s-item__title"));
        List<WebElement> searchTitlesPrices = driver.findElements(By.cssSelector(".s-item__price"));

        for (WebElement title : searchTitles) {
            System.out.println(title.getText());
        }
        for (WebElement prices : searchTitlesPrices) {
            System.out.println(prices.getText());
        }


    }

    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }


}
