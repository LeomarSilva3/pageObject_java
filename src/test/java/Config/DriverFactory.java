package Config;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DriverFactory implements IConstants {
 
	public static WebDriver driver;
	
	
/* Locators Customer Form*/
	
	public By comboboxSelectVersion = By.id("switch-version-select");
	public By ThemeBootstrapV4 = By.id("switch-version-select");
	public By ButtonAddCustomer = By.linkText("Add Customer");
	public By NameField = By.id("field-customerName");
	public By LastNameField = By.id("field-contactLastName");
	public By ContactFirstName = By.id("field-contactFirstName");
	public By PhoneField = By.id("field-phone");
	public By AddressLine1Field = By.id("field-addressLine1");
	public By AddressLine2Field = By.id("field-addressLine2");
	public By CityField = By.id("field-city");
	public By StateField = By.id("field-state");
	public By PostalCodeField = By.id("field-postalCode");
	public By CountryField = By.id("field-country");
	public By CreditLimitField = By.id("field-creditLimit");
	public By comboboxFromEmployeer = By.xpath("//div[@id='field_salesRepEmployeeNumber_chosen']/a/span");
	public By valueFixter = By.xpath("//div[@id='field_salesRepEmployeeNumber_chosen']/div/ul/li[8]");
	public By ButtonSave = By.cssSelector("button[id=form-button-save]");
	public By ButtonGoBackToList = By.cssSelector("button[id=save-and-go-back-button]");
	public By MessageSuccessfullyStoredDatabase = By.cssSelector("div[id=report-success] p");
	
	/*Locators Lista Customer*/
	public By IconSerch = By.cssSelector(".el-search");
	public By SerachField = By.name("search");
	public By CheckboxCustomer = By.cssSelector("table thead tr.filter-row td.no-border-right div input[class=select-all-none]");
	public By ButtonDelete = By.cssSelector("span[class=text-danger]");
	public By ButtonModalConfirmDelete = By.xpath("/html/body/div[2]/div[2]/div[3]/div/div/div[3]/button[2]");
	public By MessageSuccesfullyRemovedCustomer = By.xpath("//span[3]/p");
    public By MessageModalDelete = By.cssSelector("p[class=alert-delete-multiple-one]");

    /*Executa a instância do ChromeDriver Abrindo o navegador e inserindo a url*/
    
	public WebDriver getDriver(){
		System.setProperty("webdriver.chrome.driver",  CHROME_DRIVER );
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.grocerycrud.com/demo/bootstrap_theme");
		
		return driver;
	}
	 
	 
}