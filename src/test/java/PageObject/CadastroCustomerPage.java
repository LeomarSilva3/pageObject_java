package PageObject;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import Config.DriverFactory;

public class CadastroCustomerPage extends DriverFactory {

	DriverFactory drivefactorig = new DriverFactory();
	
	public void MudaThema() {
		driver = drivefactorig.getDriver();

		driver.findElement(comboboxSelectVersion).click();
		new Select(driver.findElement(ThemeBootstrapV4)).selectByVisibleText("Bootstrap V4 Theme");
		driver.findElement(ThemeBootstrapV4).click();

	}

	public void visualizaTeladeCadastro() {
		driver.findElement(ButtonAddCustomer).click();
		String URL = driver.getCurrentUrl();
		assertEquals(URL, "https://www.grocerycrud.com/demo/bootstrap_theme_v4/add");
	}

	public void insereInformaçoesCustomer() {
		driver.findElement(NameField).sendKeys("Teste Sicredi");
		driver.findElement(LastNameField).sendKeys("Teste");
		driver.findElement(ContactFirstName).sendKeys("Silva");
		driver.findElement(PhoneField).sendKeys("51 9999-9999");
		driver.findElement(AddressLine1Field).sendKeys("Av Assis Brasil, 3970");
		driver.findElement(AddressLine2Field).sendKeys("Torre D");
		driver.findElement(CityField).sendKeys("Porto Alegre");
		driver.findElement(StateField).sendKeys("RS");
		driver.findElement(PostalCodeField).sendKeys("91000-000");
		driver.findElement(CountryField).sendKeys("Brasil");
		driver.findElement(CreditLimitField).sendKeys("9000");

	}

	public void escolheEmployeer() {
		driver.findElement(comboboxFromEmployeer).click();
		driver.findElement(valueFixter).click();
	}

	public void SaveNovoCustomer() {
		driver.findElement(ButtonSave).click();

	}

	public void visualizaMensagemSucesso() throws IOException{
		
		WebDriverWait wait = new WebDriverWait(driver, 3);
		wait.until(ExpectedConditions.presenceOfElementLocated(MessageSuccessfullyStoredDatabase));
		String mensagem = driver.findElement(MessageSuccessfullyStoredDatabase).getText();		
		assertEquals(mensagem,"Your data has been successfully stored into the database. Edit Customer or Go back to list");

	}

	public void fecharBrowser() {
		driver.close();
	}

}
