package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Add_Casual_Booking
{
    public static void main(String[] args) throws InterruptedException
    {
        //Open Browser
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://id.stage.kidsxap.com.au/Account/Login");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        // Find the Username and Enter Value
        driver.findElement(By.id("txtUserName")).sendKeys("stage.chirag01@yopmail.com");
        Thread.sleep(2000);
        // Find the Password and Enter Passsword value
        driver.findElement(By.id("txtPassword")).sendKeys("Admin@123");
        Thread.sleep(2000);
        // Find the Login button and click on it
        driver.findElement(By.id("btnLogin")).click();
        Thread.sleep(10000);

        //Open Main Menu Slider
        driver.findElement(By.xpath("//span[@class='action-icon stroke white']//*[name()='svg']")).click();
        Thread.sleep(800);

        //Open Booking & Attendance
        driver.findElement(By.xpath("//a[@id='lnkBooking']")).click();
        Thread.sleep(5000);

        //Goto Booking TAB (//div[normalize-space()='Bookings'])[1]
        driver.findElement(By.xpath("(//div[normalize-space()='Bookings'])[1]")).click();
        Thread.sleep(2000);

        //Add Booking Button
        driver.findElement(By.xpath("//a[@title='Add Booking']")).click();
        Thread.sleep(1000);

        //Select Centre dropdown & Add value on it
        driver.findElement(By.xpath("(//input[@role='combobox'])[2]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//div[contains(text(),'Centre-D')])[1]")).click();
        Thread.sleep(800);

        // Add Child + Search Child + Add Child
        driver.findElement(By.xpath("(//input[@role='combobox'])[3]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//input[@role='combobox'])[3]")).clear();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//input[@role='combobox'])[3]")).sendKeys("Child 1 (Family-01)");
        Thread.sleep(1500);
        driver.findElement(By.xpath("//div[@title='Child 1 (Family-01)']")).click();
        Thread.sleep(1000);

        // Add Care Type
        driver.findElement(By.xpath("//dx-select-box[@id='ddlCreateBookingsCareType']//input[@role='combobox']")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("//div[contains(text(),'OSHC')]")).click();
        Thread.sleep(1500);

        // Add Arrangement Type & Add Value on Arrangement type dropdown
        driver.findElement(By.xpath("//dx-select-box[@id='ddlCreateBookingsArrangementType']//input[@role='combobox']")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("//div[contains(text(),'NoGov')]")).click();
        Thread.sleep(5000);

        //Booking Type
        //driver.findElement(By.xpath("(//div[@id='dx-e847eaaf-0a37-2fb5-c8d5-2d09fb608a4b'])[1]")).click();
        //Thread.sleep(1500);

        //Booking Date
        driver.findElement(By.xpath("//dx-date-box[@id='dtCreateCasualBookingDate_0']//input[@role='combobox']")).sendKeys("27/02/2023");
        Thread.sleep(2000);

        //Page Scroll With TAB
        WebElement var1 = driver.findElement(By.xpath("//dx-date-box[@id='dtCreateCasualBookingDate_0']//input[@role='combobox']"));
        var1.sendKeys(Keys.TAB);
        Thread.sleep(2000);

        //Add Room
        driver.findElement(By.xpath("(//input[@role='combobox'])[8]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[contains(text(),'Room D')]")).click();
        Thread.sleep(800);

        //Add Session and add value
        driver.findElement(By.xpath("(//input[@role='combobox'])[9]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[contains(text(),'D2')]")).click();
        Thread.sleep(1000);

        //Click on Save Button
        driver.findElement(By.xpath("//span[normalize-space()='Save']")).click();

    }
}
