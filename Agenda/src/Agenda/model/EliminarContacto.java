package Agenda.model;
import java.util.Scanner;

public class EliminarContacto {
    private Agenda agenda;
    public EliminarContacto(Agenda agenda) {
        this.agenda = agenda;
    }

    public void eliminarContacto() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Número del contacto a eliminar: ");
        String numeroBuscado = sc.nextLine();

        for (int i = 0; i < agenda.getContactos().size(); i++) {

            if (agenda.getContactos().get(i).getNumero().equalsIgnoreCase(numeroBuscado)) {

                agenda.getContactos().remove(i);

                System.out.println("Contacto eliminado.");
                return;
            }
        }

        System.out.println("Contacto no encontrado.");
    }

}
