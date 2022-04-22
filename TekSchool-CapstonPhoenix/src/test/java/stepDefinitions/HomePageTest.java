package stepDefinitions;

import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePageObjects;






public class HomePageTest extends Base {
	
	HomePageObjects homePageObjects;
	
	
   

   @When("^User click on Currency$")
    public void user_click_on_currency() throws Throwable {
        homePageObjects = new HomePageObjects();
        homePageObjects.clickOnCurrencyTab();
    }

   

    @And("^User Chose Euro from dropdown$")
    public void user_chose_euro_from_dropdown() throws Throwable {
    	 homePageObjects = new HomePageObjects();
         homePageObjects.clickOnEuroCurrencyTab();
    }
    @Then("^Currency value should change to Euro$")
    public void currency_value_should_change_to_euro() throws Throwable {
    	logger.info("Currency changed to Euro");
    }
    @When("^User click on shopping cart$")
    public void user_click_on_shopping_cart() throws Throwable {
    	homePageObjects = new HomePageObjects();
        homePageObjects.clickOnShoppingCartTab();
    }

    @Then("^\"([^\"]*)\" message should display$")
    public void something_message_should_display(String strArg1) throws Throwable {
    	homePageObjects = new HomePageObjects();
        homePageObjects.clickOnEmtyShoppingCartMessage();
    }
    
}
