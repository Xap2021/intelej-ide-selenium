package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login
{
    public static void main(String[] args) throws InterruptedException
    {
        WebDriver driver = new ChromeDriver();
        System.setProperty("WebDriver.Chrome.driver", "\"C:\\chromedriver.exe\"");
        driver.get("https://id.stage.kidsxap.com.au/Account/Login");
        driver.manage().window().maximize();

        // Find the Username and Enter Value
        driver.findElement(By.id("txtUserName")).sendKeys("stage.chirag01@yopmail.com");
        Thread.sleep(50);
        // Find the Password and Enter Passsword value
        driver.findElement(By.id("txtPassword")).sendKeys("Admin@123");
        Thread.sleep(50);

        // Find the Login button and click on it
        // driver.findElement(By.xpath("")).click();
        // driver.findElement(By.xpath("")).sendKeys("");
        driver.findElement(By.id("btnLogin")).click();
        Thread.sleep(9999);

        //Open Main Menu Slider
        driver.findElement(By.xpath("//span[@class='action-icon stroke white']//*[name()='svg']")).click();
        Thread.sleep(200);

        //Open Family from main menu slider
        driver.findElement(By.id("lnkFamilies")).click();
        Thread.sleep(200);


    }
}
