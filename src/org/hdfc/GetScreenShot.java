package org.hdfc;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetScreenShot {

	public static void main(String[] args) throws Exception  {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\HDFCPORTAL\\DRIVERR\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
          driver.get("https://www.facebook.com/");
       WebElement username=driver.findElement(By.id("email"));
       username.sendKeys("8056112757");
		WebElement password=driver.findElement(By.id("pass"));
		password.sendKeys("roshini2020");
		TakesScreenshot ts=(TakesScreenshot)driver;
       	File source=	ts.getScreenshotAs(OutputType.FILE);
       	File dest=new File("D:\\srini.png");
       	FileUtils.copyFile(source, dest);
       	driver.quit();
       	
       	
       	
       	
		
	}}	
		
