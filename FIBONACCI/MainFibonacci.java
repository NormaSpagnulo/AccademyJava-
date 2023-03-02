package FIBONACCI;


public class MainFibonacci {

    public static void main(String[] args) {

        MenuFibonacci myMenu = new MenuFibonacci();

        ConnectionFibonacci connessione = new ConnectionFibonacci("jdbc:mysql://127.0.0.1:3306/fibonacci", "root", "Root");
     
        connessione.CreaConnessione();

        myMenu.menu();
 
        
    }
}

