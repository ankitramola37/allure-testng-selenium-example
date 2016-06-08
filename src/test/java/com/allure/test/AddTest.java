package com.allure.test;

import junit.framework.Assert;

import org.testng.annotations.Test;

import ru.yandex.qatools.allure.annotations.Stories;

public class AddTest {

	@Test
	@Stories("User should be able to add 2 postive numbers")
	public void addPositivenumbers(){
		Assert.assertEquals("Added result is wrong", 10, 5+5);
	}
	
	@Test
	@Stories("user should be able to multiple two numbers")
	public void multiplyTwoNumbers(){
		Assert.assertEquals("multiplication result is wrong", 10, 5*1);
	}
}
