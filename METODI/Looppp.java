package METODI;
import java.util.Scanner;

public class Looppp {
    public static void main(String[] args) {
        menu();
    }
   
   
   
    public static void menu(){
        Scanner prova = new Scanner(System.in);

       // boolean fin = true;
            System.out.println("Cosa desidera stampare?\n 1 - ciclo while\n 2 - ciclo do while\n 3 - ciclo for\n");
            prova = new Scanner(System.in);
            int prova1;
            prova1 = prova.nextInt();
            switch (prova1) {
                case 1:
                ciclowhile();
                case 2:
                ciclodowhile();
                case 3:
                ciclofor();

            }
        }

        public static void ciclowhile(){
            //un ciclo while per contare da 1 a 10 e stampare ciascun numero
            int count = 1;
            while (count <= 10) {
                System.out.println(count);
                count++;
            }
            menu();
        }

        public static void ciclodowhile(){
            //un esempio di codice Java che utilizza un ciclo do-while 
            //per chiedere all'utente di inserire un numero intero positivo maggiore di zero 
            //e continuare a chiedere finché l'utente non inserisce un numero valido
            Scanner scanner = new Scanner(System.in);
            int num;
            
            do {
                System.out.print("Inserisci un numero intero positivo maggiore di zero: ");
                num = scanner.nextInt();
            } while (num <= 0);
            
            System.out.println("Hai inserito il numero " + num);
        
            menu();
        }

        public static void ciclofor(){
            //ciclo for per stampare i primi cinque numeri 
            for (int i = 1; i <= 5; i++) {
                System.out.println(i);
            }
                        menu();
        }






        }