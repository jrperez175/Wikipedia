package co.com.bancolombia.certificacion.youtube.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import static co.com.bancolombia.certificacion.youtube.userinterfaces.WikiPediaHomePage.*;

public class BuscarCancion implements Task {
	private final String cancionABuscar; //final no deja cambiar el valor asigando
	
	public BuscarCancion(String cancion) {
		cancionABuscar=cancion;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(cancionABuscar).into(WIKIPEDIA_CAMPO_DE_BUSQUEDA),
						Click.on(WIKIPEDIA_BOTON_BUSCAR));
		
	}
	
	public static BuscarCancion conElNombre(String cancion) {
		return instrumented(BuscarCancion.class, cancion); //crea una instacia de la clase , evita colocar el new en los steps
	}



}
