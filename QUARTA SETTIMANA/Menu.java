import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private ArrayList<Piatto> piatti = new ArrayList<Piatto>();

    public Menu() { // costruttore
        piatti = new ArrayList<Piatto>();
    }

    public void aggiungiPiatto(Piatto piatto) {
        piatti.add(piatto);
    }

    public void mostraMenu() {
        System.out.println("Il nostro menu:");
        for (Piatto piatto : piatti) {
            System.out.println("- " + piatto.getIngredienti() + " | Chef: " + piatto.getChef() + " | Prezzo: "
                    + piatto.getPrezzo() + " euro");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Menu menu = new Menu();
      
        
        System.out.println("Inserisci:\n [1]- Inserire Piatto\n [2]- Ordinare un piatto\n [3]- Esci");
   


        Scanner sceltaM = new Scanner(System.in);
        int scelta1;
        scelta1 = sceltaM.nextInt();
        switch (scelta1) {

            case 1:
                System.out.print("Inserisci gli ingredienti del piatto: ");
                String ingredienti = scanner.nextLine();

                System.out.print("Inserisci il nome dello chef: ");
                String chef = scanner.nextLine();

                System.out.print("Inserisci il prezzo del piatto: ");
                double prezzo = scanner.nextDouble();
                scanner.nextLine(); // consuma il carattere di fine linea

                Piatto piatto = new Piatto(ingredienti, prezzo, chef);
                menu.aggiungiPiatto(piatto);
                menu.mostraMenu();

                break;

            case 2:
                ArrayList<Piatto> menuO = new ArrayList<Piatto>();

                menuO.add(new Piatto("Spaghetti al pomodoro", 10.0, "Mario "));
                menuO.add(new Piatto("Bistecca ai ferri", 15.0, "Luigi "));
                menuO.add(new Piatto("Insalata mista", 5.0, "Giovanni"));

                Ordinazione ordinazione = new Ordinazione();
                while (true) {
                    System.out.println("Menu:");
                    for (int i = 0; i < menuO.size(); i++) {
                        System.out.println((i + 1) + ". " + menuO.get(i));
                    }

                    System.out.println("Scegli un piatto (inserisci il numero corrispondente):");
                    int scelta = scanner.nextInt();
                    scanner.nextLine(); // Consuma il carattere di fine linea

                    if (scelta < 1 || scelta > menuO.size()) {
                        System.out.println("Scelta non valida!");
                        continue;
                    }

                    Piatto piattoScelto = menuO.get(scelta - 1);
                    ordinazione.aggiungiPiatto(piattoScelto);

                    System.out.println("Vuoi ordinare altro? (s/n)");
                    String risposta = scanner.nextLine();

                    if (risposta.equalsIgnoreCase("n")) {
                        break;
                    }
                }

                double totale = ordinazione.calcolaTotale();
                System.out.println("Il totale dell'ordinazione è: " + totale + " euro.");
                break;

            case 3:
                System.out.println("Arrivederci");
                break;

        }

    }

}
