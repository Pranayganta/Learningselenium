package com.thetestingacademy.selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Ram10 {

    public static void main(String[] args) {
        EdgeOptions EdgeOptions = new EdgeOptions();
        WebDriver driver = new EdgeDriver(EdgeOptions);
        driver.get("https://dev-app.zaggleems.com/");
        final WebDriver webDriver = driver;
        webDriver.quit();

    }
}
