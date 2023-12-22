package com.PracticeSelenium.myproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1 {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\satya\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://github.com/login");
		WebElement textaerea = (WebElement) driver.findElements(By.id("login_field"));
		System.out.println("id pass");
		Thread.sleep(2000);
		driver.findElements(By.name("password"));
		System.out.println("name pass");
		Thread.sleep(2000);
		driver.findElements(By.className("class=\"header-logo\""));
		System.out.println("class pass");
		Thread.sleep(2000);
		driver.findElements(By.linkText("Forgot password?"));
		System.out.println("link text pass");
		Thread.sleep(2000);
		driver.findElements(By.partialLinkText("Creat an"));

		System.out.println("prl pass");
		Thread.sleep(2000);
		driver.findElements(By.tagName("h1"));
		System.out.println("tag pass");
		Thread.sleep(2000);
		driver.findElement(By.xpath(null));
		driver.findElement(By.cssSelector(null));
		System.out.println("");

	}

}