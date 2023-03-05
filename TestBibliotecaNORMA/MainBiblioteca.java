package TestBibliotecaNORMA;
import java.util.Scanner;

public class MainBiblioteca {
    public static void main(String[] args) {

        // Creo una biblioteca con alcuni libri
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.aggiuntam(new Libro("Libro Java", 5));
        biblioteca.aggiuntam(new Libro("1984", 3));
        biblioteca.aggiuntam(new Libro("Il codice da Vinci", 2));

        // BIBLIOTECA


        boolean controllo=true;
        do{
            System.out.println("\nBenvenuto nella Biblioteca!\n");
            biblioteca.stampaDisponibilità1();
            System.out.println("\nCosa desideri fare?");

            System.out.println("[1] - Presta libro");
            System.out.println("[2] - Restituisci libro");
            System.out.println("[3] - Aggiungi libro");
            System.out.println("[4] - Rimuovi libro");
            System.out.println("[5] - Elenco dei libri disponibili");
            System.out.println("[6] - Uscire");
            Scanner scelta1 = new Scanner(System.in);
            int sceltaUtente = scelta1.nextInt();

            switch (sceltaUtente) {
                case 1: // Presta
                    System.out.println("\nQuale libro vuoi prendere in prestito?");
                    Scanner prest = new Scanner(System.in);
                    String prestUtente  = prest.nextLine();
                    biblioteca.prestaL(prestUtente );

                    break;

                case 2: // Restituire
                    System.out.println("\nQuale libro vuoi restituire?");
                    Scanner rest  = new Scanner(System.in);
                    String restUtente = rest .nextLine();
                    biblioteca.restituisci(restUtente);

                    break;

                case 3: // Aggiunta
                Scanner agg  = new Scanner(System.in);
                Scanner aggC  = new Scanner(System.in);
        
                    System.out.println("\nQuale libro vuoi aggiungere?");
                    String aggUtente  = agg.nextLine();
                    System.out.println("Quante copie vuoi aggiungere?");
                    int aggCUtente = aggC.nextInt();

                    biblioteca.aggiunta(new Libro(aggUtente , aggCUtente));

                    break;

                case 4: // Rimozione
                biblioteca.stampaDisponibilità1();
                    System.out.println("\nQuale libro vuoi rimuovere?");
                    Scanner rimo  = new Scanner(System.in);
                    String rimoUtente = rimo .nextLine();
                    biblioteca.rimozione(rimoUtente);

                    break;

                case 5: // Disponibilità
                    System.out.println("\nI libri disponibili sono:");
                    biblioteca.stampaDisponibilità();

                    break;
                    case 6: // Disponibilità
                    System.out.println("\nArrivederci");
                    controllo = false;
                    return;

            }
        }while(controllo);
}
}