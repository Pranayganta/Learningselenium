package com.thetestingacademy.selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Ram11 {
    @Test
    public void testZaggleLoginNegative() throws InterruptedException {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--guest");
        EdgeOptions options = new EdgeOptions();
        // Add argument to disable notifications
        options.addArguments("--disable-notifications");
        edgeOptions.setPageLoadStrategy(PageLoadStrategy.NONE);
        WebDriver driver = new EdgeDriver();
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

        WebElement selectLeftMenuOption = driver.findElement(By.xpath("//a[img[@src='https://cdn.zaggle.in/uploads/site_image/file/28b0d959-6843-46c8-81d3-f9d16ce4cf1f/Group_3541.svg' and @class='menu-icon']"));
        selectLeftMenuOption.click();

        Thread.sleep(5000);
        driver.quit();

        // By Xpath
        // WebElement btnElement_xpath = driver.findElement(By.xpath("//button[@class='ant-btn red-btn ant-btn-primary']" ));
        // btnElement_xpath.click();

        //  WebElement btnElement_xpath = driver.findElement(By.xpath("//span[@text()='Login']"));
        //  btnElement_xpath.click();

    }
}
