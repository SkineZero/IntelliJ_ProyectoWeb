package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://demoqa.com/")
public class DemElements extends PageObject
{

    private static String targetElementName;

    // BUSCA EL BOTON ELEMENTS Y WEB TABLES
    public static final Target CLICK_ELEMENTS =
            Target.the("SELECCIONAR ELEMENTS")
                    .located(By.xpath("//h5[normalize-space()='Elements']"));

    public static final Target SELECCIONAR_WEBTABLES =
            Target.the("SELECCIONAR WEB TABLES")
                    .located(By.xpath("//span[contains(text(),'Web Tables')]"));

    // INGRESA UN NUEVO REGISTRO
    public static final Target BOTON_AGREGAR=
            Target.the("DAR CLICK EN EL BOTON AGREGAR")
                    .locatedBy("#addNewRecordButton");

    public static final Target CasillaFirstName=
            Target.the("SELECCIONAR LA CASILLA DE NOMBRE")
                    .locatedBy("#firstName");

    public static final Target CasillaLastName=
            Target.the("SELECCIONAR LA CASILLA DE APELLIDO")
                    .locatedBy("#lastName");

    public static final Target CasillaEmail=
            Target.the("SELECCIONAR LA CASILLA DE CORREO")
                    .locatedBy("#userEmail");

    public static final Target CasillaAge=
            Target.the("SELECCIONAR LA CASILLA DE EDAD")
                    .locatedBy("#age");

    public static final Target CasillaSalary=
            Target.the("SELECCIONAR LA CASILLA DE SALARIO")
                    .locatedBy("#salary");

    public static final Target CasillaDepartament=
            Target.the("SELECCIONAR LA CASILLA DE AREA DE TRABAJO")
                    .locatedBy("#department");

    public static final Target BTN_SUBMIT=
            Target.the("CLICK EN SUBMIT")
                    .locatedBy("#submit");

    // BOTONES OPCIONALES
    public static final Target CASILLA_BUSCAR=
        Target.the("CLICK EN CASILLA BUSCAR PARA LA VERIFICACION")
        .located(By.xpath("//input[@id='searchBox']"));

    public static final Target ELIMINAR_REGISTRO=
        Target.the("ELIMINARA UN USUARIO")
        .located(By.xpath("//*[name()='path' and contains(@d,'M864 256H7')]"));
}
