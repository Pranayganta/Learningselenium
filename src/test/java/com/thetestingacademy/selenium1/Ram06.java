package com.thetestingacademy.selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Ram06 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.zaggle.in");
        Thread.sleep(5000);
        // driver.close();
        driver.quit();
    }
}
