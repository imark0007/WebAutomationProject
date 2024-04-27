package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.security.Key;
import java.util.List;

public class HandleAction extends BrowserSetup{

    @Test
    public void testAction() throws InterruptedException {

        browser.get("https://rahulshettyacademy.com/AutomationPractice/");
        Actions actions = new Actions(browser);
        WebElement hoverElement = getElement(By.xpath("//button[@id='mousehover']"));
        actions.scrollToElement(hoverElement).build().perform();
        actions.scrollByAmount(0,100).build().perform();
        actions.clickAndHold(hoverElement).build().perform();


//      clickOnElement(By.xpath("//button[@id='mousehover']"));
        Thread.sleep(2000);
        clickOnElement(By.xpath("//a[normalize-space()='Top']"));
        Thread.sleep(2000);

        clickOnElement(By.id("dropdown-class-example"));
        actions.sendKeys(Keys.ARROW_DOWN).build().perform();
        Thread.sleep(2000);
        actions.sendKeys(Keys.ARROW_DOWN).build().perform();
        Thread.sleep(2000);
        actions.sendKeys(Keys.ARROW_DOWN).build().perform();
        Thread.sleep(2000);
        actions.sendKeys(Keys.ARROW_UP).build().perform();
        Thread.sleep(2000);
        actions.sendKeys(Keys.ARROW_UP).build().perform();
        Thread.sleep(2000);

        actions.sendKeys(getElement(By.xpath("//input[@id='autocomplete']")),"Hello").build().perform();

        actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
        //2nd method
        actions.keyDown(Keys.CONTROL);
        actions.sendKeys("c");
        actions.keyUp(Keys.CONTROL).build().perform();

        getElement(By.xpath("//input[@id='name']")).sendKeys(Keys.CONTROL, "v");
        Thread.sleep(2000);



    }
}
