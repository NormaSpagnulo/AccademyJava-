import java.util.Scanner; // import the Scanner class

public class Esercitazione13 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int inputIntero;
        // Inserimento di un numero intero da convertire in Double
        System.out.println("Inserisci intero");
        inputIntero = num.nextInt();
        double conversione_double = inputIntero;
        float conversione_float = (float) inputIntero;
        // Output del numero in Double e Float
        System.out.println("double: " + conversione_double);
        System.out.println("float: " + conversione_float);

        Scanner num2 = new Scanner(System.in);
        double inputDouble;
        // Inserimento di un numero con la virgola da convertire in int
        System.out.println("Inserisci double");
        inputDouble = num2.nextDouble();
        // Output del numero in Int
        int conversione_int = (int)Math.round(inputDouble);
        System.out.println("int: " + conversione_int);

    
        Scanner stringa = new Scanner(System.in);
        String inputStringa;

        // Inserimento della Stringa
        System.out.println("Inserisci Stringa");
        inputStringa = stringa.nextLine();
        char prima_lettera = inputStringa.charAt(0);
        // Output di Char
        for(int i=0; i<inputStringa.length(); i++){
            char c = inputStringa.charAt(i);
            System.out.println("Il carattere numero "+i+" è: "+c);
        }

        // Test Boolean
        boolean prova_boolean=true;
        System.out.println(prova_boolean);
        System.out.print(!prova_boolean);

    }

}