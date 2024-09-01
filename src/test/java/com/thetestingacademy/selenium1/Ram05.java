package com.thetestingacademy.selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Ram05 {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.get("https://zaggle.in");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());
    }
}
