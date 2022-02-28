package com.itfac.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class amazonValidation {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/THENUKA/Documents/chromedriver/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        //goto amazon landing page and test
        driver.get("https://www.amazon.com");
        System.out.println(driver.getTitle());
        String expectedtitle = "Amazon.com. Spend less. Smile more.";
        String actualtitle = driver.getTitle();

        if(expectedtitle.equals(actualtitle))
        {
            System.out.println("test complete");
        }else{
            System.out.println("test failed");
        }

        //search for keyboards and check
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("keyboard");
        driver.findElement(By.id("nav-search-submit-button")).click();

        String expectedurl = "https://www.amazon.com/s?k=keyboard&ref=nb_sb_noss";
        String actualurl = driver.getCurrentUrl();
        System.out.println(driver.getCurrentUrl());
        if(expectedurl.equals(actualurl))
        {
            System.out.println("test complete");
        }else{
            System.out.println("test failed");
        }
        //open menu(all)
        driver.findElement(By.id("nav-hamburger-menu")).click();
         //close menu(all)
        driver.findElement(By.className("hmenu-close-icon")).click();

        //goto amazon signin
        driver.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
        System.out.println(driver.getTitle());
        //loggin
        driver.findElement(By.id("ap_email")).sendKeys("janithherath2@gmail.com");
        driver.findElement(By.id("continue")).click();

        WebDriverWait wait =new WebDriverWait(driver,30);

        driver.findElement(By.name("password")).sendKeys("password");
        driver.findElement(By.className("a-button-input")).click();


        driver.close();
    }
}
