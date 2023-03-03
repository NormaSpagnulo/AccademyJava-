package TESTSETTIMANA3;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Libro> elenco;

    public Biblioteca() {
        elenco = new ArrayList<>();
    }

    public void aggiunta(Libro libro) {
        if (!elenco.contains(libro)) {
            elenco.add(libro);
        }

    }

    public void rimozione(String titolo) {
        
        Libro libro = trova(titolo);
        if (libro == null) {
            System.out.println("Il libro " + titolo + " non è presente");
        } else {
            elenco.remove(libro);
            System.out.println("Il libro " + titolo + " è stato rimosso correttamente");
        }
        MainBiblioteca.menu_m();
    }

    public Libro trova(String titolo) {
        for (Libro libro : elenco) {
            if (libro.getTitolo().equals(titolo)) {
                return libro;
            }
        }
        return null;
    }

    public void prestaL(String titolo) {
        
        for (Libro libro : elenco) {
            if (libro.getTitolo().equals(titolo)) {
                if (libro.getNumCopie() > 0) {
                    libro.setNumCopie(libro.getNumCopie() - 1);
                    libro.setNumCopieInPrestito(libro.getNumCopieInPrestito() + 1);
                    System.out.println("Il libro " + titolo + " è stato prestato con successo.");
                    MainBiblioteca.menu_m();
                } else {
                    System.out.println("Non ci sono copie disponibili per il libro " + titolo + ".");
                    MainBiblioteca.menu_m();
                }
            }
        }
        System.out.println("Il libro " + titolo + " non è disponibile");
        
        
    }

    public void restituisci(String titolo) {
        
        for (Libro libro : elenco) {
            if (libro.getTitolo().equals(titolo)) {
                if (libro.getNumCopieInPrestito() > 0) {
                    libro.setNumCopie(libro.getNumCopie() + 1);
                    libro.setNumCopieInPrestito(libro.getNumCopieInPrestito() - 1);
                    System.out.println("Il libro " + titolo + " è stato restituito con successo.");
                    return;
                } else {
                    System.out.println(
                            "Il libro selezionato " + titolo + ", non è stato preso in prestito.");
                    return;
                }
            }
        }
        System.out.println("Il libro " + titolo + " non è disponibile nella biblioteca.");
        MainBiblioteca.menu_m();
    }

    public void stampaDisponibilita() {
        
        if (elenco.isEmpty()) {
            System.out.println("Non ci sono libri disponibili nella biblioteca.");
        } else {
            System.out.println("Elenco libri disponibili:");
            for (Libro libro : elenco) {
                System.out.println(libro.getTitolo() + " - copie disponibili: " + libro.getNumCopie());
            }
        }
        MainBiblioteca.menu_m();
    }
}