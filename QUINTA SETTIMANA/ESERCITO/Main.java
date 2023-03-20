package ESERCITO;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      
      
      Soldato fo = new Soldato(null, 0, false); 
      Scanner scanner = new Scanner(System.in);

      Scanner input = new Scanner(System.in);
      int interi;

      boolean controllo = true;
      boolean specializzazione;

      do{
        System.out.println("Benvenuto, cosa vuoi fare?\n [1] AGGIUNGERE SOLDATO [2] USCIRE");
        interi = input.nextInt();

        switch(interi){

            case 1: 

            System.out.println("Inserisci il nome:");
            String nome = scanner.nextLine();

            System.out.println("Inserisci l'anno di nascita:");
            int annoNascita = scanner.nextInt();

            System.out.println("L'appartenenza alle Forze Speciali è true o false?");
            String forzeSpeciali = scanner.nextLine();

        if (forzeSpeciali.equalsIgnoreCase("true")) {
            System.out.println("Inserisci la specializzazione:");
            String special = scanner.next();

            System.out.println("Inserisci l'anno di inizio servizio:");
            int annoInizio = scanner.nextInt();



            Soldato soldato = new Soldato(nome, annoNascita, true);
            fo.aggiungiSoldato(null);
            System.out.println(soldato.toString());

        }else if (forzeSpeciali.equalsIgnoreCase("false")){


            Soldato soldato = new Soldato(nome, annoNascita, false);
            fo.aggiungiSoldato(null);
            System.out.println(soldato.toString());
        }
           

            break;

            case 2:
            System.out.println("Ecco la lista di tutti i soldati:");
            break;

            case 3:
            controllo= false;
            System.out.println("Arrivederci");
            break;

        }
      }while(controllo);

      
      
      
      
      
      
      
      
      
      
        /* Esercito esercito = new Esercito();
        esercito.aggiungiSoldato(new Soldato("Mario Rossi", 1980, false));
        esercito.aggiungiSoldato(new Soldato("Paolo Bianchi", 1990, true));
        esercito.aggiungiSoldato(new Soldato("Luigi Verdi", 1985, false));
        System.out.println("Numero di soldati: " + esercito.getNumeroSoldati());
        for (Soldato s : esercito.getSoldati()) {
            System.out.println("Soldato " + s.getNome() + ", anno di nascita: " + s.getAnnoNascita() + ", appartenenza forze speciali: " + s.isForzeSpeciali());
            if (s.isForzeSpeciali()) {
                System.out.println("Specializzazione: " + s.getSpecializzazione());
            }
            System.out.println();
        }
*/

    
}
}