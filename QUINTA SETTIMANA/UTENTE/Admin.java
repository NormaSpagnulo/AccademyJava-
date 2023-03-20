public interface Admin {
    void eliminaUtente(Utente utente);
    void visualizzaUtenti(Utente[] utenti);
}

 class Utente implements Admin {
    private String username;
    private String password;
    private boolean isAdmin;

    public Utente(String username, String password) {
        this.username = username;
        this.password = password;
        this.isAdmin = false;
    }

    public boolean validatePassword(String password) {
        return this.password.equals(password);
    }

    public boolean isAdmin() {
        return this.isAdmin;
    }

    public void diventaAdmin(String password) {
        if (validatePassword(password)) {
            this.isAdmin = true;
            System.out.println("Complimenti, sei diventato un amministratore!");
        } else {
            System.out.println("Password errata, non puoi diventare amministratore.");
        }
    }

    @Override
    public void eliminaUtente(Utente utente) {
        if (this.isAdmin) {
            System.out.println("L'amministratore " + this.username + " ha eliminato l'utente " + utente.getUsername());
        } else {
            System.out.println("Solo gli amministratori possono eliminare gli utenti.");
        }
    }

    @Override
    public void visualizzaUtenti(Utente[] utenti) {
        if (this.isAdmin) {
            System.out.println("Elenco utenti registrati:");
            for (Utente u : utenti) {
                System.out.println("- " + u.getUsername());
            }
        } else {
            System.out.println("Solo gli amministratori possono visualizzare gli utenti.");
        }
    }

    public String getUsername() {
        return this.username;
    }
}