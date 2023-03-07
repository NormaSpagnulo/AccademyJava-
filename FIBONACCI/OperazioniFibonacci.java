
public class OperazioniFibonacci {
    static MenuFibonacci myMenu = new MenuFibonacci();

    public static void StampaNum() {

        int num = myMenu.inputSelezione("Numeri della sequenza da stampare:");
        int primo_termine = 0, secondo_termine = 1;
        System.out.println("La serie di Fibonacci è:");

        for (int i = 1; i <= num; i++) {
            System.out.println(primo_termine + ", ");
            // prossimo termine
            int prossimo_termine = primo_termine + secondo_termine;
            primo_termine = secondo_termine;
            secondo_termine = prossimo_termine;

        }

    }

    public static void Ricerca() {
    
        int primo_termine = 0, secondo_termine = 1, prossimo_termine = 0, flag = 0;

        int num = myMenu.inputSelezione("inserisci quale numero vuoi trovare: ");


        while (prossimo_termine <= num && flag != 1) {
            prossimo_termine = primo_termine + secondo_termine;
            primo_termine = secondo_termine;
            secondo_termine = prossimo_termine;
            // stampa solo se è il numero che cerco
            if (prossimo_termine == num) {
                System.out.println("Numero trovato: " + prossimo_termine);
                flag = 1;
            }
        }
        if (flag != 1) {
            System.out.println("Numero non trovato.");
    
        }
    }


}