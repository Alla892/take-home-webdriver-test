package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import utils.Driver;


public class LoginPage {

	public LoginPage() {
		PageFactory.initElements(Driver.getDriver(), this);
		}
		

		@FindBy(id="username")
		public WebElement userid;
		
		@FindBy(id="password")
		public WebElement userpassword;
		
		@FindBy(xpath="//button[@type=\"submit\"]/i")
    	public WebElement loginbutton;
		@FindBy(xpath="//h4[contains(text(),'Welcome to the')]")
		public WebElement actualtext;
		@FindBy(xpath="//*[contains(text(),'Your')]")
		public WebElement actualtextforfailcase;
		
		//String expectedtextsuccess = "Welcome to the Secure Area. When you are done click logout below.";
		
		//String actualtextsuccess = Driver.getDriver().findElement(By.xpath("//h4[contains(text(),\"Welcome to the \")]")).getText();
		
		
		
}
