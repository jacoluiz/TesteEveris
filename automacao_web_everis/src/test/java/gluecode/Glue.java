package gluecode;

import cucumber.api.java.en.*;
import pages.CarrinhoPage;
import pages.HomePage;

public class Glue {
	HomePage homePage = new HomePage();
	CarrinhoPage carrinhoPage = new CarrinhoPage();

	@Given("^usuario esta na pagina inicial$")
	public void validarPaginaInicial() throws Throwable {
		homePage.validarPaginaInicial();
	}

	@When("^adicionar um item no carrinho$")
	public void adicionarItemCarrinho() throws Throwable {
		homePage.adicionarItemCarrinho();
	}

	@When("^navegar ate a pagina do carrinho$")
	public void navegarAteCarrinho() throws Throwable {
		homePage.navegarAteCarrinho();
	}

	@Then("^os valores do produto e total em produtos devem coincidir$")
	public void validarValoresDoCarrinho() throws Throwable {
		carrinhoPage.validarValoresDoCarrinho();
	}
}