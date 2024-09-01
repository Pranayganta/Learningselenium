package com.thetestingacademy.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Ram13 {
    @Test
    public void devZaggleLoginTest() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NONE);
        WebDriver driver = new ChromeDriver();
        driver.get("https://dev-app.zaggleems.com/");
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "Expense Management Software | Expense Reimbursements");
        Assert.assertEquals(driver.getCurrentUrl(), "https://dev-app.zaggleems.com/");
        WebElement emailInputBox = driver.findElement(By.id("normal_login_username"));
        emailInputBox.sendKeys("vayupatel@yopmail.com");
        WebElement passwordInputBox = driver.findElement(By.id("normal_login_password"));
        passwordInputBox.sendKeys("Zaggle@123");
        // By tag Name
        List<WebElement> buttonList = driver.findElements(By.tagName("button"));
        buttonList.get(0).click();

        // WebElement selectLeftMenuOption = driver.findElement(By.xpath("//a[img[@src='https://cdn.zaggle.in/uploads/site_image/file/28b0d959-6843-46c8-81d3-f9d16ce4cf1f/Group_3541.svg' and @class='menu-icon']" ));
        // selectLeftMenuOption.click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();

    }
}
