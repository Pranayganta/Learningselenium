package com.thetestingacademy.selenium1;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Ram02 {
    @Test
    public void zaggleLogin() {
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://zaggle.in");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();


    }
}
