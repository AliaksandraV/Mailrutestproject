package by.htp.mailrutestproject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.DownAction;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class MainPage extends AbstractPage {	

	private final String BASE_URL = "https://www.mail.ru";
	private WebElement element;
	
	@FindBy(id = "mailbox:login")
	private WebElement loginPole;
		
	@FindBy(id="mailbox:password")
	private WebElement passwordPole;
	
	@FindBy(id="mailbox:submit")
	private WebElement submitLoginButtom;
	
	@FindBy(css=".b-toolbar__group_left > div:nth-child(1)")
	private WebElement newMessageButtom;
	
	@FindBy(css="textarea.js-input:nth-child(6)")
	private WebElement poleWho;
	
	@FindBy(css=".compose-head__row_nohr > div:nth-child(2) > div:nth-child(1) > input:nth-child(1)")
	private WebElement poleTheme;	
	
	@FindBy(css="span.mce_bold")
	private WebElement poleText;
	
	@FindBy(css="div.b-toolbar__item_:nth-child(1) > div:nth-child(1)")
	private WebElement sendButtom;
	
	public void logIn(String login, String password){
		loginPole.sendKeys(login);		
		passwordPole.sendKeys(password);
		submitLoginButtom.click();		
	}
	
	
	public void newMessage(String who, String message, String theme){
		newMessageButtom.click();		
		poleWho.sendKeys(who);
		poleTheme.sendKeys(theme);
		poleText.click();
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}		
		poleText.sendKeys(message);	
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
		sendButtom.click();
	}
	
	
	
	
	
	
	public MainPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(this.driver, this);
	}
	

	@Override
	public void openPage() {
		driver.navigate().to(BASE_URL);
	}

}
