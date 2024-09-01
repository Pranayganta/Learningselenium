package com.thetestingacademy.selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Ram03 {
    public static void main(String[] args) {
        //WebDriver driver1 = new EdgeDriver();
        // WebDriver driver2 = new ChromeDriver();
        WebDriver driver3 = new SafariDriver();
        driver3.get("https://zaggle.in");
        driver3.quit();


    }
}
