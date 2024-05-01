package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class handleScroll extends BrowserSetup{

    @Test
    public void test_Scroll() throws InterruptedException {
        browser.get("https://rahulshettyacademy.com/AutomationPractice/");
        JavascriptExecutor js = (JavascriptExecutor) browser;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        Thread.sleep(2000);
        js.executeScript("window.scrollTo(document.body.scrollHeight, 0);");
        Thread.sleep(2000);
        WebElement hoverElement = getElement(By.xpath("//button[@id='mousehover']"));
        js.executeScript("arguments[0].scrollIntoView()", hoverElement);
        Thread.sleep(2000);

    }
}
