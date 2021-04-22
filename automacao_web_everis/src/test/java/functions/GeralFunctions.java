package functions;

import static org.junit.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import gluecode.TestRule;

public class GeralFunctions {
	private WebDriver driver = TestRule.getDriver();
	private static int TEMPO_PADRAO_ESPERA = 30;

	public void esperarElementoAparecer(WebElement elemento) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(TEMPO_PADRAO_ESPERA, TimeUnit.SECONDS);
		elemento.isDisplayed();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		forcarEspera(2000);
	}

	public void selecionarFrame(WebElement elemento) {
		driver.switchTo().frame(elemento);
	}

	public void voltarFramePai() {
		driver.switchTo().parentFrame();
	}
	
	public void esperarTextoEmElemento(WebElement elemento, String texto) throws InterruptedException {
		boolean textoAtualizou = false;
		int cont = 0;
		do {
			forcarEspera(1000);
			if (elemento.getText().equals(texto) || elemento.getAttribute("value").equals(texto) ) {
				textoAtualizou = true;
			}else if (cont == 30) {
				fail("Tempo limite de espera atingido");
			}
			cont++;
		} while (!textoAtualizou);
	}
	
	private void forcarEspera(int tempo) throws InterruptedException {
		Thread.sleep(tempo);
	}
}
