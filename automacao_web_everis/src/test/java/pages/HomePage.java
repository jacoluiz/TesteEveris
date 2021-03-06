package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import elements.HomeElementsMap;
import functions.GeralFunctions;
import gluecode.TestRule;

public class HomePage extends HomeElementsMap {
	WebDriver driver = TestRule.getDriver();
	GeralFunctions func = new GeralFunctions();

	public void validarPaginaInicial() throws Throwable {
		PageFactory.initElements(driver, this);
	}

	public void adicionarItemCarrinho() throws Throwable {
		produto.click();
		
		func.selecionarFrame(frame_modal_produto_adicionar_carrinho);
		func.esperarElementoAparecer(modal_produto_botao_adicionar_carrinho);
		modal_produto_botao_adicionar_carrinho.click();
		func.voltarFramePai();
	}

	public void navegarAteCarrinho() throws Throwable {
		func.esperarElementoAparecer(modal_produto_adicionado_botao_ir_carrinho);
		modal_produto_adicionado_botao_ir_carrinho.click();
	}
}
