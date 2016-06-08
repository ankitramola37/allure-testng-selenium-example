package com.allure.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
 protected WebDriver driver;
 
 public Base(){
	 driver = new FirefoxDriver();
 }
}
