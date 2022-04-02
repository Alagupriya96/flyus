package com.cts.automation.stepdef;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

import com.cts.automation.baseclass.BaseClass;
import com.cts.automation.pageobject.Cost;
import com.cts.automation.pageobject.FlyusSearch;
import com.cts.automation.pageobject.SelectFlight;
import com.cts.automation.pageobject.SelectSeat;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class StepDefs  extends BaseClass{

	@Given("User enters {string}, {string}")
	public void user_enters_source_destination_daterange_and_selecttraveller(String from,String to) {
		launchChrome();
		driver.get("https://www.flyus.com/");
		
		FlyusSearch search=new FlyusSearch();
		search.flightSearching(from, to);
	}

	@When("user select the flight and click search")
	public void user_select_the_flight_and_click_search() throws InterruptedException {
		
		SelectFlight seat=new SelectFlight();
		seat.selectFlight();
	}

	@When("Users entersbelow passenger info")
	public  void users_entersbelow_passenger_info(DataTable dataTable) throws InterruptedException {
		
		List<Map<String,String>> allValue=dataTable.asMaps(String.class, String.class);
		String firstName1,lastName1;
		for(int i=0;i<allValue.size();i++)
		{
			 firstName1=allValue.get(i).get("FirstName");
			 lastName1=allValue.get(i).get("LastName");
		    System.out.println(firstName1);
			System.out.println(lastName1);
			SelectSeat seat=new SelectSeat();
		seat.flightBooking(firstName1, lastName1);
		}
	
	}
	@Then("Search should be sucessfull.")
	public void search_should_be_sucessfull(DataTable dataTable) {
		Cost total=new Cost();
		total.totalCost();
	}


}
