package com.thetestingacademy.selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Ram08 {
    @Test
    public void Zaggle() {
        WebDriver driver = new EdgeDriver();
        driver.get("https://zaggle.in");
        Assert.assertEquals(driver.getTitle(), "https;//zaggle.in");
        Assert.assertEquals(driver.getCurrentUrl(), "https://zaggle.in");
        driver.quit();

    }
}
