
import java.util.Scanner;

public class MenuFibonacci {
    static MenuFibonacci myMenu = new MenuFibonacci();

    public void menuPrincipale() {

        

        boolean controllo = true;
        while (controllo) {
            int num = inputSelezione("Inserisci:\n 1-Serie di Fibonacci\n 2-Ricerca di un numero\n 3-Uscire");

            switch (num) {

                case 1:
                    OperazioniFibonacci.StampaNum();
                    break;

                case 2:
                    OperazioniFibonacci.Ricerca();
                    break;

                case 3:
                    System.out.println("Sei uscito, arrivederci!");
                    controllo = false;
                    break;

                default:
                System.out.println("Opzione non disponibile");
            }

        }
    }

    public int inputSelezione(String inputMessage) {
        Scanner sc = new Scanner(System.in);
        System.out.println(inputMessage);
        int num = sc.nextInt();
        return num;

    }
}
