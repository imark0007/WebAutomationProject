package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class HandleDiffWait extends BrowserSetup{

    @Test
    public void testWait(){

        browser.get("https://qavbox.github.io/demo/alerts/");
        clickOnElement(By.id("delayalert"));
        WebDriverWait wait = new WebDriverWait(browser, Duration.ofSeconds(10));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
//      Alert alert = browser.switchTo().alert();

        Assert.assertEquals(alert.getText(), "I appeared after 5 seconds!");
        alert.accept();

        browser.get("https://qavbox.github.io/demo/delay/");
        clickOnElement(By.name("commit1"));
        WebElement element =  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h2[@id='delay']")));
        browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        Assert.assertTrue(getElement(By.xpath("//h2[@id='delay']")).isDisplayed());


    }












}
