package co.com.bancolombia.certificacion.youtube.questions;


import static co.com.bancolombia.certificacion.youtube.userinterfaces.WikiPediaResultadosPage.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;

@Subject("El nombre de la cancion ") //como se desea que aparezca en el reporte

public class Nombre implements Question<String>{

	public static Nombre cancion() {
		return new Nombre();
	}

	@Override
	public String answeredBy(Actor actor) {
		
		return WIKIPEDIA_RESULTADOS.resolveFor(actor).getText();
	}

}
