package Agenda.model;

import java.util.Scanner;

public class MenuEspaciosLibres {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Agenda agenda = crearAgenda(sc);
        EspaciosLibres espaciosLibres = new EspaciosLibres(agenda);
 
        int opcion;
        do {
            mostrarMenu();
            opcion = leerOpcion(sc);
 
            switch (opcion) {
                case 1 -> anadirContactoDePrueba(sc, agenda, espaciosLibres);
                case 2 -> espaciosLibres.espaciosLibres();
                case 3 -> espaciosLibres.agendaLlena();
                case 0 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción no válida.");
            }
        } while (opcion != 0);
 
        sc.close();
    }
}