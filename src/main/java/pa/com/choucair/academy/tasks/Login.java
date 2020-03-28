package pa.com.choucair.academy.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import pa.com.choucair.academy.userinterface.ChoucairLoginPage;

public class Login implements Task {
	
	public static Login onThePage() {
		return Tasks.instrumented(Login.class);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(ChoucairLoginPage.LOGIN_BUTTON));
		actor.attemptsTo(Enter.theValue("javilas").into(ChoucairLoginPage.CAMPO_USUARIO));
		actor.attemptsTo(Enter.theValue("PanamaVzla2021").into(ChoucairLoginPage.CAMPO_PASSWORD));
		actor.attemptsTo(Click.on(ChoucairLoginPage.BOTON_LOGIN));
	}

	
	
	
	

}
