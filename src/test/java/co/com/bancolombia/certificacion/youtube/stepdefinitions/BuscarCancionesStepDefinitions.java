package co.com.bancolombia.certificacion.youtube.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import static org.hamcrest.CoreMatchers.is;
import static net.serenitybdd.screenplay.GivenWhenThen.*;

import co.com.bancolombia.certificacion.youtube.questions.Nombre;
import co.com.bancolombia.certificacion.youtube.tasks.BuscarCancion;
import co.com.bancolombia.certificacion.youtube.userinterfaces.WikiPediaHomePage;

public class BuscarCancionesStepDefinitions {
	
	private WikiPediaHomePage youtubehomepage;
	
	@Before
	public void preparaEscenario() {
		OnStage.setTheStage(new OnlineCast()); //prepara el escenario actor y driver
	}
	
	@Dado("^que (.*) quiere buscar canciones$")
	public void queElActorQuiereBuscarCanciones(String nombreActor) {
	    theActorCalled(nombreActor).wasAbleTo(Open.browserOn(youtubehomepage)); //crea el actor y abre la pagina
	}

	@Cuando("^el ingresa la (.*)$")
	public void elIngresaLaCancion(String cancion)  {
	    theActorInTheSpotlight().attemptsTo(BuscarCancion.conElNombre(cancion)); //retorna la instancia del actor previamente creado
	    //theActorInTheSpotlight().
	}

	@Entonces("^se debe visualizar el (.*) en el listado de busqueda$")
	public void seDebeVisulizarLaCancionEnElListadoDeBusqueda(String resultado) {
	    theActorInTheSpotlight().should(seeThat(Nombre.cancion(),is(resultado)));
	}


}
