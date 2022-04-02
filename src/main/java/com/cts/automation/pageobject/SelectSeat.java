package com.cts.automation.pageobject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SelectSeat extends SelectFlight{
	public SelectSeat()
	{
	PageFactory.initElements(driver, this);
	}
	
//	@FindBy(xpath="//a[text()='Selected ']")
//	public WebElement selectedBtn;
	@FindBy(xpath="//input[contains(@id,'fname-pax-0')]")
	public WebElement firstNameTxt;
	@FindBy(xpath="//input[@id='lname-pax-0']")
	public WebElement lastNameTxt;
	@FindBy(xpath="//select[@id='gender-pax-0']")
	public WebElement genderDdn;
	@FindBy(xpath="//input[@name='paxes[ADULT-0][dob]']")
	public WebElement dateTxt;
	@FindBy(xpath="(//a[text()='Select'])[2]")
	public WebElement levelOfSupportBtn;
	@FindBy(xpath="(//img[contains(@src,'img/sm/seat-available.svg')])[2]")
			// "(((//tbody)[3]//tr)[7]//td)[13]//img[contains(@src,'img/sm/seat-available.svg')]")
	public WebElement seatSelect;
	
	@FindBy(xpath="(//a[@class='btn btn-purple btn-block font-bold sm-select-seat-btn'])")
	public WebElement selectSeatBtn;
	
	public  void flightBooking(String firstName,String lastName) throws InterruptedException
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("arguments[0].scrollIntoView();",selectedBtn);
		//selectedBtn.click();
		js.executeScript("arguments[0].scrollIntoView();",firstNameTxt);
		firstNameTxt.click();
		firstNameTxt.sendKeys(firstName);
		lastNameTxt.sendKeys(lastName);
		js.executeScript("arguments[0].scrollIntoView();",levelOfSupportBtn);
		levelOfSupportBtn.click();
		js.executeScript("arguments[0].scrollIntoView();",seatSelect);
		seatSelect.click();
		selectSeatBtn.click();
	
		
	}
	}


