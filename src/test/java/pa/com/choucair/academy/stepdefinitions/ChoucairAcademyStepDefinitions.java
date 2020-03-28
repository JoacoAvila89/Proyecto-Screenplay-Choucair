package pa.com.choucair.academy.stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import pa.com.choucair.academy.questions.Answer;
import pa.com.choucair.academy.tasks.Login;
import pa.com.choucair.academy.tasks.OpenUp;
import pa.com.choucair.academy.tasks.Search;

public class ChoucairAcademyStepDefinitions {
	
	@Before
	public void setStage() {
		OnStage.setTheStage(new OnlineCast());
	}
	
	@Dado("^que Joaquin quiere aprender automatizacion de pruebas en la academia choucair$")
	public void queJoaquinQuiereAprenderAutomatizacionDePruebasEnLaAcademiaChoucair()  {
		OnStage.theActorCalled("Joaquin").wasAbleTo(OpenUp.thePage(), (Login.onThePage()));
	}

	@Cuando("^el busca el curso de (.*) en la plataforma academia de choucair$")
	public void elBuscaElCursoDeRecursoAutomatizaciónBancolombiaEnLaPlataformaAcademiaDeChoucair(String course)  {
	    OnStage.theActorInTheSpotlight().attemptsTo(Search.the(course));
	}

	@Entonces("^el encuentra el curso llamado (.*)$")
	public void elEncuentraElCursoLlamadoRecursosAutomatizaciónDeBancolombia(String question) {
	   OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
	}

}
