package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser
{
    public static void main(String[] args) throws InterruptedException
    {
        WebDriver driver = new ChromeDriver();
        System.setProperty("WebDriver.Chrome.driver", "\"C:\\chromedriver.exe\"");
        driver.get("https://id.stage.kidsxap.com.au/Account/Login");
        driver.manage().window().maximize();
    }
}
