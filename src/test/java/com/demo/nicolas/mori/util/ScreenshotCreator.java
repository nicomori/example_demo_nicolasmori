package com.demo.nicolas.mori.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotCreator {
	
	public static void createScreenshot(WebDriver driver, String fileName){
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile, new File("Output//"+fileName+".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
