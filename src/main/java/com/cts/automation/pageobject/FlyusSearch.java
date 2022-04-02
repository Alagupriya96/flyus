package com.cts.automation.pageobject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.cts.automation.baseclass.BaseClass;

public class FlyusSearch extends BaseClass{
	public FlyusSearch()
	{
	PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@placeholder='From']")
	public WebElement fromTxt;
	@FindBy(xpath="//input[@placeholder='To']")
	public WebElement toTxt;

	@FindBy(xpath="//button[text()='Search']")
	public WebElement searchBtn;
	@FindBy(xpath="//button[@class='close pos-abt m-t-n-md m-r-n-md ng-scope']")
	public WebElement closePopupBtn;
	public void flightSearching(String from,String to)
	{
		fromTxt.sendKeys(from);
		toTxt.sendKeys(to);
		
		searchBtn.click();
		closePopupBtn.click();
		
}

}
