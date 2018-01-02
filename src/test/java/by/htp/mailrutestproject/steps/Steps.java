package by.htp.mailrutestproject.steps;

import org.openqa.selenium.WebDriver;

import by.htp.mailrutestproject.driver.DriverSingleton;
import by.htp.mailrutestproject.pages.MainPage;



public class Steps {

	private WebDriver driver;
	private MainPage mainPage;
	

	public void initBrowser() {
		driver = DriverSingleton.getDriver();
	}

	public void closeDriver() {
		DriverSingleton.closeDriver();
	}

	public void login(String login, String password) {
		mainPage = new MainPage(driver);
		mainPage.openPage();
		mainPage.logIn(login, password);
	}

	public void sendMessage(String who, String message, String theme) {		
		mainPage.newMessage(who, message, theme);
	}

	public void CompareCheckOutDate() {
		//ResultPage resultPage = new ResultPage(driver);
		// resultPage.CompareDates();
	}

	public void ComparePrice() {
//		ResultPage resultPage = new ResultPage(driver);
//		resultPage.ChangeCarrency();
//		resultPage.ChoosePriceRange();

	}

}
