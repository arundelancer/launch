package org.test;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\eclipse-workspace\\BrowserLaunch\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Register.html");
	Thread.sleep(2000);
	WebElement fst = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
	fst.sendKeys("arun");
	WebElement lst = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	lst.sendKeys("kumar");
	WebElement em = driver.findElement(By.xpath("//input[@type='email']"));
	em.sendKeys("arundelancer@gmail.com");
	WebElement phn = driver.findElement(By.xpath("//input[@type='tel']"));
	phn.sendKeys("8248345285");
	WebElement btn = driver.findElement(By.xpath("(//input[@name='radiooptions'])[1]"));
	btn.click();
	WebElement co = driver.findElement(By.id("countries"));
	co.sendKeys("India");
	
	
	JavascriptExecutor j=(JavascriptExecutor)driver;
	WebElement d = driver.findElement(By.id("footer"));
	j.executeScript("argument[0].ScrollIntoview(true)",d);
	WebElement cl = driver.findElement(By.id("submitbtn"));
	j.executeScript("argument[0].click()",cl );
	
}
}
