package com.itfac.github;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class githubvalidation {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/THENUKA/Documents/chromedriver/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://github.com/login");
        System.out.println(driver.getTitle());
        String expectedtitle = "Sign in to GitHub · GitHub";
        String actualtitle = driver.getTitle();

        if(expectedtitle.equals(actualtitle))
        {
            System.out.println("test complete");
        }else{
            System.out.println("test failed");
        }

        driver.findElement(By.id("login_field")).sendKeys("thenuka99");
        driver.findElement(By.id("password")).sendKeys("JAnith@2018");
        driver.findElement(By.name("commit")).click();

        WebDriverWait wait =new WebDriverWait(driver,15);
        wait.until(ExpectedConditions.titleIs("GitHub"));

        System.out.println(driver.getTitle());
        expectedtitle = "GitHub";
        actualtitle = driver.getTitle();

        if(expectedtitle.equals(actualtitle))
        {
            System.out.println("test complete");
        }else{
            System.out.println("test failed");
        }
        driver.close();
    }
}
