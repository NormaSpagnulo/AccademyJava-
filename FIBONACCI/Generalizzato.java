import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Generalizzato {
    public static void main(String[] args) {

        try {

            Connection myConnection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/world", "root", "Root");

            Statement stm = myConnection.createStatement();
            String query = "SELECT * FROM v_ItalianCities;";
            ResultSet rs = stm.executeQuery(query);

            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();

            while (rs.next()) {
                for (int i = 1; i <= columnCount; i++) {
                    Object value = rs.getObject(i);
                    System.out.print(value + "\t");
                }
                System.out.println();
            }

        } catch (SQLException e) {
            e.printStackTrace();

        }
    }
}
