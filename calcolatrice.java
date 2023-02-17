import java.util.Scanner; // import the Scanner class

// Esercizio Calcolatrice del [14/02/2023]

public class calcolatrice {
    public static void main(String[] args) {

        // ------- Scanner numerici -------
        Scanner num = new Scanner(System.in);
        double primoNumero;

        Scanner num2 = new Scanner(System.in);
        double secondoNumero;

        // ------- Scanner stringa -------
        Scanner str1 = new Scanner(System.in);
        String operazione;

        // ------- Inserimento dati -------
        System.out.println("Inserisci il primo numero");
        primoNumero = num.nextDouble();

        System.out.println("Inserisci il secondo numero");
        secondoNumero = num2.nextDouble();

        System.out.println("Inserisci l'operazione\n+ per addizione\n- per sottrazione\n* per moltiplicazione\n: per divisione\nsqr per radice quadrata.");
        operazione = str1.nextLine();

        // -------- Condizioni per le operazioni -------
        if(operazione.equals("+")) {                             // if addizione
            double somma = primoNumero + secondoNumero;
            System.out.println("La somma è pari a: " +somma);
        } else if(operazione.equals("-")){                       // if sottrazione
            double sottrazione = primoNumero - secondoNumero;
            System.out.println("La sottrazione è pari a: " +sottrazione);
        } else if(operazione.equals("*")){                       // if moltiplicazione
            double moltiplicazione = primoNumero * secondoNumero;
            System.out.println("La moltiplicazione è: " +moltiplicazione);
        } else if(operazione.equals(":")){                       // if divisione
            double divisione = primoNumero/secondoNumero;
            System.out.println("La divisione è: " +divisione);
        } else if(operazione.equals("sqr")) {                    // if radice quadrata
            double sqr1 = Math.abs(primoNumero);
            double sqr2 = Math.abs(secondoNumero);
            System.out.println("La radice quadrata del primo numero è: " +sqr1);
            System.out.println("La radice quadrata del secondo numero è: " +sqr2);
        } else {
            System.out.println("Inserisci un operatore corretto."); // caso di stringa non riconosciuta|operatore errato
        }

            num.close();
            num2.close();
            str1.close();

        }
    
}