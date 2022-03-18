package task;

import interactions.TiempoEspera;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.Scroll;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.DemWidgets.*;


public class DemoWidgets implements Task
{
    protected WebDriver driver;
    // CREAR VARIABLE
    private String fecha;
    private String fecha_hora;

    // CREAR NUESTRO CONSTRUCTOR
    public static DemoWidgets conDescrip(String fecha,String fecha_hora)

    {
        return instrumented(DemoWidgets.class,fecha,fecha_hora);
    }
    //CREAR NUESTRO CONSTRUCTOR
    public DemoWidgets(String fecha, String fecha_hora)
    {
        this.fecha=fecha;
        this.fecha_hora=fecha_hora;
    }

    // METODO QUE HEREDA EL OBJECTO ACTOR DE LA CLASE EJEMPLOSSEMILLEROSTEPS
    @Override
    public <T extends Actor> void performAs (@NotNull T actor)
    {
        // EL ACTOR VA A EJECUTAR UNA TAREA ATTEMPISTO
        actor.attemptsTo(
                // ACCEDE A DATE PICKER
                TiempoEspera.unMomento(1),
                Scroll.to(CLICK_ELEMENTS),
                TiempoEspera.unMomento(1),
                Click.on(CLICK_ELEMENTS),
                Scroll.to(BTN_DATEPICKER),
                TiempoEspera.unMomento(1),
                Click.on(BTN_DATEPICKER),
                TiempoEspera.unMomento(2),
                // INGRESA FECHA
                Click.on(Sel_Date),
                Hit.the(Keys.BACK_SPACE).keyIn(Sel_Date),
                Hit.the(Keys.BACK_SPACE).keyIn(Sel_Date),
                Hit.the(Keys.BACK_SPACE).keyIn(Sel_Date),
                Hit.the(Keys.BACK_SPACE).keyIn(Sel_Date),
                Hit.the(Keys.BACK_SPACE).keyIn(Sel_Date),
                Hit.the(Keys.BACK_SPACE).keyIn(Sel_Date),
                Hit.the(Keys.BACK_SPACE).keyIn(Sel_Date),
                Hit.the(Keys.BACK_SPACE).keyIn(Sel_Date),
                Hit.the(Keys.BACK_SPACE).keyIn(Sel_Date),
                Hit.the(Keys.BACK_SPACE).keyIn(Sel_Date),
                Enter.theValue(fecha).into(Sel_Date),
                TiempoEspera.unMomento(2),
                Hit.the(Keys.ENTER).into(Sel_Date),
                TiempoEspera.unMomento(2),
                Hit.the(Keys.BACK_SPACE).keyIn(Seld_DateAndTime),
                Hit.the(Keys.BACK_SPACE).keyIn(Seld_DateAndTime),
                Hit.the(Keys.BACK_SPACE).keyIn(Seld_DateAndTime),
                Hit.the(Keys.BACK_SPACE).keyIn(Seld_DateAndTime),
                Hit.the(Keys.BACK_SPACE).keyIn(Seld_DateAndTime),
                Hit.the(Keys.BACK_SPACE).keyIn(Seld_DateAndTime),
                Hit.the(Keys.BACK_SPACE).keyIn(Seld_DateAndTime),
                Hit.the(Keys.BACK_SPACE).keyIn(Seld_DateAndTime),
                Hit.the(Keys.BACK_SPACE).keyIn(Seld_DateAndTime),
                Hit.the(Keys.BACK_SPACE).keyIn(Seld_DateAndTime),
                Hit.the(Keys.BACK_SPACE).keyIn(Seld_DateAndTime),
                Hit.the(Keys.BACK_SPACE).keyIn(Seld_DateAndTime),
                Hit.the(Keys.BACK_SPACE).keyIn(Seld_DateAndTime),
                Hit.the(Keys.BACK_SPACE).keyIn(Seld_DateAndTime),
                Hit.the(Keys.BACK_SPACE).keyIn(Seld_DateAndTime),
                Hit.the(Keys.BACK_SPACE).keyIn(Seld_DateAndTime),
                Hit.the(Keys.BACK_SPACE).keyIn(Seld_DateAndTime),
                Hit.the(Keys.BACK_SPACE).keyIn(Seld_DateAndTime),
                Hit.the(Keys.BACK_SPACE).keyIn(Seld_DateAndTime),
                Hit.the(Keys.BACK_SPACE).keyIn(Seld_DateAndTime),
                Hit.the(Keys.BACK_SPACE).keyIn(Seld_DateAndTime),
                Hit.the(Keys.BACK_SPACE).keyIn(Seld_DateAndTime),
                Hit.the(Keys.BACK_SPACE).keyIn(Seld_DateAndTime),
                Enter.theValue(fecha_hora).into(Seld_DateAndTime),
                Hit.the(Keys.ENTER).into(Seld_DateAndTime),
                TiempoEspera.unMomento(4));
    }
    public static DemoWidgets botones (String fecha, String fecha_hora)
    {
        return instrumented(DemoWidgets.class,fecha,fecha_hora);
    }
}
