import java.util.Scanner;

public class EsercizioIf {
    public static void main(String[] args) {

        // Dichiarazione Scanner

        Scanner username = new Scanner(System.in);
        String usernameUtente;

        Scanner password = new Scanner(System.in);
        String passwordUtente;

        Scanner age = new Scanner(System.in);
        int userAge;

        // Inserimento nome utente
        System.out.println("Inserisci il tuo nome utente: ");
        usernameUtente = username.nextLine();

        // Verifica correttezza del nome utente
        if(usernameUtente.equals("AdminGiovanni")) {
            System.out.println("L'username è corretto... Procedi inserendo l'età");
            // Inserimento età
            userAge = age.nextInt();
            if(userAge==18){
                System.out.println("Età corretta... Inserisci la password");
                // Inserimento password
                passwordUtente = password.nextLine();
                if(passwordUtente.equals("PasswordCasuale")){
                    System.out.println("Password corretta!");

                } else {
                    System.out.println("Password errata!");
                }
            } else {
                System.out.println("Età errata!");
            }

        } else {
            System.out.println("Username errato!");
        }

        username.close();
        password.close();
        age.close();


    }
}