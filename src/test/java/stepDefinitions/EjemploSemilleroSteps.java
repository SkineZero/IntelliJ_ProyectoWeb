package stepDefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import task.DemoAlerts;
import task.DemoElements;
import task.DemoWidgets;
import userinterfaces.DemElements;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static userinterfaces.DemAlerts.*;

public class EjemploSemilleroSteps {

    @Managed(driver = "chrome")
    // CREAR VARIABLES DE NAVEGADOR Y ACTOR
    private WebDriver driver;
    private Actor actor=Actor.named("Global");
    //INSTANCIAR LA CLASE HOMEPAGE
    private DemElements demElements=new DemElements();


    @Dado("que un usuario accede a la web de elements")
    public void queUnUsuarioAccedeALaWebDeDemoQA()
    {
        //INDICANDO AL ACTOR QUE PUEDE ACCEDER A UN NAVEGADOR
        driver.manage().window().maximize();
        actor.can(BrowseTheWeb.with(driver));
        //EL ACTOR FUE CAPAZ DE ABRIR
        actor.wasAbleTo(Open.browserOn((PageObject) demElements));
    }

    @Cuando("^el usuario ingresa los datos (.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*),(.*) a la web$")
    public void elUsuarioIngresaNombreALaWeb(
            String nombre,
            String apellido,
            String correo,
            String edad,
            String salario,
            String departamentodt,
            String usuariodel,
            String fechas,
            String fecha_hora,
            String nombre2)

    {
        // EL ACTOR ES CAPAZ DE HACER WASABLETO Y ENVIAMOS LOS PARAMETROS AL METODO
        actor.wasAbleTo(
              DemoElements.conDescripcion(nombre,apellido,correo,edad,salario,departamentodt,usuariodel),
           DemoWidgets.botones(fechas,fecha_hora),
        DemoAlerts.conDescrip(nombre2));

    }

    @Entonces("el usuario termina su proceso")
    public void elusuarioTerminaSuProceso()
    {
        actor.should(seeThat(the(VERIFICAR),isPresent()));
    }
}
