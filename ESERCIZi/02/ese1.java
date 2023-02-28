
import java.util.Scanner;
public class ese1 {

    public static void main(String[] args){
// nome cognome email età

        Scanner nome = new Scanner(System.in);
        String nome_utente;
        System.out.println("Inserisci il tuo nome:");
        nome_utente = nome.nextLine();

        Scanner cognome = new Scanner(System.in);
        String cognome_utente;
        System.out.println("Inserisci il tuo cognome:");
        cognome_utente = cognome.nextLine();

        Scanner email = new Scanner(System.in);
        String email_utente;
        System.out.println("Inserisci la tua email:");
        email_utente = email.nextLine();

        Scanner età = new Scanner(System.in);
        String età_utente;
        System.out.println("Inserisci la tua età:");
        età_utente = età.nextLine();

        String[] utente = {"", "", "", ""};

        utente[0] = nome_utente;
        utente[1] = cognome_utente;
        utente[2] = email_utente;
        utente[3] = età_utente;

        for (String string : utente){
            System.out.println(string);
        }

}}


