import java.util.Scanner;

public class MainUtente {

    public static void main(String[] args) {
        
        UtenteS utente =  new UtenteS();
        Scanner scanner = new Scanner(System.in);
        int interi;
        Scanner input = new Scanner(System.in);

        boolean controllo = true;

        do{
            System.out.println("Ciao, vuoi:\n [1] REGISTRARTI\n [2] ACCEDERE\n [3] USCIRE");
            interi = scanner.nextInt();

            switch(interi){

                case 1: 
                
                System.out.println("Inserisci il tuo nome:");
                String nome = input.nextLine();
                System.out.println("Inserisci il tuo cognome:");
                String cognome = input.nextLine();
                System.out.println("Inserisci la tua email:");
                String email = input.nextLine();
                System.out.println("Inserisci la tua password:");
                String password = input.nextLine();
                utente.registra(nome, cognome, email, password);
                System.out.println("Registrazione avvenuta con successo!");
                break;

                case 2:
                System.out.println("Inserisci la tua email:");
                email = input.next();
                System.out.println("Inserisci la tua password:");
                password = input.next();

                boolean accesso = utente.accedi(email, password);
                    if (accesso) {
                        System.out.println("Accesso riuscito!");
                    } else{
                        System.out.println("Accesso non riuscito");
                    }

                if(utente.isAdmin()){
                    System.out.println("Sei un amministratore.");
                }


        }

    }while(controllo);
}

}