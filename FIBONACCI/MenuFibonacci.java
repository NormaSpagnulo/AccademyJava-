import java.util.ArrayList;
import java.util.Scanner;

public class MenuFibonacci {
    public static void MainMenu() {
        boolean keep = true;
        while (keep) {
            Scanner choiceScanner = new Scanner(System.in);
            System.out.println("Vuoi\n[1] Stampare la serie\n[2] Verificare un numero\n[3] Uscire");
            int userChoice = choiceScanner.nextInt();

            switch (userChoice) {
                case 1:
                    PrintOperation();
                    break;
                case 2:
                    SearchNumOperation();
                    break;
                case 3:
                    System.out.println("Uscita...");
                    keep = false;
                    break;
                default:
                    System.out.println("Opzione non disponibile");
            }

        }
    }

    static void PrintOperation() {

        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Quante volte vuoi stampare la serie?");
        int userInput = inputScanner.nextInt();

        OperazioniFibonacci.PrintSeries(userInput);
    }

    static void SearchNumOperation() {
        Scanner numScanner = new Scanner(System.in);
        System.out.println("Inserisci il numero che vuoi ricercare");
        int numToCheck = numScanner.nextInt();

        OperazioniFibonacci.SearchNum(numToCheck);
    }
}