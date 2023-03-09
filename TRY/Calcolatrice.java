import java.util.Scanner;

public class Calcolatrice {
    private double[] risultati;
    private int indice;

    public Calcolatrice() { // costruttore Calcolatrice
        this.risultati = new double[4]; // limite Array 4 elementi
        this.indice = 0;
    }

    public void somma() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il primo numero:");
        double num1 = scanner.nextDouble();
        System.out.println("Inserisci il secondo numero:");
        double num2 = scanner.nextDouble();
        double risultato = num1 + num2;
        aggiungiRisultato(risultato);
        System.out.println("Risultato: " + risultato);

    }

    public void sottrazione() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il primo numero:");
        double num1 = scanner.nextDouble();
        System.out.println("Inserisci il secondo numero:");
        double num2 = scanner.nextDouble();
        double risultato = num1 - num2;
        aggiungiRisultato(risultato);
        System.out.println("Risultato: " + risultato);

    }

    public void moltiplicazione() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il primo numero:");
        double num1 = scanner.nextDouble();
        System.out.println("Inserisci il secondo numero:");
        double num2 = scanner.nextDouble();
        double risultato = num1 * num2;
        aggiungiRisultato(risultato);
        System.out.println("Risultato: " + risultato);

    }

    private void aggiungiRisultato(double risultato) {
        if (indice >= risultati.length) {
            System.out.println("Non puoi inserire altro!");
        } // verifica se l'indice è maggiore o uguale alla lunghezza dell'array
        risultati[indice] = risultato;
        indice++;
    }

}
