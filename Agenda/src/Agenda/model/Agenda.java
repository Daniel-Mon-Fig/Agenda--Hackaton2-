package Agenda.model;

import java.util.ArrayList;

public class Agenda {

    private ArrayList<Contacto> contactos = new ArrayList<>();

    public void buscarContacto(String nombreBuscado) {
        boolean encontrado = false;

        // Recorremos cada 'contacto' dentro de la lista 'contactos'
        for (Contacto contacto : contactos) {
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

