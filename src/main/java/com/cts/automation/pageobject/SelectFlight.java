package com.cts.automation.pageobject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class SelectFlight extends FlyusSearch {
	@FindBy(xpath="(//span[text()='Select'])[1]")
	public WebElement selectBtn;
	
	public  void selectFlight() throws InterruptedException
	{
		Thread.sleep(500);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",selectBtn);
		Actions acc=new Actions(driver);
		acc.moveToElement(selectBtn).click();
		selectBtn.click();
}
}
