public class Utente {
    private String nome;
    private String password;


    public Utente(String nome, String password) {
        this.nome = nome;
        this.password = password;
     
    }

    public String getNome() {
        return nome;
    }

    public boolean confermaPassword(String password) {
        return this.password.equals(password);
    }
}