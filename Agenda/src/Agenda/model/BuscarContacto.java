package Agenda.model;

public class BuscarContacto
{
    //Buscar Contactos

    private Agenda agenda;

    public BuscarContacto(Agenda agenda){
        this.agenda = agenda;
    }

    public void buscarContacto(String nombreBuscado) {
        boolean encontrado = false;

        // Recorremos cada 'contacto' dentro de la lista 'contactos'
        for (Contacto contacto : agenda.getContactos()) {
            // Evaluando la condición
            if (contacto.getNombre().equalsIgnoreCase(nombreBuscado)) {
                System.out.println("Contacto encontrado: " + contacto.getNombre() + " " + contacto.getApellido() + " - " + contacto.getNumero());
                encontrado = true;
                break; // Ya lo encontramos, rompemos el ciclo
            }
        }
        //Si no lo encuentra, que imprima:
        if (!encontrado) {
            System.out.println("Contacto no encontrado.");
        }
    }
}
