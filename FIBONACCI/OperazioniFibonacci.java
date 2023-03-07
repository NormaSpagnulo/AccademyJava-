import java.util.ArrayList;
import java.util.Scanner;

public class OperazioniFibonacci {
    public static void PrintSeries(int input) {
        int num1 = 0;
        int num2 = 1;
        int num3;

        // stampo 0 e 1 che sono sempre i primi due numeri della serie
        System.out.println(num1);
        System.out.println(num2);

        for (int i = 0; i < input; i++) {
            num3 = num1 + num2;
            System.out.println(num3);
            num1 = num2;
            num2 = num3;
        }
    }

    public static void SearchNum(int input) {
        ArrayList<Integer> numsGenerated = new ArrayList<Integer>();
        int index = 0;
        int n1 = 0;
        int n2 = 1;
        int n3;

        while (index < 30) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            numsGenerated.add(n3);
            index++;
        }
        // controllo se il numero fa parte della serie
        if (numsGenerated.contains(input)) {
            System.out.println("Il numero " + input + " fa parte della serie");
        } else {
            System.out.println("Il numero " + input + " non fa parte della serie");
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
