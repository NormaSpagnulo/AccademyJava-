
import java.util.Scanner;

public class metodiiiii {
    public static void main(String[] args) {
        Scanner prova = new Scanner(System.in);

        int num = 55;
        String string = "hello world";

        boolean fin = true;

        do {
            System.out.println("Cosa desidera stampare?\n 1 - intero\n 2 - stringa\n");
            prova = new Scanner(System.in);
            int prova1;
            prova1 = prova.nextInt();
            switch (prova1) {
                case 1:
                    print(num);
                    break;
                case 2:
                    print(string);
                    break;
                default:
                    System.out.println("Scelta non valida");
                    break;
            }

        } while (fin != true);

    }

    public static void print(int value) {
        System.out.println("Il valore intero è: " + value);
    }

    

    public static void print(String value) {
        System.out.println("Il valore stringa è: " + value);
    }

    
}