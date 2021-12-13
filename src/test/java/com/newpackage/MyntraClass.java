package com.newpackage;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyntraClass {

	public void testCase() {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.findElement(By.xpath("//*[@class=\"desktop-navLink\"]/a")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Phone Cases')]")).click();
	}

	public static void main(String[] args) {
		new MyntraClass().testCase();
	}

}
