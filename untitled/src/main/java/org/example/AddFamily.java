package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddFamily {
    public static void main(String[] args) throws InterruptedException {
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
        Thread.sleep(20000);

        //Open Main Menu Slider
        driver.findElement(By.xpath("//span[@class='action-icon stroke white']//*[name()='svg']")).click();
        Thread.sleep(800);

        //Open Family from main menu slider
        driver.findElement(By.id("lnkFamilies")).click();
        Thread.sleep(20000);

        //Click on Add Family
        driver.findElement(By.id("btnFamilySearchAdd")).click();
        Thread.sleep(2000);

        /*
        WebElement driver1 = driver.findElement(By.id("ddlCentre"));
        Thread.sleep(1000);
        Select Final = new Select(driver1);
        Thread.sleep(1000);
        Final.selectByIndex(1);
        Thread.sleep(1000);
        */

        //Click on centre dropbox
        driver.findElement(By.id("ddlCentre")).click();
        Thread.sleep(3000);

        //Add Value on Centre dropdown
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]")).click();
        Thread.sleep(3000);

        // Guardian First Name
        driver.findElement(By.xpath("//dx-text-box[@id='txtAddFamilyFirstName']//input[@role='textbox']")).sendKeys("Harry");
        Thread.sleep(3000);

        // Guardian Last Name
        driver.findElement(By.xpath("//dx-text-box[@id='txtAddFamilyLastName']//input[@role='textbox']")).sendKeys("Ozas");
        Thread.sleep(2000);

        //Add Guardian DOB
        driver.findElement(By.xpath("//dx-date-box[@id='dtAddFamilyDOB']//input[@role='combobox']")).sendKeys("26/12/1988");
        Thread.sleep(2000);

        //Add Email ID
        driver.findElement(By.xpath("//dx-text-box[@id='txtAddFamilyEmail']//input[@role='textbox']")).sendKeys("jk@gmail.com");
        Thread.sleep(2000);

        //Add Mobile
        driver.findElement(By.xpath("//dx-text-box[@id='txtHeadOfficeMobileNumber']//input[@role='textbox']")).sendKeys("0419191919");
        Thread.sleep(2000);

        //Add Street Address
        driver.findElement(By.xpath("//dx-text-box[@id='txtStreetAddress_family']//input[@role='textbox']")).sendKeys("585 La Trobe Street");
        Thread.sleep(2500);

        //Add Suburb
        driver.findElement(By.xpath("//input[@aria-autocomplete='inline']")).sendKeys("Melbourne");
        Thread.sleep(2500);

        //Add State
        driver.findElement(By.xpath("//dx-select-box[@id='ddlState_family']//input[@role='combobox']")).click();
        Thread.sleep(2500);

        //Add Value in Stage
        driver.findElement(By.xpath("//div[contains(text(),'VIC')]")).click();
        Thread.sleep(2000);

        //Add Postal Code
        driver.findElement(By.xpath("//dx-text-box[@id='txtPostcode_family']//input[@role='textbox']")).sendKeys("3000");
        Thread.sleep(2000);

        //Child First Name Add
        driver.findElement(By.xpath("//dx-text-box[@id='txtAddFamilyChildFirstName']//input[@role='textbox']")).sendKeys("Ron");
        Thread.sleep(2000);

        //Child Last Name Add
        driver.findElement(By.xpath("//dx-text-box[@id='txtAddFamilyChildLastName']//input[@role='textbox']")).sendKeys("Cube");
        Thread.sleep(2000);

        //Page Scroll
        WebElement inputField = driver.findElement(By.xpath("//dx-text-box[@id='txtAddFamilyChildLastName']//input[@role='textbox']"));
        inputField.sendKeys(Keys.TAB);

        

    }
}












