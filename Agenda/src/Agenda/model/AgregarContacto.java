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

        if (agenda.existeContacto(nombre, apellido)) {
            System.out.println("Ya existe un contacto con ese nombre y apellido. No se puede duplicar.");
            return; // salimos sin guardar
        }
            String numero;
            while (true) {
                System.out.print("Teléfono: ");
                numero = sc.nextLine();

                // Validación: solo números y longitud 10
                if (numero.matches("\\d{10}")) {
                    break; // válido, salimos del ciclo
                } else {
                    System.out.println("Número inválido. Debe contener exactamente 10 dígitos numéricos.");
                }
            }

            //se crea el contacto
            Contacto nuevo = new Contacto(nombre, apellido, numero);

            //guardar contacto en la agenda
            agenda.AgregarContacto(nuevo);

            System.out.println("El contacto se guardó correctamente");


    }
}