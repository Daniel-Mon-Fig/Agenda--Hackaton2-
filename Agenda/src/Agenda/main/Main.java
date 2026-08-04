package Agenda.main;
 import Agenda.model.*;

 import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Agenda agenda = new Agenda();

        int opc;

        do {
            System.out.println("=========== AGENDA DE CONTACTOS ===============");
            System.out.println("1. Añadir contacto");
            System.out.println("2. Buscar un contacto");
            System.out.println("3. Eliminar un contacto");
            System.out.println("4. Modificar contacto");
            System.out.println("5. Mostrar todos los contactos");
            System.out.println("6. Salir ");
            System.out.print("Selecciona una opción: ");
            opc = sc.nextInt();

            switch (opc) {
                case 1:
                    AgregarContacto agregar= new AgregarContacto(agenda);
                    agregar.add();

                    break;
                case 2:
                    System.out.println("========= BUSCAR CONTACTO ============");
                    System.out.println("Escribe el nombre del contacto que quieres buscar:");
                    sc.nextLine();
                    String nombreBuscado = sc.nextLine();

                    BuscarContacto buscador = new BuscarContacto(agenda);
                    buscador.buscarContacto(nombreBuscado);
                    break;
                case 3:
                    EliminarContacto eliminar = new EliminarContacto(agenda);
                    eliminar.eliminarContacto();
                    break;
                case 4:
                    System.out.println("========= MODIFICAR CONTACTO ============");
                    System.out.println("Escribe el nobre de la persona a la que quieres modificar \n");
                    String buscarNombre = sc.nextLine();
                    System.out.println("Escribe el apellido de la persona  \n");
                    String apellidoBuscado = sc.nextLine();
                    System.out.println("¿Qué es lo que quieres modificar?");
                    System.out.println("1. Numero");
                    System.out.println("2. Apellido");
                    System.out.println("3. Nombre");
                     int opcModificar = sc.nextInt();

                     switch (opcModificar){
                         case 1:
                             System.out.println("Nuevo número: \n");
                             String nuevoNum = sc.nextLine();
                             boolean modificar = agenda.modificarNumero(buscarNombre, apellidoBuscado, nuevoNum);
                             if(modificar){
                                 System.out.println("El número se modifico de manera exitosa");
                             }else {
                                 System.out.println("El contacto no existe");
                             }
                             break;
                         case 2:
                             System.out.println("Nuevo apellido: \n");
                             String nuevoApellido = sc.nextLine();
                             boolean modificar2 = agenda.modificarApellido(buscarNombre, apellidoBuscado, nuevoApellido);
                             if(modificar2){
                                 System.out.println("El apellido se modifico de manera exitosa");
                             }else {
                                 System.out.println("El contacto no existe");
                             }
                             break;
                         case 3:
                             break;
                         case 4:
                             break;
                         default:
                             System.out.println("opción no valida");
                     }
                    break;
                case 5:
                    EspaciosLibres tamano= new EspaciosLibres(agenda);
                    tamano.mostrarTamanoAgenda();
                    ListarContacto listarContacto = new ListarContacto();
                    listarContacto.listarContactos(agenda);

                    break;
                case 6:
                    break;
                default:
                    System.out.println("Elige una opción valida");
                    break;
            }
        }while (opc != 6) ;

    }


}
