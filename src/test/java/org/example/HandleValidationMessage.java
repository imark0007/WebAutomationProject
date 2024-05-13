package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandleValidationMessage  extends  BrowserSetup{


        @Test
        public  void testValidationMessage() throws InterruptedException {
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://automationexercise.com/login");
            driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys("");
            driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("");
            driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

            Thread.sleep(3000);


            String emailFiled = driver.findElement(By.xpath("//input[@data-qa='login-email']")).getAttribute("validationMessage");
            System.out.println(emailFiled);
            String passwordField= driver.findElement(By.xpath("//input[@placeholder='Password']")).getAttribute("validationMessage");
            System.out.println(passwordField);



            driver.quit();
        }

}
