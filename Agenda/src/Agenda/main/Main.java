package Agenda.main;
 import Agenda.model.Agenda;
 import Agenda.model.AgregarContacto;
 import Agenda.model.ListarContacto;

public class Main {

    public static void main(String[] args) {

        Agenda agenda = new Agenda();

        AgregarContacto agregar= new AgregarContacto(agenda);
        ListarContacto listarContacto = new ListarContacto();

        listarContacto.listarContactos(agenda);

       agregar.add();listarContacto.listarContactos(agenda);
    }

}
