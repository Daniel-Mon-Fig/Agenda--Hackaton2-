package Agenda.model;

import java.util.ArrayList;

public class ListarContacto {

    private Agenda agenda;

    // Listar Contactos
    public void listarContactos(Agenda agenda) {
        this.agenda = agenda;

        // Validar si la agenda está vacía
        if (agenda.getContactos().isEmpty()) {
            System.out.println("La agenda no tiene contactos.");
            return; // Detener programa si no hay datos
        }

        // Lista para ordenar contactos
        ArrayList<Contacto> listaOrdenada = new ArrayList<>(agenda.getContactos());

        // Ordenar alfabéticamente
        listaOrdenada.sort((c1, c2) -> {
            // Comparación de nombres | IgnoreCase -> Ignora mayúsculas y minúsculas
            int comparacion = c1.getNombre().compareToIgnoreCase(c2.getNombre());
            // Para nombres iguales
            if (comparacion == 0) {
                // Comparación de apellidos
                return c1.getApellido().compareToIgnoreCase(c2.getApellido());
            }
            return comparacion;
        });
        for (Contacto c : listaOrdenada) {
            System.out.println(c.getNombre() + " " + c.getApellido() + " - " + c.getNumero());
        }
    }
}
