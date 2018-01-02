package by.htp.mailrutestproject.ta;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import by.htp.mailrutestproject.steps.Steps;



public class RunTest {

	private Steps steps;
	private final String LOGIN = "alex_way_test";
	private final String PASSWORD = "Kogareva1";
	private final String WHO = "sviatlana.zakharenka@gmail.com";
	private final String THEME = "Kogareva Aleksandra test";
	private final String MESSAGE = "Kogareva Aleksandra, my git link https://github.com/Aliaksanndra";

	@BeforeMethod(description = "Init browser")
	public void setUp() {
		steps = new Steps();
		steps.initBrowser();
		
	}

	@Test(description = "Log in and send message")
	public void logIn() {
		steps.login(LOGIN, PASSWORD);
		steps.sendMessage(WHO, MESSAGE, THEME);
	}

	

	@AfterMethod(description = "Stop Browser")
	public void stopBrowser() {
		// steps.closeDriver();
	}

}
