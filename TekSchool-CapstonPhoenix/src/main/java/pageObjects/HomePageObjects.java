package pageObjects;


import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import core.Base;

public class HomePageObjects extends Base {

	public HomePageObjects() {
		PageFactory.initElements(driver, this);
	}

	// locators
	@FindBy(xpath = "//*[@id='form-currency']/div/button/span")
	private WebElement CurrencyTab;

	@FindBy(xpath = "//*[@id='form-currency']/div/ul/li[1]/button")
	private WebElement EuroCurrencyTab;
//2nd scenario
	@FindBy(xpath = "//*[@id='top-links']/ul/li[4]/a/span")
	private WebElement ShoppingCartTab;
	
	@FindBy(xpath = "//*[@id=\'content\']/p")
	private WebElement EmtyCartMessage;
	//Methods
	public void clickOnCurrencyTab() {
		if (CurrencyTab.isDisplayed()) {
			CurrencyTab.click();
			logger.info("Clicked on 'Currency' tab.");
		} else {
			logger.error("'Currency' tab was not dispayed.");
		}
}
	public void clickOnEuroCurrencyTab() {
	if (EuroCurrencyTab.isDisplayed()) {
		EuroCurrencyTab.click();
		logger.info("Clicked on 'Euro Currency Tab' menu.");
	} else 
		logger.error("'Euro Currency Tab' was not displayed.");
	}
	//2nd methods
	public void clickOnShoppingCartTab() {
		if (ShoppingCartTab.isDisplayed()) {
			ShoppingCartTab.click();
			logger.info("Clicked on 'Currency' tab.");
		} else 
		
			logger.error("'Currency' tab was not dispayed.");
	}
			public void clickOnEmtyShoppingCartMessage() {
				if (EmtyCartMessage.isDisplayed()) {
					
					logger.info("Clicked on 'Currency' tab.");
				} else {
					logger.error("'Currency' tab was not dispayed.");
				
				}				}
}
