package Agenda.model;

import java.util.Scanner;

public class AgregarContacto {

    //instanciamos
    private Agenda agenda = new Agenda();

    //Constructor
    public AgregarContacto(Agenda agenda) {
        this.agenda = agenda;
    }

    //Metodo para pedir  datos al usuario
    public void add() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Apellido: ");
        String apellido = sc.nextLine();

        System.out.print("Teléfono: ");
        String numero = sc.nextLine();

        //se crea el contacto
        Contacto nuevo = new Contacto(nombre, apellido, numero);

        //guardar contacto en la agenda
        agenda.AgregarContacto(nuevo);

        System.out.println("El contacto se guardó correctamente");

    }
}