package METODI;
import java.util.Scanner;

public class UserStatus1 {

   /*public static ArrayList<String> nomeList = new ArrayList<String>();
    public static ArrayList<String> cognList = new ArrayList<String>();
    public static ArrayList<String> ruoloList = new ArrayList<String>();*/

    public static void main(String[] args) {
        
        System.out.println("Benvenuto, Scegli se:\n 1- Registrarti  2-Uscire");
        Scanner menu = new Scanner(System.in);
        int menu_scelta;
        menu_scelta = menu.nextInt();

        switch(menu_scelta){

            case 1:

            Registrazione();
            break;

            case 2: 
            Esci();

        }

        menu.close();


    }

    public static void Registrazione(){
        

        Scanner scanner = new Scanner(System.in);

        System.out.println("Benvenuto al nostro questionario!");
        System.out.println("Rispondi alle seguenti domande digitando 1 per Sì o 0 per No.");

        int risposta1 = askQuestion(scanner, "Hai mai effettuato un acquisto sul nostro sito? ");
        int risposta2 = askQuestion(scanner, "Hai mai contattato il nostro servizio clienti? ");
        int risposta3 = askQuestion(scanner, "Hai mai partecipato a un nostro evento promozionale? ");
        int risposta4 = askQuestion(scanner, "Hai mai pubblicato una recensione sul nostro sito? ");

        int numRisposte = countPositiveAnswers(risposta1, risposta2, risposta3, risposta4);

        if (numRisposte < 2) {
            System.out.println("Sei un utente normale");
        } else if (numRisposte < 3) {
            System.out.println("Sei un amministratore");
        } else {
            System.out.println("Sei il capo");
        }

    }

    public static void Esci(){
        System.out.println("Sei uscito! Arrivederci");
    }



    public static int askQuestion(Scanner scanner, String domanda) {
        System.out.print(domanda);
        return scanner.nextInt();
    }

    public static int countPositiveAnswers(int... risposte) {
        int count = 0;
        for (int risposta : risposte) {
            if (risposta == 1) {
                count++;
            }
        }
        return count;
    }

}
