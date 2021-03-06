package pages;

import static org.junit.Assert.fail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import elements.CarrinhoElementsMap;
import functions.GeralFunctions;
import gluecode.TestRule;

public class CarrinhoPage extends CarrinhoElementsMap {
	WebDriver driver = TestRule.getDriver();
	GeralFunctions func = new GeralFunctions();

	public void validarValoresDoCarrinho() throws Throwable {
		PageFactory.initElements(driver, this);
		validarValores();
		
//		validações extras
		botao_mais_produto.click();
		func.esperarTextoEmElemento(input_quantidade_produto, "2");
		validarValores();
	}
	
	private void validarValores() {
		if (!valor_total_produto.getText().equals(valor_total_carrinho.getText())) {
			fail("Valor do produto não coincide com valor total do carrinho");
		}
	}
}
