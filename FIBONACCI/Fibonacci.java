package FIBONACCI;

import java.util.Scanner;

import com.mysql.cj.xdevapi.PreparableStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Fibonacci {

    public static void main(String[] args) {

        // ------- test jdbc ----------
        String url = "jdbc:mysql://127.0.0.1:3306/world";
        // driver li prende in automatico DriverManager
        // nome di MySql = "com.mysql.jdbc.Driver" ovvero il connectorJ

        try {
            Connection myConnection = null;
            myConnection = DriverManager.getConnection(url, "root", "Root");

            if (myConnection == null)
                System.out.println("Non ho stabilito la connessione");
            else
                System.out.println("Connessione avvenuta");

            // prova lettura db
            String query = "SELECT * FROM city LIMIT 5";
            Statement stm = myConnection.createStatement();
            ResultSet rs = stm.executeQuery(query);

            while (rs.next()) {
                System.out.print(rs.getString(1));
                String tableFormat = String.format("ID: %s Name: %s CountryCode: %s District: %s Population: %s",
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5));

                System.out.println(tableFormat);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        // -------------------------------------

        Scanner ins = new Scanner(System.in);
        int ins_utente;
        System.out.println("Inserisci il numero da cui iniziare");
        ins_utente = ins.nextInt();

        int primo_termine = 0, secondo_termine = 1;

        System.out.println("La serie di Fibonacci è:");

        for (int i = 1; i <= ins_utente; i++) {
            System.out.println(primo_termine + ", ");

            // prossimo termine
            int prossimo_termine = primo_termine + secondo_termine;
            primo_termine = secondo_termine;
            secondo_termine = prossimo_termine;
        }

    }

}