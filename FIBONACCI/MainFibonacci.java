
public class MainFibonacci {

    public static void main(String[] args) {

        ConnectionFibonacci connessione = new ConnectionFibonacci("jdbc:mysql://127.0.0.1:3306/fibonacci", "root", "Root");
     
        connessione.CreaConnessione();
        MenuFibonacci menu = new MenuFibonacci();
        menu.menuPrincipale();
       
 
        
    }
}