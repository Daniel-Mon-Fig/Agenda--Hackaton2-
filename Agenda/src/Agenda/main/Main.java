package Agenda.main;
 import Agenda.model.Agenda;
 import Agenda.model.AgregarContacto;

 import Agenda.model.BuscarContacto;


public class Main {

    public static void main(String[] args) {

        Agenda agenda = new Agenda();

        AgregarContacto agregar= new AgregarContacto(agenda);


        agregar.add();




        BuscarContacto buscador = new BuscarContacto(agenda);
    }

}
