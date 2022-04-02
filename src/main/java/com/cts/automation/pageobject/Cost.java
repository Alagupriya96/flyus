package com.cts.automation.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Cost {
	@FindBy(xpath="(//span[@id='flyus-grand-total'])[2]")
	public WebElement totalCostTxt;
	public void totalCost()
{
		System.out.println("Total Cost" + totalCostTxt);
}
}
