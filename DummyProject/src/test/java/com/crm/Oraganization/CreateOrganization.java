package com.crm.Oraganization;



import java.io.FileInputStream;
import java.util.Properties;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class CreateOrganization {

	@Test
	public void method() throws Throwable  {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		
		FileInputStream fis =new FileInputStream("./data.properties");
		Properties plib =new Properties();
		plib.load(fis);
		String URL=plib.getProperty("url");
		driver.get(URL);	
		System.out.println("organization created");
		System.out.println("good evening");
		System.out.println("jenkins example");
		

	}

}
