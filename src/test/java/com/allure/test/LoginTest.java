package com.allure.test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import ru.yandex.qatools.allure.annotations.Stories;

import com.allure.common.Base;
import com.allure.helper.CommonHelper;

public class LoginTest extends Base {

	@Test
	@Stories("google page should opened and should search test")
	public void loginTest(){
		CommonHelper.getUrlandSearch(driver);
		CommonHelper.makeScreenshot(driver);
	}
	
	@AfterTest
	public void kill(){
		driver.quit();
	}
	
}
