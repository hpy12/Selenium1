package PageLayerPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayerPackage.BaseClass;

public class CreateAccountClass extends BaseClass {
	@FindBy(name="givenName")
	WebElement name; 
	
	@FindBy(name="sn")
	WebElement lastname;
	
	@FindBy(name="title")
	WebElement Jobtitle;
	
	@FindBy(name="webidUserEnteredCompany")
	WebElement Ccompany;
	
	@FindBy(name="l")
	WebElement city;
	
	public CreateAccountClass()
	{
		PageFactory.initElements(driver,this);
	}
	
	public void createAccountfunctionality(String Name,String Lname,String jobtitle,String Company,String CTY)
	{
		name.sendKeys(Name);
		lastname.sendKeys(Lname);
		Jobtitle.sendKeys(jobtitle);
		Ccompany.sendKeys(Company);
		city.sendKeys(CTY);
		
		
		
	}

}
