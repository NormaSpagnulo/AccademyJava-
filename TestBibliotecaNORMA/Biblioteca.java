package TestBibliotecaNORMA;
import java.util.Scanner;

import java.util.ArrayList;

public class Biblioteca {
    public ArrayList<Libro> elenco;

    // costruttore Biblioteca
    public Biblioteca() {
        elenco = new ArrayList<>();

    }
    public void aggiuntam(Libro libro) {
        if (!elenco.contains(libro)) {
            elenco.add(libro);
        }
    }

    //metodo che permette l'aggiunta di un nuovo libro
    public void aggiunta(Libro libro) {
        if (!elenco.contains(libro)) {
            elenco.add(libro);
            System.out.println("Il libro è stato aggiunto con successo!\n");
        }
    }
    // metodo che permette la rimozione di un libro già esistente
    public void rimozione(String titolo) {
        Libro libro = trovaLibro(titolo);
        if (libro == null) {
            System.out.println("Il libro " + titolo + " non è presente nella biblioteca.");
        } else {
            elenco.remove(libro);
            System.out.println("Il libro " + titolo + " è stato rimosso dalla biblioteca.");
        }
    }

    //metodo che permette di trovare un libro presente nell'elenco dei libri
    public Libro trovaLibro(String titolo) {
        for (Libro libro : elenco) {
            if (libro.getTitolo().equals(titolo)) {
                return libro;
            }
        }
        return null;
    }

    /*metodo che permette di prestare un libro all'utente 
    con il decremento dell'attuale indice del libro*/
    public void prestaL(String titolo) {
        for (Libro libro : elenco) {
            if (libro.getTitolo().equals(titolo)) {
                if (libro.getnumCopie() > 0) {
                    libro.setnumCopie(libro.getnumCopie() - 1);
                    libro.setNumCopieInPrestito(libro.getNumCopieInPrestito() + 1);
                    System.out.println("Il libro " + titolo + " è stato prestato con successo.");
                    return;
                } else {
                    System.out.println("Non ci sono copie disponibili per il libro " + titolo + ".");
                    return;
                }
            }
        }
        System.out.println("Il libro " + titolo + " non è disponibile nella biblioteca.");
    }

    /*metodo che permette di restituire un libro alla biblioteca 
    con l'incremento del nuovo indice del libro*/
    public void restituisci(String titolo) {
        for (Libro libro : elenco) {
            if (libro.getTitolo().equals(titolo)) {
                if (libro.getNumCopieInPrestito() > 0) {
                    libro.setnumCopie(libro.getnumCopie() + 1);
                    libro.setNumCopieInPrestito(libro.getNumCopieInPrestito() - 1);
                    System.out.println("Il libro " + titolo + " è stato restituito con successo.");
                    return;
                } else {
                    System.out.println(
                            "Non è possibile restituire il libro " + titolo + ", non è stato preso in prestito.");
                    return;
                }
            }
        }
        System.out.println("Il libro " + titolo + " non è disponibile nella biblioteca.");
    }

   //metodo che stampa l'elenco dei libri con annessa disponibilità
    public void stampaDisponibilità() {
        if (elenco.isEmpty()) {
            System.out.println("Non ci sono libri disponibili nella biblioteca.");
        } else {
            System.out.println("Elenco libri disponibili:");
            for (Libro libro : elenco) {
                System.out.println(libro.getTitolo() + " - copie disponibili: " + libro.getnumCopie());
            }
        }
        MainBiblioteca.main(null);
    }
    public void stampaDisponibilità1() {
        if (elenco.isEmpty()) {
            System.out.println("Non ci sono libri disponibili nella biblioteca.");
        } else {
            System.out.println("Elenco libri disponibili:");
            for (Libro libro : elenco) {
                System.out.println(libro.getTitolo() + " - copie disponibili: " + libro.getnumCopie());
            }
  }
}

}
