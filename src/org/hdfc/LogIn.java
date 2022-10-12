package org.hdfc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogIn {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\HDFCPORTAL\\DRIVERR\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
          driver.get("https://netbanking.hdfcbank.com/netbanking/");
         driver.switchTo().frame(0);
          
       WebElement txtusername= driver.findElement(By.xpath("//input[@type='text']"));
       txtusername.sendKeys("169034967");
       driver.findElement(By.xpath("//a[@class='btn btn-primary login-btn']")).click();
       
          
          
          
          
          
	}
	
	
	

}
