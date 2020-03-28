package pa.com.choucair.academy.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ChoucairLoginPage extends PageObject {
	
	public static final Target LOGIN_BUTTON = Target.the("Boton para poder ingresar credenciales de usaurio").located(By.xpath("//strong[contains(text(),'Ingresar')]"));
	public static final Target CAMPO_USUARIO = Target.the("Campo para ingresar usuario").located(By.id("username"));
	public static final Target CAMPO_PASSWORD = Target.the("Campo para ingresar password").located(By.id("password"));
	public static final Target BOTON_LOGIN = Target.the("El boton para ingresar a la plataforma").located(By.xpath("//button[@class='btn btn-primary']"));

}
