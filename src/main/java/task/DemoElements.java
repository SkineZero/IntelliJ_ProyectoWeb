package task;

import interactions.TiempoEspera;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import org.jetbrains.annotations.NotNull;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.DemElements.*;

public class DemoElements implements Task
{
    // CREAR VARIABLE
    private  String nombre;
    private  String apellido;
    private  String correo;
    private  String edad;
    private  String salario;
    private  String departamentodt;
    private  String usuariodel;

    public static DemoElements conDescripcion(
            String nombre,
            String apellido,
            String correo,
            String edad,
            String salario,
            String departamentodt,
            String usuariodel)
    {
        return instrumented(DemoElements.class,nombre,apellido,correo,edad,salario,departamentodt,usuariodel);
    }
    //CREAR NUESTRO CONSTRUCTOR
    public DemoElements(
            String nombre,
            String apellido,
            String correo,
            String edad,
            String salario,
            String departamentodt,
            String usuariodel)
    {
        this.nombre=nombre;
        this.apellido=apellido;
        this.correo=correo;
        this.edad=edad;
        this.salario=salario;
        this.departamentodt=departamentodt;
        this.usuariodel=usuariodel;
    }
    //METODO QUE HEREDA AL OBJETO ACTOR DE LA CLASE EJEMPLOSEMILLEROSTEPS
    @Override
    public <T extends Actor> void performAs(@NotNull T actor)
    {
                // EL ACTOR VA A EJECUTAR UNA TAREA ATTEMPISTO
                actor.attemptsTo(
                        // BUSCA EL BOTON ELEMENTS Y WEB TABLES
                        TiempoEspera.unMomento(3),
                        Scroll.to(CLICK_ELEMENTS), // BAJA HASTA ENCONTRAR ELEMENTS
                        Click.on(CLICK_ELEMENTS),  // SELECCIONA ELEMENTS}
                        TiempoEspera.unMomento(1),
                        Scroll.to(SELECCIONAR_WEBTABLES),
                        Click.on(SELECCIONAR_WEBTABLES), // SELECCIONA WEB TABLES

                        // INGRESA EL NUEVO REGISTRO
                        TiempoEspera.unMomento(2),
                        Click.on(BOTON_AGREGAR),
                        TiempoEspera.unMomento(1),
                        Enter.theValue(nombre).into(CasillaFirstName), //RECIBIR UN VALOR, DILIGENCIA CAMPO BUSQUEDA
                        Enter.theValue(apellido).into(CasillaLastName),
                        Enter.theValue(correo).into(CasillaEmail),
                        Enter.theValue(edad).into(CasillaAge),
                        Enter.theValue(salario).into(CasillaSalary),
                        Enter.theValue(departamentodt).into(CasillaDepartament),
                        TiempoEspera.unMomento(2),
                        Click.on(BTN_SUBMIT),
                        TiempoEspera.unMomento(1),

                        // ELIMINAR USUARIO
                        TiempoEspera.unMomento(1),
                        Enter.theValue(usuariodel).into(CASILLA_BUSCAR),
                        TiempoEspera.unMomento(1),
                        Click.on(ELIMINAR_REGISTRO));
    }
}
