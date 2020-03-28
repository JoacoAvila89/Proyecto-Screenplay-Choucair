package pa.com.choucair.academy.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import pa.com.choucair.academy.userinterface.ChoucairAcademyPage;


public class OpenUp implements Task {
	
	private ChoucairAcademyPage choucairAcademyPage;
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(choucairAcademyPage));
	}

	public static OpenUp thePage() {
		return Tasks.instrumented(OpenUp.class);
	}

	

}
