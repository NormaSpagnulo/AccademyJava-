import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Aggiunta 
{

    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        Scanner myInt = new Scanner(System.in);
        Scanner myScelta = new Scanner(System.in);
   
        String myUrl;
        String myUser;
        String myPassword;

    
        try 
        {
            
            Connection myConnection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/world", "root", "Root");

            System.out.print(myConnection == null ? "Connessione non riuscita\n" : "Connessione avvenuta\n" );
            //Query che visualizza la tabella city dal db world
            String query = "SELECT * FROM city ";
            //Dichiaro e Setto lo statement
            PreparedStatement stm = myConnection.prepareStatement(query, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stm.executeQuery(query);
            //Contatore utile per l'inserimento di 10 città
            int conta = 0;
            do
            {
                System.out.print("\nInserisci nome città: ");
                String nomeCittà = myScanner.nextLine();
                System.out.print("Inserisci il district della città: ");
                String district = myScanner.nextLine();

                boolean cittaEsistente = false;
                Boolean regioneEsistente = false;
                rs.beforeFirst();

                while (rs.next())
                {
                    String cittaVista = rs.getString("Name");
                    String regioneVista = rs.getString("District");
                    //Controllo che la citta inserita non sia già presente nella tabella controllandoi nomi città e district
                    if (cittaVista.equalsIgnoreCase(nomeCittà) && regioneVista.equalsIgnoreCase(regioneVista))
                    {
                        cittaEsistente = true;
                        regioneEsistente = true;
                        break;
                    } 
                }

                if (cittaEsistente && regioneEsistente)
                {
                    System.out.println("\nLa città esiste già nella tabella");
                }
                else
                {
                    System.out.print("Inserisci il country code della città: ");
                    String countryCode = myScanner.nextLine();
                    System.out.print("Inserisci la popolazione della città: ");
                    int popolazione = myInt.nextInt();

                    //Aggiungi i valori alla tabella city del db "world"
                    rs.moveToInsertRow();
                    rs.updateString("Name", nomeCittà);
                    rs.updateString("CountryCode", countryCode);
                    rs.updateString("District", district);
                    rs.updateInt("Population", popolazione);
                    rs.insertRow();
                    rs.moveToCurrentRow();

                    System.out.println("CITTA AGGIUNTA!!!.");
                }

                System.out.print("\nVuoi inserire un'altra città? (si /no): ");
                String sceltaRisposta = myScelta.nextLine();

                if (!sceltaRisposta.equalsIgnoreCase("Si"))
                {
                    break;
                }

                conta++;
            }
            while (conta < 10);

            
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
           
        }
    
}
}