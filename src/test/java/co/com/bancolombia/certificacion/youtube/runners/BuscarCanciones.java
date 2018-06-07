package co.com.bancolombia.certificacion.youtube.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = {"src/test/resources/features/buscar_canciones.feature"},
				glue = {"co.com.bancolombia.certificacion.youtube.stepdefinitions"},
				snippets = SnippetType.CAMELCASE
		)
public class BuscarCanciones {

}
