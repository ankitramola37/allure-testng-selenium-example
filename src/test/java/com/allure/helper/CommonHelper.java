package com.allure.helper;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import ru.yandex.qatools.allure.annotations.Attachment;
import ru.yandex.qatools.allure.annotations.Step;

public class CommonHelper {

	@Step("get url and search")
	public static void getUrlandSearch(WebDriver driver){
		driver.get("https://www.google.co.in");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("lst-ib")).sendKeys("test");
	}
	
	  @Attachment
	   public static byte[] makeScreenshot(WebDriver driver) {
	        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	    }

}
