package TESTSETTIMANA3;
import java.util.Scanner;

public class MainBiblioteca {

    public static void main(String[] args) {
        // BIBLIOTECA
        menu_m();
    }

    public static void menu_m() {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.aggiunta(new Libro("Libro java", 5));
        biblioteca.aggiunta(new Libro("1984", 3));
        biblioteca.aggiunta(new Libro("Il codice da Vinci", 2));

        boolean controllo;


        // MENU
        do {
            System.out.println("\nCosa vuoi fare?");
            System.out.println("1 - Presta libro");
            System.out.println("2 - Restituisci libro");
            System.out.println("3 - Aggiungi libro");
            System.out.println("4 - Rimuovi libro");
            System.out.println("5 - Elenco dei libri disponibili");
            System.out.println("6 - Uscire");

            Scanner scelta1 = new Scanner(System.in);
            int sceltaUtente;
            sceltaUtente = scelta1.nextInt();


            if (sceltaUtente == 1) {
                Scanner prest = new Scanner(System.in);
                String prestUtente;
                System.out.println("\nQuale libro vuoi in prestito?");
                prestUtente = prest.nextLine();
                biblioteca.prestaL(prestUtente);
            } else {
                if (sceltaUtente == 2) {
                    Scanner rest = new Scanner(System.in);
                    String restUtente;
                    System.out.println("\nQuale libro vuoi restituire?");
                    restUtente = rest.nextLine();
                    biblioteca.restituisci(restUtente);
                } else {
                    if (sceltaUtente == 3) {
                        Scanner agg = new Scanner(System.in);
                        String aggUtente;
                        System.out.println("\nQuale libro vuoi aggiungere?");
                        aggUtente = agg.nextLine();

                        Scanner aggC = new Scanner(System.in);
                        int aggCUtente;
                        System.out.println("Quante copie vuoi aggiungere?");
                        aggCUtente = aggC.nextInt();
                        scelta1.nextLine(); // Consumiamo il carattere di fine linea
                        biblioteca.aggiunta(new Libro(aggUtente, aggCUtente));
                    } else {
                        if (sceltaUtente == 4) {
                            Scanner rimo = new Scanner(System.in);
                            String rimoUtente;
                            System.out.println("\nQuale libro vuoi rimuovere?");
                            rimoUtente = rimo.nextLine();
                            biblioteca.rimozione(rimoUtente);
                        } else {
                            if (sceltaUtente == 5) {
                                System.out.println("\nI libri disponibili sono:");
                                biblioteca.stampaDisponibilita();
                            } else {
                                System.out.println("\nArrivederci!");
                            }
                        }
                    }
                }
            }

            controllo = true;
        } while (controllo != true);
    }
}
