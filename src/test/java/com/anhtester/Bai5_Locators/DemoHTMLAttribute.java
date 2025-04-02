package com.anhtester.Bai5_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.openqa.selenium.By.id;

public class DemoHTMLAttribute {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Locator HTML Attribute");

        WebDriver driver;
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://crm.anhtester.com/admin/authentication");

        driver.findElement(By.id("email")).sendKeys("admin@example.com");

        ///driver.findElement(By.name("password")).sendKeys("123456");

        WebElement inputEmail = driver.findElement(By.name("password"));
        inputEmail.sendKeys("123456");

        ///driver.findElement(By.linkText("Forgot Password?")).click();

        //driver.findElement(By.partialLinkText("Password?")).click();

        //driver.findElement(By.tagName("button")).click();

        driver.findElement(By.className("btn-block")).click();

        Thread.sleep(4000);
        driver.quit();
    }
}
