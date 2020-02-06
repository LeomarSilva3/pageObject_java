package TestAutomationRunner;

import java.io.IOException;

import org.junit.After;
import org.junit.Test;


import PageObject.CadastroCustomerPage;

public class CadastroCustomerValidation extends CadastroCustomerPage {
	
	CadastroCustomerPage cadastrocustomerform = new CadastroCustomerPage();
	
	
	@Test
	public  void CadastrarNovoCustomer() throws IOException {
		 cadastrocustomerform.MudaThema();
		 cadastrocustomerform.visualizaTeladeCadastro();
		 cadastrocustomerform.insereInformaçoesCustomer();
		 cadastrocustomerform.escolheEmployeer();
		 cadastrocustomerform.SaveNovoCustomer();;
		 cadastrocustomerform.visualizaMensagemSucesso();
	}
	
	@After
	public void CloseBrowser() {
		cadastrocustomerform.fecharBrowser();
	}
  
}
