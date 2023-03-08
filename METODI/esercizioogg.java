
import java.util.Scanner;

public class esercizioogg {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci il nome utente: ");
        String nome = input.nextLine();

        System.out.print("Inserisci la password: ");
        String password = input.nextLine();

        // Creo un'istanza della classe Utente e imposto il nome e la password utilizzando i metodi setter
        Utente utente = new Utente();
        utente.setNome(nome);
        utente.setPassword(password);

        // Stampiamo tutti i dati dell'utente utilizzando i metodi getter
        System.out.println("Nome: " + utente.getNome());
        System.out.println("Password: " + utente.getPassword());
    }
}

// La classe Utente
class Utente {
    private String nome;
    private String password;

    // Costruttore vuoto
    public Utente() {}

    // Metodi getter e setter per il nome e la password
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
