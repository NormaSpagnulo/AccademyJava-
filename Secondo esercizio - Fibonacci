import java.util.Scanner;
public class Fibonacci {

    public static void main(String[] args){

        // creo lo scanner per l'inserimento dell'utente 
        Scanner ins = new Scanner(System.in);
        int ins_utente;
        System.out.println("Inserisci il numero da cui iniziare");
        ins_utente = ins.nextInt();

        //inizializzo primo e secondo termine

         int primo_termine = 0, secondo_termine = 1;

        System.out.println("La serie di Fibonacci è:");

        for (int i = 1; i <= ins_utente; i++){
           // System.out.println(primo_termine + ", ");

            int prossimo_termine = primo_termine + secondo_termine;
            primo_termine = secondo_termine;
            secondo_termine = prossimo_termine;

            //vedo se il prossimo termine è pari
                if (prossimo_termine %2 == 0) 
                    System.out.println("Il numero:" + prossimo_termine + " è pari");   

            }
        }

    }
    

