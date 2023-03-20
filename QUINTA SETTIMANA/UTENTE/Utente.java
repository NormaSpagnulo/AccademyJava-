import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

 interface Utente {
    public void registra(String nome, String cognome, String email, String password);
    public boolean accedi(String email, String password);
    public boolean isAdmin();
    public void eliminaUtente(Utente utente);
    List<Utente> visualizzaUtenti();
}

 class UtenteS implements Utente {
    private String nome;
    private String cognome;
    private String email;
    private String password;
    private boolean isAdmin;
    private List<Utente> utenti;

    public UtenteS() {
        this.utenti = new ArrayList<>();
        this.isAdmin = false;
    }

    public void registra(String nome, String cognome, String email, String password) {
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.password = password;
        utenti.add(this);

    }

    public boolean accedi(String email, String password) {
        if (this.email.equals(email) && this.password.equals(password)) {
            return true;
        }
        return false;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void validaPassword(String password) {
        if (this.password.equals(password)) {
            this.isAdmin = true;
        }
    }

    public void eliminaUtente(Utente utente) {
        utenti.remove(utente);
    }

    public List<Utente> visualizzaUtenti() {
        return utenti;
    }
}
