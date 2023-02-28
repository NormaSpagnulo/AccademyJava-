import java.util.Scanner;
import javax.tools.OptionChecker;
import java.lang.StackWalker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class eseRisto {

//Dichiarazione variabili globali e scanner
public static ArrayList<String> nomePiatto = new ArrayList<String>();

public static ArrayList<String> ingrediente1 = new ArrayList<String>();

public static ArrayList<String> ingrediente2 = new ArrayList<String>();

public static ArrayList<String> prezzoPiatto = new ArrayList<String>();

public static void main(String[] args){

    menu();

}

public static void menu(){

    System.out.println("Inserisci:\n 1 - Entra 2 - Esci");

    Scanner menu1 = new Scanner (System.in);
    int menu_scelta;
    menu_scelta = menu1.nextInt();

    System.out.println("Inserisci il tuo nome utente:");

    Scanner nome = new Scanner(System.in);
    String nome_temp;
    nome_temp = nome.nextLine();

    // Definisci un array di nomi dei piatti
    String[] piatti = {"Spaghetti alla carbonara", "Pizza margherita"};

    String[] ingrediente1 = {"Spaghetti", "Mozzarella"};

    String[] ingrediente2 = {"Guanciale", "Pomodoro"};

    // Definisci un array di prezzi dei piatti
    int[] prezzi = {8, 6};


    int nome_cas = (int)(Math.random()*101); //randomizzo da 0 a 100
    System.out.println("Il tuo numero è:" + nome_cas); //stampo il valore assegnato all'utente

    // Genera un numero casuale nell'intervallo
    int budget = (int)(Math.random()*101); //randomizzo da 0 a 100
    System.out.println("Il tuo baget è di:" + budget); //stampo il budget


    // Stampa la lista dei piatti
    System.out.println("Menu:");

    for (int i = 0; i < piatti.length; i++) {
        System.out.println(piatti[i] +" - " + ingrediente1[i]+" - " + ingrediente2[i] + " - " + prezzi[i] + " euro");
    }
        Scanner Scelta = new Scanner(System.in);
        int scelta_m;
        System.out.println("Inserisci la tua scelta:\n 1- Ordina 2- Visualizza 3- Modifica 4- Esci");
        scelta_m = Scelta.nextInt();

        switch(scelta_m){
        //ORDINA
        case 1:
        
        ordina();

}


}


    public static void ordina(){

        System.out.println("Digita il piatto da ordinare");

        Scanner digita = new Scanner(System.in);
        String digita_piatto;
        digita_piatto = digita.nextLine();

        if(nomePiatto.contains(digita_piatto)){
        
      // Definiamo due array di esempio
        String[] piatti = {"Spaghetti alla carbonara", "Pizza margherita"};
        int[] prezzi = {8, 6};
        
        // Cerchiamo l'indice dell'elemento scelto nell'array nomi
        int indice = -1;
        for (int i = 0; i < piatti.length; i++) {
            if (piatti[i].equals(digita_piatto)) {
                indice = i;
                break;
            }
        }
        
        if (indice >= 0) {
            // Accediamo all'elemento corrispondente nell'array punteggi
            int prezzo = prezzi[indice];
            System.out.println("Il prezzo del piatto " + piatti + " è: " + prezzo);
        } else {
            System.out.println("Il nome inserito non è presente nell'array nomi.");
        }
        
                
        
            
            }

        }

    }

    /*
     case 1:
     System.out.println("Inserisci il nome del piatto:");
     nomePiatto.add(prov.nextLine());
     System.out.println("Inserisci il primo ingrediente:");
     ingrediente1.add(prov.nextLine());
     System.out.println("Inserisci il secondo ingrediente:");
     ingrediente2.add(prov.nextLine());
     System.out.println("Inserisci il prezzo");
     prezzoPiatto.add(prov2.nextLine());

     piatti = nomePiatto.toArray(piatti);
     ingrediente1 = ingrediente1.toArray(ingrediente1);
     ingrediente2 = ingrediente2.toArray(ingrediente2);
     prezzi = prezzoPiatto.toArray(prezzi);
     break;
     
     */

