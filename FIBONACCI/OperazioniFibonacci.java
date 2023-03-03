package FIBONACCI;
import java.util.Scanner;

public class OperazioniFibonacci {
    
    public static void StampaNum() {

        System.out.println("Numeri della sequenza da stampare:");
        Scanner ins = new Scanner(System.in);
        int ins_utente;
        int primo_termine = 0, secondo_termine = 1;
        ins_utente = ins.nextInt();
        System.out.println("La serie di Fibonacci è:");

        for (int i = 1; i <= ins_utente; i++) {
            System.out.println(primo_termine + ", ");

            // prossimo termine
            int prossimo_termine = primo_termine + secondo_termine;
            primo_termine = secondo_termine;
            secondo_termine = prossimo_termine;

            ins.close();

        }

    }

    public static void Ricerca() {
        Scanner ins = new Scanner(System.in);
        int ins_utente;
        int primo_termine = 0, secondo_termine = 1, prossimo_termine = 0, flag = 0;

        System.out.println("inserisci quale numero vuoi trovare: ");
        ins_utente = ins.nextInt();

        while (prossimo_termine <= ins_utente && flag != 1) {
            prossimo_termine = primo_termine + secondo_termine;
            primo_termine = secondo_termine;
            secondo_termine = prossimo_termine;
            // stampa solo se è il numero che cerco
            if (prossimo_termine == ins_utente) {
                System.out.println("Numero trovato: " + prossimo_termine);
                flag = 1;
            }
        }
        if (flag != 1) {
            System.out.println("Numero non trovato.");
            //menu();

            ins.close();

        }
    }

    static int StampaNum(int prossimo_termine, int primo_termine, int secondo_termine){

        if(prossimo_termine == 0){
            System.out.println("0\n1\n1\n");
            primo_termine = 2;
            secondo_termine = 1;
            return StampaNum(primo_termine-3,1,2);
        }
        
        int ins_utente = primo_termine+secondo_termine;
        System.out.println(prossimo_termine);

        if(prossimo_termine > 3){
            return StampaNum(primo_termine-1, secondo_termine, secondo_termine+primo_termine);
        }
        return prossimo_termine;

    
}

}
