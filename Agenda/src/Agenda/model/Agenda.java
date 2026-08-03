package Agenda.model;

import java.util.ArrayList;

public class Agenda {

    private ArrayList<Contacto> contactos = new ArrayList<>();



    //METODOS PARA MODIFICAR CONTACTO

    //1. MODIFICAR NUMERO
    //hacemos el metodo booleano porque va a regresar la banderita de false o true
    public boolean modificarNumero(String nombre, String apellido, int numeroCambiado){
        for (Contacto c : contactos) { //Este es un for-each. Porque no le vamos a pedir un index al usuario, le vamos a pedir el nombre
            if (c.getNombre().equalsIgnoreCase(nombre) && c.getApellido().equalsIgnoreCase(apellido)) {
                // Cambiamos el numero con el metodo setter
                c.setNumero(numeroCambiado);
                return true;
            }
        }
        return false;
    }
    //2. MODIFICAR APELLIDO
    public boolean modificarApellido(String nombre, String apellido, String apellidoCambiado){
        for (Contacto c : contactos){
            if (c.getNombre().equalsIgnoreCase(nombre) && c.getApellido().equalsIgnoreCase(apellido)){
                c.setApellido(apellidoCambiado);
                return true;
            }
        }
        return false;
    }

    //3. MODIFICAR NOMBRE
    public boolean modificarNombre(String nombre, String apellido, String nombreCambiado){
        for (Contacto c : contactos){
            if (c.getNombre().equalsIgnoreCase(nombre) && c.getApellido().equalsIgnoreCase(apellido)){
                c.setNombre(nombreCambiado);
                return true;
            }
        }
        return false;
    }



    //NOTA: Se pudo haber modificado los tres atributos en el mismo metodo pero el usuario tendría que escribir todo de nuevo
}
