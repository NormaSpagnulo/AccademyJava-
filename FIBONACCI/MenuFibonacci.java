package FIBONACCI;

import java.util.Scanner;

public class MenuFibonacci {

    public static void menu() {

        System.out.println("Inserisci:\n 1-Serie di Fibonacci\n 2-Ricerca di un numero\n 3-Uscire");

        Scanner inserisci = new Scanner(System.in);
        int inserisci_scelta;
        inserisci_scelta = inserisci.nextInt();

        switch (inserisci_scelta) {

            case 1:
                OperazioniFibonacci.StampaNum();
                break;

            case 2:
                OperazioniFibonacci.Ricerca();
                break;

            case 3:
                System.out.println("Sei uscito, arrivederci!");

                inserisci.close();

            case 4:
                OperazioniFibonacci.StampaNum(10, 0 ,0);

        }

    }

   
}