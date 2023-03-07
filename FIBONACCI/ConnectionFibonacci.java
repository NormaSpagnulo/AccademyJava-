

import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.Statement;

public class ConnectionFibonacci {

    // TODO: Singleton

    // Connessione db fibonacci
    // url
    // Driver per mySql
    // Username e Password database
    // Statement con query
    // Esecuzione query con risultato
    // Funzione che collega con il Mainfibonacci

    private String myUrl;
    private String myUser;
    private String myPassword;

    public ConnectionFibonacci(String url, String user, String password) {
        // nel costruttore vogliamo settare i parametri
        myUrl = url;
        myUser = user;
        myPassword = password;

    }

    public Connection CreaConnessione() {

        try {
            Connection myConnection;
            myConnection = DriverManager.getConnection(myUrl, myUser, myPassword);

            System.out.println(myConnection != null ? "Connessione avvenuta" : "Connessione non avvenuta");

            return myConnection;

        } catch (Exception e) {
            e.printStackTrace();

            return null;
        }
    }
}