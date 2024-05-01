package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HandleiFrame extends BrowserSetup{

    @Test
    public void test_Scroll() throws InterruptedException {
        browser.get("https://rahulshettyacademy.com/AutomationPractice/");
        JavascriptExecutor js = (JavascriptExecutor) browser;
        WebElement scrollToElement = getElement(By.xpath("//legend[normalize-space()='iFrame Example']"));
        js.executeScript("arguments[0].scrollIntoView()", scrollToElement);
        Thread.sleep(2000);

//      browser.switchTo().frame("courses-iframe");
//      browser.switchTo().frame(getElement(By.id("courses-iframe")));

        browser.switchTo().frame(0);
        getElement(By.xpath("//a[text()='Register']"));
//        browser.switchTo().parentFrame(); //for single
        browser.switchTo().defaultContent(); //for main excess
        getElement(By.xpath("//legend[normalize-space()='iFrame Example']"));



    }
}
