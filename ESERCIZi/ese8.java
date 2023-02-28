package ESERCIZi;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class ese8 {

    public static ArrayList<String> usernameList = new ArrayList<String>();
    public static ArrayList<String> passwordList = new ArrayList<String>();
    public static ArrayList<String> ageList = new ArrayList<String>();

    public static Scanner scelta = new Scanner(System.in);
    public static int sceltaInizio;

    public static Scanner nome = new Scanner(System.in);
    public static String userName;

    public static Scanner password = new Scanner(System.in);
    public static String userPassword;

    public static Scanner eta = new Scanner(System.in);
    public static String userAge;

    public static Scanner dim = new Scanner(System.in);
    public static int numeroUtenti;

    public static Boolean checkIns;
    public static int counter=0;

    public static Scanner modificaDato = new Scanner(System.in);
    public static String nuovoInserimento;

    public static Scanner modificaDato2 = new Scanner(System.in);
    public static String nuovoInserimento2;

    public static Scanner modificaDato3 = new Scanner(System.in);
    public static String nuovoInserimento3;


    public static void main(String[] args){
        menuPrincipale(); // Esecuzione del Menu Principale per scegliere fra Terminare o Registrarsi
    }

    public static void menuPrincipale(){ // Metodo menù principale
        System.out.println("Scegli se [0]TERMINARE , [1]REGISTRARE , [2]MODIFICARE , [3]ELIMINARE ");
        sceltaInizio = scelta.nextInt();
        if (sceltaInizio==0){

        } else if (sceltaInizio==1){
            registraUtente(); // Porta al metodo registraUtente
        } else if(sceltaInizio==2) {
            modificaDati(); // Porta al metodo modificaDati
        } else if (sceltaInizio==3) {
            System.out.println("Desideri effettuare [1]ELIMINAZIONE PARZIALE o [2]ELIMINAZINE TOTALE?");
            sceltaInizio = scelta.nextInt();
            if (sceltaInizio==1){
                eliminaParziale();
            } else if (sceltaInizio==2){
                eliminaTotale();
            } else {
                menuPrincipale();
            }
        } else {
            System.out.println("Inserimento errato!");
            menuPrincipale(); // Riporta al menù principale causa errore
        }
    }

    public static void registraUtente(){

        System.out.println("Inserisci il numero di utenti da registrare:");
        numeroUtenti = dim.nextInt(); // Inserimento del numero di utenti da registrare 

        for (int i=0;i<numeroUtenti;i++) {

            do {

                System.out.println("Inserisci il tuo nome: ");
                userName = nome.nextLine();

                if (userName==" "){
                    System.out.println("TEST");
                }
        
                System.out.println("Inserisci la tua password: ");
                userPassword = password.nextLine();
        
                System.out.println("Inserisci la tua età: ");
                userAge = eta.nextLine();

                usernameList.add(userName);
                passwordList.add(userPassword);
                ageList.add(userAge);

                checkIns=true;
                counter++;

            } while(checkIns!=true);
        }

        if (checkIns=true){
            System.out.println("Inserimento effettuato correttamente.");
            System.out.println(usernameList+" "+passwordList+" "+ageList);
            System.out.println("Utenti inseriti: "+counter);
            menuPrincipale();
        }
    }

    public static void modificaDati(){
        System.out.println("I dati prima della modifica sono: "+usernameList+" "+passwordList+" "+ageList);

        System.out.println("Inserisci il dato da sostituire: ");
        nuovoInserimento = modificaDato.nextLine();

        if (usernameList.contains(nuovoInserimento)){
            System.out.println(usernameList.indexOf(nuovoInserimento));

            usernameList.remove(nuovoInserimento);
            System.out.println("Inserisci il nuovo dato da aggiungere: ");
            nuovoInserimento2 = modificaDato2.nextLine();
            usernameList.add(nuovoInserimento2);

        }
        if (passwordList.contains(nuovoInserimento)) {
            passwordList.remove(nuovoInserimento);
            System.out.println("Inserisci il nuovo dato da aggiungere: ");
            nuovoInserimento2 = modificaDato2.nextLine();
            passwordList.add(nuovoInserimento2);

        }
        if(ageList.contains(nuovoInserimento)) {
            ageList.remove(nuovoInserimento);
            System.out.println("Inserisci il nuovo dato da aggiungere: ");
            nuovoInserimento2 = modificaDato2.nextLine();
            ageList.add(nuovoInserimento2);

        } else {
            System.out.println("Il dato non è presente nella lista!");
            modificaDati();
        }

        System.out.println("I dati dopo la modifica sono: "+usernameList+" "+passwordList+" "+ageList);
        menuPrincipale();
    }

    public static void eliminaTotale(){
        usernameList.clear();
        passwordList.clear();
        ageList.clear();
        System.out.println("Eliminazione effettuata con successo.");
        System.out.println(usernameList+" "+passwordList+" "+ageList);

    }

    public static void eliminaParziale(){
        System.out.println("Digita il dato che vuoi eliminare fra: "+usernameList+" "+passwordList+" "+ageList);
        nuovoInserimento3 = modificaDato3.nextLine();

        if (usernameList.contains(nuovoInserimento3)){
            usernameList.remove(nuovoInserimento3);
            System.out.println("I dati dopo la modifica sono: "+usernameList+" "+passwordList+" "+ageList);
        } else if (passwordList.contains(nuovoInserimento3)) {
            passwordList.remove(nuovoInserimento3);
            System.out.println("I dati dopo la modifica sono: "+usernameList+" "+passwordList+" "+ageList);
        } else if (ageList.contains(nuovoInserimento3)){
            ageList.remove(nuovoInserimento3);
            System.out.println("I dati dopo la modifica sono: "+usernameList+" "+passwordList+" "+ageList);
        } else {
            System.out.println("Il dato non è presente nella lista. ");
            menuPrincipale();
        }
        menuPrincipale();
    }
}