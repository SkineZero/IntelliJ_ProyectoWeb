# language: es

Característica: Realizar acciones al momento
  de ingresar a la pagina www.abc.com
  para ingresar datos a elements, widgets y alertas

  @EscenarioSinValor
    Escenario: agregar un nuevo usuario y eliminarlo
    Dado que un usuario accede a la web de elements
    Cuando el usuario ingresa los datos Brayan,Pallares,bp@mail.com,25,150000,QA,Cantrell,07/12/1997,01/01/2003/ 23:30,BrayanPallares a la web
    Entonces el usuario termina su proceso
