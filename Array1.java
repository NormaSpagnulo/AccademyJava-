package METODI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Array1 {

    // creo i 3 array di inserimento nome, pass, età
    public static ArrayList<String> nomeList = new ArrayList<String>();
    public static ArrayList<String> passList = new ArrayList<String>();
    public static ArrayList<String> etàList = new ArrayList<String>();

    public static Scanner nome = new Scanner(System.in);
    public static String nome_utente;

    public static Scanner passw = new Scanner(System.in);
    public static String passw_utente;

    public static Scanner età = new Scanner(System.in);
    public static String età_utente;

    public static Boolean Inserimento;
    
    public static Scanner nuovo_ins = new Scanner(System.in);
    public static String nuovo_inserimento;

    public static Scanner nuovo_ins2 = new Scanner(System.in);
    public static String nuovo_inserimento2;

    

    public static void main(String[] args) {
        menu_m();
    }

    public static void menu_m(){
        
        Scanner menu = new Scanner(System.in);
        int menu_scelta;
     

        System.out.println("Benvenuto! Scegli se:\n 1 - Registrarti\n 2 - Modificare\n 3 - Eliminare\n 4 - Terminare ");

        menu_scelta = menu.nextInt();


        switch(menu_scelta){

            case 1: 
            Registrazione();

            case 2:
            modifica();

            case 3:
            elimina();

            case 4:

            System.out.println("Arrivederci");


        } 
    }

    public static void Registrazione(){
        do{

            System.out.println("Inserisci il nome:");
            nome_utente = nome.nextLine();

            if (nome_utente == " "){
                System.out.println("vuoto");
            }

            System.out.println("Inserisci la password:");
            passw_utente = passw.nextLine();

            System.out.println("Inserisci l'età:");
            età_utente = età.nextLine();
            
            nomeList.add(nome_utente);

            passList.add(passw_utente);

            etàList.add(età_utente);

            Inserimento = true;


        } while (Inserimento != true);

        if (Inserimento = true){

            System.out.println("Inserimento corretto");
            System.out.println(nomeList + " " + passList + " " + etàList);
            System.out.println("Inserimento corretto");

            menu_m();
        }
    }

        public static void modifica(){

            System.out.println("I dati prima della modifica sono: "+nomeList+" "+passList+" "+etàList);

            System.out.println("Inserisci il dato da sostituire: ");

            nuovo_inserimento = nuovo_ins.nextLine();

            if (nomeList.contains(nuovo_inserimento)){

                System.out.println(nomeList.indexOf(nuovo_inserimento));

                nomeList.remove(nuovo_inserimento);

                System.out.println("Inserisci il nuovo dato da aggiungere:");

                nuovo_inserimento2 = nuovo_ins2.nextLine();

                nomeList.add(nuovo_inserimento2);

            }


            if (passList.contains(nuovo_inserimento)){

                System.out.println(passList.indexOf(nuovo_inserimento));

                passList.remove(nuovo_inserimento);

                System.out.println("Inserisci il nuovo dato da aggiungere:");
                
                nuovo_inserimento2 = nuovo_ins2.nextLine();

                passList.add(nuovo_inserimento2);
                
            }

            
            if (etàList.contains(nuovo_inserimento)){

                System.out.println(etàList.indexOf(nuovo_inserimento));

                etàList.remove(nuovo_inserimento);

                System.out.println("Inserisci il nuovo dato da aggiungere:");

                nuovo_inserimento2 = nuovo_ins2.nextLine();

                etàList.add(nuovo_inserimento2);
                
            }else{

                System.out.println("Non è presente questo dato!");

                modifica();

            }

            menu_m();

                
        }

        public static void elimina(){

            nomeList.clear();
            passList.clear();
            etàList.clear();

            System.out.println("Dati eliminati con successo");

            menu_m();
        }
        

}




