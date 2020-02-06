package TestAutomationRunner;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Test;
import PageObject.RemoverCustomerPage;

public class RemoveCustomerValidation extends RemoverCustomerPage{
	
	RemoverCustomerPage customerlist = new RemoverCustomerPage();
	
	@Test
	public void RemoverCustomer() throws AWTException, IOException, InterruptedException {
		customerlist.inserirNovoUsuario();
		customerlist.pesquisarNovoCustomer();
		customerlist.clicarNoBotaoRemover();
		customerlist.VerificarMesagemAlertaModalDelete();
		customerlist.RemoverNovoCustomer();
    	customerlist.verificarMensagemRemocaoComSucesso();
		
	}
	
	
	@After
	public void CloseBrowser() throws InterruptedException {
		customerlist.fecharBrowser();
	}

}
