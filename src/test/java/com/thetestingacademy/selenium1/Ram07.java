package com.thetestingacademy.selenium1;

import org.openqa.selenium.edge.EdgeDriver;

public class Ram07 {
    public static void main(String[] args) throws InterruptedException {
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://google.com");
        driver.navigate().to("https://zaggle.in");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }
}
