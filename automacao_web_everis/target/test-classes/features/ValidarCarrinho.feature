Feature: Validar carrinho
	Verifica se o valor dos produtos adicionados no carrinho correspondem com o valor total

  Scenario: Validar valor de produtos no carrinho
    Given usuario esta na pagina inicial
    When adicionar um item no carrinho
    And navegar ate a pagina do carrinho
    Then os valores do produto e total em produtos devem coincidir