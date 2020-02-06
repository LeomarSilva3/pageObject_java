package PageObject;
import PageObject.CadastroCustomerPage;
import static org.junit.Assert.assertEquals;
import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import Config.DriverFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RemoverCustomerPage extends CadastroCustomerPage {
	
	DriverFactory  drivefactorig = new DriverFactory();
	CadastroCustomerPage cadastro = new CadastroCustomerPage();
	
	public void inserirNovoUsuario()  throws IOException{
	    cadastro.MudaThema();
	    cadastro.visualizaTeladeCadastro();
		driver.findElement(NameField).sendKeys("Teste Sicred2");
		driver.findElement(LastNameField).sendKeys("Teste");
		driver.findElement(ContactFirstName).sendKeys("Barbosa");
		driver.findElement(PhoneField).sendKeys("51 9999-9999");
		driver.findElement(AddressLine1Field).sendKeys("Av Assis Argentina, 3970");
		driver.findElement(AddressLine2Field).sendKeys("Torre H");
		driver.findElement(CityField).sendKeys("Porto Alegre");
		driver.findElement(StateField).sendKeys("RS");
		driver.findElement(PostalCodeField).sendKeys("91000-000");
		driver.findElement(CountryField).sendKeys("Brasil");
		driver.findElement(CreditLimitField).sendKeys("10000");
	    cadastro.escolheEmployeer();
	    driver.findElement(ButtonGoBackToList).click();
	   
	   
	}

	public void pesquisarNovoCustomer() throws AWTException {
		WebDriverWait wait = new WebDriverWait(driver, 3);
		wait.until(ExpectedConditions.presenceOfElementLocated(IconSerch));
		driver.findElement(IconSerch).click();
		driver.findElement(SerachField).sendKeys("Teste Sicred2");
		Utils.keyEnter();
		wait.until(ExpectedConditions.elementToBeClickable(CheckboxCustomer));
		driver.findElement(CheckboxCustomer).click();
	}
	
	public  void clicarNoBotaoRemover() {
		driver.findElement(ButtonDelete).click();
	}
	
	
	public void VerificarMesagemAlertaModalDelete()  {
		String messagemalerta = driver.findElement(MessageModalDelete).getText();
		assertEquals(messagemalerta, "Are you sure that you want to delete this 1 item?");
	
	}
	
	public void RemoverNovoCustomer() throws InterruptedException {
	    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(ButtonModalConfirmDelete).click();
	}
	
	public  void verificarMensagemRemocaoComSucesso() throws IOException {
		WebDriverWait wait = new WebDriverWait(driver, 3);
		wait.until(ExpectedConditions.visibilityOfElementLocated(MessageSuccesfullyRemovedCustomer));
	    String Message = driver.findElement(MessageSuccesfullyRemovedCustomer).getText();
		assertEquals(Message, "Your data has been successfully deleted from the database.");
			
	}
	
   

}
