package Agenda.main;
 import Agenda.model.Agenda;
 import Agenda.model.AgregarContacto;
 import Agenda.model.ListarContacto;
 import Agenda.model.BuscarContacto;



 import Agenda.model.EliminarContacto;


public class Main {

    public static void main(String[] args) {

        Agenda agenda = new Agenda();

        AgregarContacto agregar= new AgregarContacto(agenda);
        ListarContacto listarContacto = new ListarContacto();
        BuscarContacto buscador = new BuscarContacto(agenda);

        listarContacto.listarContactos(agenda);

        agregar.add();


        EliminarContacto eliminar = new EliminarContacto(agenda);

        eliminar.eliminarContacto();




}
