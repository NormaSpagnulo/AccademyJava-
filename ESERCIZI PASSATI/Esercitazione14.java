import java.text.StringCharacterIterator;
import java.util.Scanner;

public class Esercitazione14 {
    
    public static void main(String[] args) {

        // Dichiarazione Scanner
        Scanner num = new Scanner(System.in);
        int numInserito;

        Scanner str1 = new Scanner(System.in);
        String stringaInserita;

        Scanner str2 = new Scanner(System.in);
        String secondaStringa;

        Scanner sceltaNumerica = new Scanner(System.in);
        int scelta;

        Scanner swi = new Scanner(System.in);
        String rispostaSwitch;

        // Inserimento dati
        System.out.println("Inserisci un numero");
        numInserito = num.nextInt();

        System.out.println("Inserisci una stringa");
        stringaInserita = str1.nextLine();



        // Menu sceglimento opzione

        System.out.println("Scegli fra\n(1) Funzioni Matematiche\n(2) Funzioni Stringa\n(3) Casting");
        scelta = sceltaNumerica.nextInt();

        switch(scelta){
            
            // Caso scelta Funzioni Matematiche
            case 1:
            System.out.println("Scegli fra le seguenti opzioni:\n+1 Aggiungi 1 al numero\nsqr Fai la radice quadrata\nva Fai valore assoluto\npari Controlla se è pari");
            rispostaSwitch = swi.nextLine();
            if(rispostaSwitch.equals("+1")){
                System.out.println("Il numero +1 è " +(numInserito+=1));;

            } else if(rispostaSwitch.equals("sqr")) {
                System.out.println("La radice quadrata è " +Math.sqrt(numInserito));
            } else if(rispostaSwitch.equals("va")) {
                System.out.println("Il valore assoluto è " +Math.abs(numInserito));

            } else if(rispostaSwitch.equals("pari")) {
                int pari = numInserito % 2;
                if(pari==0){
                    Boolean parita = true;
                    System.out.println("Il numero è pari? " +parita);
                } else {
                    Boolean parita = false;
                    System.out.println("Il numero è pari? " +parita);
                }
            }
              break;

              // Caso scelta Funzioni Stringa
              case 2:
              System.out.println("Scelgi quali fra queste Funzioni Stringa utilizzare:\nA : rimuovi il primo e l'ultimo carattere dalla stringa\nB : effettua concatenamento");
              rispostaSwitch = swi.nextLine();
              if(rispostaSwitch.equals("A")){
                System.out.print("Stringa dopo aver rimosso il primo carattere: ");
                System.out.println(stringaInserita.substring(1));
                System.out.print("Stringa dopo aver rimosso l'ultimo carattere: ");
                System.out.println(stringaInserita.substring(0, stringaInserita.length()-1));

              } else if (rispostaSwitch.equals("B")){
                System.out.println("Inserisci stringa da concatenare con la stringa inserita precendetemente");
                secondaStringa = str2.nextLine();
                String concatenazione = stringaInserita +" "+secondaStringa;
                System.out.println("La stringa concatenata è: " +concatenazione);
              }
              break;

              // Caso scelta Casting
              case 3:
              double convDouble = numInserito;
              float convFloat = (float) numInserito;
              System.out.println("double: " + convDouble);
              System.out.println("float: " + convFloat);
              break;

        }


}
}