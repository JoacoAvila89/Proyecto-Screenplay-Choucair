package pa.com.choucair.academy.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import pa.com.choucair.academy.userinterface.SearchCoursePage;

public class Search implements Task {
	private String course;
	
	public Search(String course) {
		this.course = course;
	}
	
	public static Search the(String course) {
		return Tasks.instrumented(Search.class,course);
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(SearchCoursePage.BUTTON_OPC_UC));
		actor.attemptsTo(Enter.theValue(course).into(SearchCoursePage.INPUT_NAME_COURSE));
		actor.attemptsTo(Click.on(SearchCoursePage.BUTTON_GO));
		actor.attemptsTo(Click.on(SearchCoursePage.SELECT_COURSE));
		
	}

	

	
	

}
