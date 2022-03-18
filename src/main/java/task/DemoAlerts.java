package task;

import interactions.TiempoEspera;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import org.openqa.selenium.Alert;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.DemAlerts.*;

public class DemoAlerts implements Task
{
    // CREAR VARIABLE
    private String nombre2;
    //CREAR NUESTRO CONSTRUCTOR
    public DemoAlerts(String nombre2)
    {
        this.nombre2=nombre2;
    }
    // METODO QUE HEREDA EL OBJECTO ACTOR DE LA CLASE EJEMPLOSSEMILLEROSTEPS
    @Override
    public <T extends Actor> void performAs (T actor)
    {
        // EL ACTOR VA A EJECUTAR UNA TAREA ATTEMPISTO
        actor.attemptsTo(
                // ACCEDE A ALERTAS
                Scroll.to(CLICKFRAME),
                TiempoEspera.unMomento(1),
                Click.on(CLICKFRAME),
                Scroll.to(CLICKALERTS),
                TiempoEspera.unMomento(1),
                Click.on(CLICKALERTS),
                TiempoEspera.unMomento(1),

                // CLICK1
                Click.on(BTN_1),
                TiempoEspera.unMomento(1));
                BrowseTheWeb.as(actor).getDriver().switchTo().alert().dismiss();

        // EL ACTOR VA A EJECUTAR UNA TAREA ATTEMPISTO
        actor.attemptsTo(
                // CLICK2
                TiempoEspera.unMomento(1),
                Click.on(BTN_2),
                TiempoEspera.unMomento(7));
                BrowseTheWeb.as(actor).getDriver().switchTo().alert().dismiss();

        // EL ACTOR VA A EJECUTAR UNA TAREA ATTEMPISTO
        actor.attemptsTo(
                // CLICK3 CANCELAR
                TiempoEspera.unMomento(1),
                Click.on(BTN_3),
                TiempoEspera.unMomento(1));
                BrowseTheWeb.as(actor).getDriver().switchTo().alert().dismiss();

        // EL ACTOR VA A EJECUTAR UNA TAREA ATTEMPISTO
        actor.attemptsTo(
                // CLICK3 ACEPTAR
                TiempoEspera.unMomento(1),
                Click.on(BTN_3),
                TiempoEspera.unMomento(1));
        BrowseTheWeb.as(actor).getDriver().switchTo().alert().accept();

        // EL ACTOR VA A EJECUTAR UNA TAREA ATTEMPISTO
        Alert alert;
        actor.attemptsTo(
                // CLICK4
                TiempoEspera.unMomento(1),
                Click.on(BTN_4),
                TiempoEspera.unMomento(1));
                alert = BrowseTheWeb.as(actor).getDriver().switchTo().alert();
                alert.sendKeys(nombre2);
                BrowseTheWeb.as(actor).getDriver().switchTo().alert().accept();

        actor.attemptsTo(

                TiempoEspera.unMomento(3));
    }
    // CREAR NUESTRO CONSTRUCTOR
    public static DemoAlerts conDescrip(String nombre2)
    {
        return instrumented(DemoAlerts.class,nombre2);
    }
}
