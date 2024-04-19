package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import javax.sql.rowset.WebRowSet;

public class TestWebPage extends BrowserSetup {
    @Test
    public void testPage() throws InterruptedException {

        browser.get("https://rahulshettyacademy.com/AutomationPractice/");
        WebElement autoCompleteTestBox = browser.findElement(By.id("autocomplete"));
        autoCompleteTestBox.sendKeys("Hello World");
        Thread.sleep(2000);
       /*
        * WebElement radioButton = browser.findElement(By.name("radioButton"));
        * radioButton.click();
       */
        WebElement checkBoxOption1 = browser.findElement(By.name("checkBoxOption1"));
        checkBoxOption1.click();
        Thread.sleep(2000);
        WebElement option1 = browser.findElement(By.className("radioButton"));
        option1.click();

        WebElement title = browser.findElement(By.tagName("h1"));
        System.out.println(title.getText());

        Thread.sleep(2000);

        browser.findElement(By.cssSelector("input[value='radio2']")).click();
        Thread.sleep(2000);
        browser.findElement(By.xpath("//input[@value='radio3']")).click();
        Thread.sleep(3000);

        /*browser.findElement(By.linkText("Free Access to InterviewQues/ResumeAssistance/Material")).click();*/

        /*browser.findElement(By.partialLinkText("Free Access")).click();*/

        browser.quit();
    }

}
