package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CarrinhoElementsMap {

	@FindBy(xpath = "//*[@id='total_product_price_1_1_0']")
	protected WebElement valor_total_produto;
	
	@FindBy (xpath = "//*[@id='total_product']")
	protected WebElement valor_total_carrinho;
	
	@FindBy(xpath = "//*[@id='cart_quantity_up_1_1_0_0']/span")
	protected WebElement botao_mais_produto;
	
	@FindBy(xpath = "//*[@id='product_1_1_0_0']/td[5]/input[2]")
	protected WebElement input_quantidade_produto;
}
