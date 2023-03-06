

import java.util.Scanner;
import javax.tools.OptionChecker;
import java.lang.StackWalker;
import java.util.ArrayList;
import java.util.Arrays;

public class Login {

    public static ArrayList<String> nomeList = new ArrayList<String>();
    public static ArrayList<String> passList = new ArrayList<String>();
    public static ArrayList<String> etàList = new ArrayList<String>();

    public static boolean reg_effettuata;
    public static boolean login_effettuato;


    public static void main(String[] args){
        menu_m(); 
    }

    public static void menu_m(){

        System.out.println("Inserisci:\n  1 - Registrati 2 - Login ");

        Scanner menu = new Scanner(System.in);
        int menu_scelta;
        menu_scelta = menu.nextInt();

        switch(menu_scelta){

            case 1:

            creazione();

            case 2:

            Login();

        }

    }

    public static void creazione(){
        do{
            System.out.println("Inserisci nome:");

            Scanner ins_nome = new Scanner(System.in);
            String inser_nome;

            inser_nome = ins_nome.nextLine();
            nomeList.add(inser_nome);

            System.out.println("Inserisci password:");

            Scanner ins_pass = new Scanner(System.in);
            String inser_pass;

            inser_pass = ins_pass.nextLine();
            passList.add(inser_pass);

            System.out.println("Registrazione effettuata!");

            reg_effettuata = true;

        } while (reg_effettuata != true);

        menu_m();

    }

    public static void Login(){

        do{

        System.out.println("Inserisci nome utente:");

        Scanner log = new Scanner(System.in);
        String login;

        login = log.nextLine();

        if(nomeList.contains(login)){

        System.out.println("Inserisci password utente:");

        Scanner pass = new Scanner(System.in);
        String password;

        password = pass.nextLine();

        if(passList.contains(password)){

            login_effettuato = true;
            System.out.println("Login effettuato!");

            menu_login();

        }else{
            System.out.println("Password errata");
            Login();
        }}else{
            System.out.println("Nome Utente errato");
            Login();

        }}
        while(login_effettuato != true);

    }

    public static void menu_login(){

        System.out.println("Inserisci:\n  1 - Logout 2 - Inserisci Dati ");

        Scanner menu_2 = new Scanner(System.in);
        int menu_scelta2;
        menu_scelta2 = menu_2.nextInt();

        switch(menu_scelta2){

            case 1:

            logout();

            case 2:

            inserisci_dati();

        }

    }

        public static void logout(){

            System.out.println("Stai effettuando il logout ");
            menu_m();

        }

        public static void inserisci_dati(){

            System.out.println("Inserisci i dati:");
            
            Scanner dato = new Scanner(System.in);
            String dato_utente;

            dato_utente = dato.nextLine();

            System.out.println("Hai inserito i dati correttamente");
            menu_login();


        }


        }
    
        

