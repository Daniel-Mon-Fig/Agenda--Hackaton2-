package Agenda.model;

import java.util.ArrayList;

public class Agenda {

    public ArrayList<Contacto> contactos = new ArrayList<>();


    public void AgregarContacto(Contacto nuevo) {
        contactos.add(nuevo);
    }
}
