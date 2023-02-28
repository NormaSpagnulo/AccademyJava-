import java.util.Scanner; // import the Scanner class

public class Esercitazione15 {

    // Dichiarazione delle variabili globali
    public static Scanner num = new Scanner(System.in);
    public static double primoNumero;

    public static Scanner num2 = new Scanner(System.in);
    public static double secondoNumero;

    public static Scanner scelta = new Scanner(System.in);
    public static String sceltaMenu;

    public static Scanner sceltaopz = new Scanner(System.in);
    public static int sceltaIniziale;

    public static void main(String[] args) {


        // Scelta inserimento numeri casuali
        System.out.println("Se vuoi scegliere i numeri su cui operare digita '1'.\nSe vuoi generare 2 numeri randomici digita '2'.");
        sceltaIniziale = sceltaopz.nextInt();
        if(sceltaIniziale==1) {

          // Inserimento dei numeri
         System.out.println("Inserisci il primo numero");
         primoNumero = num.nextDouble();
         System.out.println("Inserisci il secondo numero");
         secondoNumero = num2.nextDouble();

         // Chiamata del menù scelta
         menuScelta();
         
        } else if(sceltaIniziale==2) {

            // Generazion numeri casuali
            System.out.println("Scegli il numero più grande del raggio");
            primoNumero = num.nextDouble();

            System.out.println("Sceglii l numero più piccolo del raggio");
            secondoNumero = num2.nextDouble();

            double random1 = (Math.floor(Math.random() * (primoNumero - secondoNumero) + primoNumero));
            System.out.println("Il primo numero generato casualmente è: " +random1);

            double random2 = (Math.floor(Math.random() * (primoNumero - secondoNumero - 1) + primoNumero));
            System.out.println("Il primo numero generato casualmente è: " +random2);

            // Chiamata del menuScelta
            menuScelta();

        }
    }

    static void menuScelta() {

        System.out.println("Scegli operazione:\n'+' addizione\n'-' sottrazione\n'*' moltiplicazione\n':' divisione\n'sqr+' somma radici quadrate dei due numeri");
        sceltaMenu = scelta.nextLine();
        if(sceltaMenu.equals("+")) {                             // if addizione
           double somma = primoNumero + secondoNumero;
           System.out.println("La somma è pari a: " +somma);
           System.out.println("Il valore suo valore assoluto è " +Math.abs(somma));
           if(somma%1==0){
               System.out.println("Il numero è un intero");
               if(somma%2==0){
                   System.out.println("Il numero è pari");
               }

           } else {
               System.out.println("Il numero non è un intero: " +somma);
               double troncamento = (int)Math.floor(somma);
               double risultato = Math.abs(somma - troncamento);
               System.out.println("E' stata rimossa la seguente parte decimale: "+risultato);
           }

        } else if(sceltaMenu.equals("-")){                       // if sottrazione
           double sottrazione = primoNumero - secondoNumero;
           System.out.println("La sottrazione è pari a: " +sottrazione);
           System.out.println("Il valore suo valore assoluto è " +Math.abs(sottrazione));
           if(sottrazione%1==0){
               System.out.println("Il numero è un intero");
               if(sottrazione%2==0){
                   System.out.println("Il numero è pari");
               }

           } else {
               System.out.println("Il numero non è un intero: " +sottrazione);
               double troncamento = (int)Math.floor(sottrazione);
               double risultato = Math.abs(sottrazione - troncamento);
               System.out.println("E' stata rimossa la seguente parte decimale: "+risultato);
           }
        } else if(sceltaMenu.equals("*")){                       // if moltiplicazione
           double moltiplicazione = primoNumero * secondoNumero;
           System.out.println("La moltiplicazione è: " +moltiplicazione);
           System.out.println("Il valore suo valore assoluto è " +Math.abs(moltiplicazione));
           if(moltiplicazione%1==0){
               System.out.println("Il numero è un intero");
               if(moltiplicazione%2==0){
                   System.out.println("Il numero è pari");
               }

           } else {
               System.out.println("Il numero non è un intero: " +moltiplicazione);
               double troncamento = (int)Math.floor(moltiplicazione);
               double risultato = Math.abs(moltiplicazione - troncamento);
               System.out.println("E' stata rimossa la seguente parte decimale: "+risultato);
           }
        } else if(sceltaMenu.equals(":")){                       // if divisione
           double divisione = primoNumero/secondoNumero;
           System.out.println("La divisione è: " +divisione);
           System.out.println("Il valore suo valore assoluto è " +Math.abs(divisione));
           if(divisione%1==0){
               System.out.println("Il numero è un intero");
               if(divisione%2==0){
                   System.out.println("Il numero è pari");
               }

           } else {
               System.out.println("Il numero non è un intero: " +divisione);
               double troncamento = (int)Math.floor(divisione);
               double risultato = Math.abs(divisione - troncamento);
               System.out.println("E' stata rimossa la seguente parte decimale: "+risultato);
           }
        } else if(sceltaMenu.equals("sqr+")) {                    // if radice quadrata
           double sqr1 = Math.sqrt(primoNumero);
           double sqr2 = Math.sqrt(secondoNumero);
           System.out.println("La radice quadrata del primo numero è: " +sqr1);
           System.out.println("La radice quadrata del secondo numero è: " +sqr2);
           System.out.println("Il valore assoluto del primo numero è " +Math.sqrt(sqr1));
           System.out.println("Il valore assoluto del secondo numero è " +Math.sqrt(sqr2));

           if(sqr1%1==0){
               System.out.println("Il primo numero è un intero");
               if(sqr1%2==0){
                   System.out.println("Il primo numero è pari");
               }

           } else {
               System.out.println("Il primo numero non è un intero: " +sqr1);
               double troncamento = (int)Math.floor(sqr1);
               double risultato = Math.abs(sqr1 - troncamento);
               System.out.println("E' stata rimossa la seguente parte decimale: "+risultato);
           }

           if(sqr2%1==0){
               System.out.println("Il secondo numero è un intero");
               if(sqr2%2==0){
                   System.out.println("Il secondo numero è pari");
               }

           } else {
               System.out.println("Il secondo numero non è un intero: " +sqr2);
               double troncamento = (int)Math.floor(sqr2);
               double risultato = Math.abs(sqr2 - troncamento);
               System.out.println("E' stata rimossa la seguente parte decimale: "+risultato);
           }
           
        } else {
           System.out.println("Inserisci un operatore corretto."); // caso di stringa non riconosciuta|operatore errato
        }               
    }
}