public class EspaciosLibres {

    private Agenda agenda;

    public EspaciosLibres(Agenda agenda) {
        this.agenda = agenda;
    }


    public boolean agendaLlena() {
        boolean llena = agenda.getContactos().size() >= agenda.getTamanoMaximo();

        if (llena) {
            System.out.println("La agenda está llena. No hay espacio disponible para nuevos contactos.");
        }
        return llena;
    }


    public int espaciosLibres() {
        int libres = agenda.getTamanoMaximo() - agenda.getContactos().size();

        System.out.println("Espacios libres: " + libres + " de " + agenda.getTamanoMaximo());
        return libres;
    }
}