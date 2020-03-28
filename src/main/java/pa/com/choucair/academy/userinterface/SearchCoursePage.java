package pa.com.choucair.academy.userinterface;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class SearchCoursePage extends PageObject {
	public static final Target BUTTON_OPC_UC = Target.the("Seleciona opción Universidad Choucair").located(By.xpath("//strong[contains(text(),'Universidad')]"));
	public static final Target INPUT_NAME_COURSE = Target.the("Ingresar nombre del curso").located(By.id("coursesearchbox"));
	public static final Target BUTTON_GO = Target.the("Buscar el Curso").located(By.xpath("//button[@class='btn btn-secondary']"));
	public static final Target SELECT_COURSE = Target.the("Buscar el Curso").located(By.xpath("//h4[contains( text(),'Recursos Automatización Bancolombia')]"));
	public static final Target NAME_COURSE = Target.the("Nombre del Curso").located(By.xpath("//h1[contains(text(),'Recursos Automatización Bancolombia')]"));
	
	
	
	
}
