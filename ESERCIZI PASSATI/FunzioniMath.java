import java.util.Scanner; // import the Scanner class

// Esercizio su alcune funzioni matematiche

public class FunzioniMath {
    public static void main(String[] args) {

        // Creazione degli scanner
        Scanner num = new Scanner(System.in);
        double primoNumero;

        Scanner num2 = new Scanner(System.in);
        double secondoNumero;

        // Inserimento dei numeri con scanner
        System.out.println("Inserisci il numero più grande del raggio.");
        primoNumero = num.nextDouble();

        System.out.println("Inserisci il numero più piccolo del raggio.");
        secondoNumero = num2.nextDouble();

        // Generazione del numero
        double random = (Math.floor(Math.random() * (primoNumero - secondoNumero) + primoNumero));
        System.out.println("Il numero generato è: " +random);
        
        // Valore assoluto del numero random
        double valoreAssoluto = Math.abs(random);
        System.out.println("Il suo valore assoluto è " +valoreAssoluto);

        // Radice quadrata del numero random
        double radiceQuadrata = Math.sqrt(random);
        System.out.println("La sua radice quadrata è: " +radiceQuadrata);

        // Verifica che primoNumero sia maggiore di secondoNumero
        System.out.println("La condizione x > y è: " +(primoNumero>secondoNumero));

        // Chiusura degli scanner
        num.close();
        num2.close();

    }


}