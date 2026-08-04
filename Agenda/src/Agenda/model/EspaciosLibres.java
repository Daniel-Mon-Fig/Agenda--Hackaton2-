package Agenda.model;

public class EspaciosLibres {

    private Agenda agenda;

    public EspaciosLibres(Agenda agenda) {
        this.agenda = agenda;
    }

    public void mostrarTamanoAgenda() {
        int cantidad = agenda.getContactos().size();
        System.out.println("Tienes " + cantidad + " contactos en la agenda.");
    }
}
