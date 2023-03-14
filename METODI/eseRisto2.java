
import java.util.Scanner;
import javax.tools.OptionChecker;
import java.lang.StackWalker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class eseRisto2 {

    // Definisci un array di nomi dei piatti
     static String[] piatti = { "Spaghetti alla carbonara", "Pizza margherita" };
     static String[] ingrediente1 = { "Spaghetti", "Mozzarella" };
     static String[] ingrediente2 = { "Guanciale", "Pomodoro" };
//    Definisci un array di prezzi dei piatti
     static String[] prezzi = { "otto", "sei" };
     

    /*ArrayList<String> nomePiatto = new ArrayList<String>(Arrays.asList(piatti));
    ArrayList<String> ingrediente1ArrayList = new ArrayList<String>(Arrays.asList(ingrediente1));
    ArrayList<String> ingrediente2ArrayList = new ArrayList<String>(Arrays.asList(ingrediente2));
    ArrayList<Integer> prezzoPiattoArrayList = new ArrayList<Integer>(Arrays.asList(prezzi));*/

    static int budget = (int) (Math.random() * 101); // randomizzo da 0 a 100

    public static void main(String[] args) {
        System.out.println("Benvenuto, scegli come proseguire:\n 1 - Entra 2 - Esci");
        Scanner Sceltu = new Scanner(System.in);
        int scelta_u;
        scelta_u = Sceltu.nextInt();
        switch (scelta_u) {
            // ORDINA
            case 1:
                System.out.println("Inserisci il tuo nome utente:");
                Scanner nome = new Scanner(System.in);
                String nome_temp;
                nome_temp = nome.nextLine();
                int nome_cas = (int) (Math.random() * 101); // randomizzo da 0 a 100
                System.out.println("\nIl tuo numero è:" + nome_cas); // stampo il valore assegnato all'utente
                // Genera un numero casuale nell'intervallo

                System.out.println("\nIl tuo badget è di:" + budget); // stampo il budget

                menu();
                break;

            case 2:
                System.out.println("Arrivederci");
                break;
        }
    }

    public static void menu() {
        
        // Stampa la lista dei piatti
        System.out.println("\nMenu:");
        for (int i = 0; i < piatti.length; i++) {
            System.out.println(piatti[i] + " - " + ingrediente1[i] + " - " + ingrediente2[i] + " - " + prezzi[i] + " euro\n");
        }
        Scanner Scelta = new Scanner(System.in);
        int scelta_m;
        System.out.println("\nInserisci la tua scelta:\n 1- Ordina 2- Visualizza 3- Modifica 4- Esci");
        scelta_m = Scelta.nextInt();
        switch (scelta_m) {
            // ORDINA
            case 1:
                ordina();
            case 2:
                visualizza();
            case 3:
                credenziali();

        }
    }

    public static void ordina() {
        Scanner input = new Scanner(System.in);

        // Chiediamo all'utente di inserire un nome presente nell'array nomi
        System.out.print("Digita il piatto che desidera ordinare: ");
        String nomeScelto = input.nextLine();

        // Cerchiamo l'indice dell'elemento scelto nell'array nomi
        int indice = -1;
        for (int i = 0; i < piatti.length; i++) {
            if (piatti[i].equals(nomeScelto)) {
                indice = i;
                break;
            }
        }

        if (indice >= 0) {
            // Accediamo all'elemento corrispondente nell'array punteggi
            String prezzo = prezzi[indice];
            System.out.println(
                    "\nIl costo del piatto  è: " + prezzo + "...vuoi continuare con l'acquisto?\n 1- SI\n 2-NO\n");
            Scanner Sceltay = new Scanner(System.in);
            int scelta_y;
            scelta_y = Sceltay.nextInt();
            switch (scelta_y) {
                case 1:
                    if (budget >= prezzo.length()) {
                        System.out.println("\nAcquisto effettuato");
                        
                        menu();
                    } else {
                        System.out.println("Non hai abbastanza monete");
                        menu();
                    }

                case 2:
                    System.out.println("Arrivederci");
                    menu();
            }

        } else {
            System.out.println("Il nome inserito non è presente nel menu.");
        }

        input.close();
    }

    public static void visualizza() {

        System.out.println("\nQuesto è il nostro menu:");
        for (int i = 0; i < piatti.length; i++) {
            System.out.println(
                    piatti[i] + " - " + ingrediente1[i] + " - " + ingrediente2[i] + " - " + prezzi[i] + " euro\n");
        }
        menu();
    }

    public static void credenziali() {
        Scanner password = new Scanner(System.in);
        String password_utente;
        System.out.println("Inserisci la password:");
        password_utente = password.nextLine();
        if(password_utente.equals("norma")){
            menu_modifica();
        }else{
            System.out.println("password errata.");
            credenziali();
        }
        
    }

    public static void menu_modifica() {

    ArrayList<String> nomePiatto = new ArrayList<String>(Arrays.asList(piatti));
    ArrayList<String> ingrediente1ArrayList = new ArrayList<String>(Arrays.asList(ingrediente1));
    ArrayList<String> ingrediente2ArrayList = new ArrayList<String>(Arrays.asList(ingrediente2));
    ArrayList<String> prezzoPiattoArrayList = new ArrayList<String>(Arrays.asList(prezzi));

       Scanner prov = new Scanner(System.in);
       Scanner prov2 = new Scanner (System.in);


        System.out.println("Quale tipo di modifica si vuole effettuare?\n 1-Aggiungi\n 2-Modifica\n 3-elimina\n 4-indietro\n");
    Scanner Sceltaw = new Scanner(System.in);
     int scelta_w;
     scelta_w = Sceltaw.nextInt();
     switch (scelta_w) {
         case 1:
             System.out.println("Inserisci il nome del piatto:");
                  nomePiatto.add(prov.nextLine());
                  System.out.println("Inserisci il primo ingrediente:");
                  ingrediente1ArrayList.add(prov.nextLine());
                  System.out.println("Inserisci il secondo ingrediente:");
                  ingrediente2ArrayList.add(prov.nextLine());
                  System.out.println("Inserisci il prezzo");
                  prezzoPiattoArrayList.add(prov2.nextLine());
             
                  piatti = nomePiatto.toArray(piatti);
                  ingrediente1 = ingrediente1ArrayList.toArray(ingrediente1);
                  ingrediente2 = ingrediente2ArrayList.toArray(ingrediente2);
                  prezzi = prezzoPiattoArrayList.toArray(prezzi);
                  
                  System.out.println("Piatto inserito correttamente ");

                  menu_modifica();
                  break;
        case 2:
//        Scanner scanni = new Scanner(System.in);
//        System.out.print("Digita il piatto che desidera eliminare: ");
//        String searchElement = scanni.nextLine();
//        for (int i = 0; i < piatti.length; i++) {
//            if (piatti[i].equals(searchElement)) {
//                piatti[i] = "";
//                ingrediente1[i] = "";
//                ingrediente2[i] = "";
//                prezzi[i] = "";
//            }
//        }
//    
//        System.out.println("Inserisci il nome del piatto:");
//        nomePiatto.add(prov.nextLine());
//        System.out.println("Inserisci il primo ingrediente:");
//        ingrediente1ArrayList.add(prov.nextLine());
//        System.out.println("Inserisci il secondo ingrediente:");
//        ingrediente2ArrayList.add(prov.nextLine());
//        System.out.println("Inserisci il prezzo");
//        prezzoPiattoArrayList.add(prov2.nextLine());
//        
//        piatti = nomePiatto.toArray(piatti);
//        ingrediente1 = ingrediente1ArrayList.toArray(ingrediente1);
//        ingrediente2 = ingrediente2ArrayList.toArray(ingrediente2);
//        prezzi = prezzoPiattoArrayList.toArray(prezzi);
//        
//        System.out.println("Piatto inserito correttamente ");
//      menu_modifica();
//
//
//
case 3:
    Scanner scanni = new Scanner(System.in);
    System.out.print("Digita il piatto che desidera eliminare: ");
    String searchElement = scanni.nextLine();
    for (int i = 0; i < piatti.length; i++) {
        if (piatti[i].equals(searchElement)) {
            piatti[i] = "";
            ingrediente1[i] = "";
            ingrediente2[i] = "";
            prezzi[i] = "";
        }
    }
menu_modifica();
case 4:
menu();
}

     
}

}
//   // Definisci un array di nomi dei piatti
//   static String[] piatti = { "Spaghetti alla carbonara", "Pizza margherita" };
//   static String[] ingrediente1 = { "Spaghetti", "Mozzarella" };
//   static String[] ingrediente2 = { "Guanciale", "Pomodoro" };
//   // Definisci un array di prezzi dei piatti
//   static String[] prezzi = { "otto", "sei" };
