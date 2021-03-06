package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomeElementsMap {

	@FindBy(xpath = "//*[@id='header']//a/span[5]")
	protected WebElement contador_itens_carrnho;

	@FindBy(xpath = "//*[@id='homefeatured']/li[1]/div/div[1]/div")
	protected WebElement produto;

	@FindBy(xpath = "//*[@id='add_to_cart']/button")
	protected WebElement modal_produto_botao_adicionar_carrinho;

	@FindBy(xpath = "//div/div/iframe")
	protected WebElement frame_modal_produto_adicionar_carrinho;

	@FindBy(xpath = "//*[@id='layer_cart']//div[4]/a")
	protected WebElement modal_produto_adicionado_botao_ir_carrinho;
}
