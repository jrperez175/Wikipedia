package co.com.bancolombia.certificacion.youtube.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.wikipedia.org/")
public class WikiPediaHomePage extends PageObject{
	public static final Target WIKIPEDIA_CAMPO_DE_BUSQUEDA = Target.the("Wikipedia Campo de Busqueda")
			.located(By.id("searchInput"));
	public static final Target WIKIPEDIA_BOTON_BUSCAR = Target.the("Wikipedia Botn Busqueda")
			.locatedBy("//*[@id=\"search-form\"]/fieldset/button");

}
