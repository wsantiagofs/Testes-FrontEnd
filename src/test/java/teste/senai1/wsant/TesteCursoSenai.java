package teste.senai1.wsant;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteCursoSenai {
	
	private WebDriver driver;
	
	@Before
	public void ConfigurarTeste() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program FIles\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test
	public void TesteNavegabilidade () {
		driver.get("https://informatica.sp.senai.br/");
		driver.findElement(By.id("Busca1_txtFiltro")).sendKeys("Gestão");
		// driver.findElement(By.id("Busca1_txtFiltro")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("Busca1_btnBusca")).click();
	}
}
