package co.com.bancolombia.certificacion.youtube.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class WikiPediaResultadosPage extends PageObject {
	public static final Target WIKIPEDIA_RESULTADOS = Target.the("Resultados Wikipedia")
			//.locatedBy("//*[@id=\"mw-content-text\"]/div[2]/ul/li[1]/div[1]/a");
			.locatedBy("//*[@id=\"mw-content-text\"]/div/ul/li/div/a[@title=\"Mujeres (canción)\"]");
}
