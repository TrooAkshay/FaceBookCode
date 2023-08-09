package pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class registerPagepom {
	
	@FindBy (xpath = "//input[@name='firstname']") private WebElement fName; 
    @FindBy (xpath = "//input[@name='lastname']") private WebElement lName;
    @FindBy (xpath = "//input[@name='reg_email__']") private WebElement Email;
    @FindBy (xpath = "//input[@name='reg_email_confirmation__']") private WebElement ReEmail;
    @FindBy (xpath = "//input[@name='reg_passwd__']") private WebElement Password; 
    @FindBy (xpath = "//select[@name='birthday_day']") private WebElement day;
    @FindBy (xpath = "//select[@name='birthday_month']") private WebElement month;
    @FindBy (xpath = "//select[@name='birthday_year']") private WebElement year;
    @FindBy (css = "label[for='u_0_4_Zi']") private WebElement Fgender;
    @FindBy (css = "label[for='u_0_5_HP']") private WebElement Mgender;
    @FindBy (css = "label[for='u_0_6_zk']") private WebElement Cgender;
    @FindBy (xpath = "//button[@type='submit'][@xpath='1']") private WebElement submit;
    
    
    public registerPagepom(WebDriver driver){
    	PageFactory.initElements(driver, this);
    }
    
    
    public void EnterFirstname(String FName) {
    	fName.sendKeys(FName);
    }
    
    public void EnterLastname(String LName) {
    	lName.sendKeys(LName);
    }
       
    public void EnterEmail (String Email1) throws InterruptedException {
    	Email.sendKeys(Email1);
    	Thread.sleep(5000);
    }
    
    public void EnterReEmail (String Email2) {
    	ReEmail.sendKeys(Email2);
    }
    
    public void EnterPassword(String Password1) {
    	Password.sendKeys(Password1);
    }
    
    public void SelectDate(String Date) {
    	Select date = new Select(day);
    	date.deselectByVisibleText(Date);
    	
    }
    
    public void SelectMonth(String Month) {
    	Select Month1 = new Select(month);
    	Month1.selectByVisibleText(Month);
    	
    }
    
    public void SelectYear(String Year) {
    	Select year1 = new Select(year);
    	year1.deselectByVisibleText(Year);
    	
    }
    
      public void ClickFgender() {
    	Fgender.click();
    }
    
      public void ClickMgender() {
      	Mgender.click();
      }
    
      public void ClickCgender() {
      	Cgender.click();
      }

    public void ClickOnSignup () {
    	submit.click();
    }
    
   
}
