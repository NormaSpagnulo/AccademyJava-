import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ese5 {
    public static void main(String[] args) {

        Boolean inizioP = true;

        while (inizioP == true) {

            // Creo scanner per permettere all'utente di entrare o uscire dal menù
            Scanner scelta = new Scanner(System.in);
            int scelta_utente;
            System.out.println("Insersci 1- Entra 2- Esci");
            scelta_utente = scelta.nextInt();

            // Creo lo scanner per permettere all'utente di scegliere tra Array di
            // Numeri/Array di Stringhe
            Scanner visua = new Scanner(System.in);
            int visual_array;

            switch (scelta_utente) {

                case 1:
                    System.out.println("Sei Entrato, quale array vuoi visualizzare? 1- Numeri 2- Stringhe");
                    visual_array = visua.nextInt();

                    switch (visual_array) {

                        case 1:
                            // l'utente ha scelto di visualizzare l'array composto da numeri

                            System.out.println("Hai scelto di visualizzare l'array di Numeri");
                            Integer a_numeri[] = { 1, 2, 3, 4, 5, 6 };
                            System.out.println("Array:" + Arrays.toString(a_numeri));
                            ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(a_numeri));

                            // Apro lo scanner per permettere di aggiungere un nuovo valore all'array

                            Scanner agg = new Scanner(System.in);
                            int agg_numero;

                            // Chiedo il numero da aggiungere
                            System.out.println("Insersci il numero da aggiungere:");
                            agg_numero = agg.nextInt();
                            arrayList.add(agg_numero);
                            a_numeri = arrayList.toArray(a_numeri);

                            // Stampo l'array con il nuovo numero inserito
                            System.out.println("Array con l'aggiunta del nuovo numero: " + Arrays.toString(a_numeri));

                            break;

                        case 2:
                            // l'utente ha scelto di visualizzare l'array composto da stringhe

                            System.out.println("Hai scelto Stringhe");
                            String a_strin[] = { "A", "B", "C", "D", "E", "F" };
                            System.out.println("Array:" + Arrays.toString(a_strin));
                            ArrayList<String> arrayList2 = new ArrayList<String>(Arrays.asList(a_strin));

                            // Apro lo scanner per permettere di aggiungere una nuova stringa all'array

                            Scanner aggi = new Scanner(System.in);
                            String aggi_stringa;

                            // Chiedo il numero da aggiungere
                            System.out.println("Insersci il numero da aggiungere:");
                            aggi_stringa = aggi.nextLine();
                            arrayList2.add(aggi_stringa);
                            a_strin = arrayList2.toArray(a_strin);

                            // Stampo l'array con il nuovo numero inserito
                            System.out.println("Array con l'aggiunta della nuova stringa: " + Arrays.toString(a_strin));

                            break;
                    }

                case 2:
                    // L'utente ha scelto di uscire
                    inizioP = false;
                    System.out.println("Sei Uscito, Arrivederci");

                    break;

            }

            scelta.close();
            visua.close();
        }

    }
}
