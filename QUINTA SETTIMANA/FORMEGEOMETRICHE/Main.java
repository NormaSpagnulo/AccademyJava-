package FORMEGEOMETRICHE;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ShapeManager circlee = new ShapeManager();
        Scanner scanner = new Scanner(System.in);

        Scanner input = new Scanner(System.in);
        int interi;

        boolean controllo = true;

        do {
            System.out.println(
                    "Benvenuto, cosa vuoi calcolare?\n [1] CERCHIO\n [2] RETTANGOLO\n [3] TOTALE AREA FORME\n [4] TOTALE PERIMETRO FORME\n [5] Esci ");
            interi = input.nextInt();
            switch (interi) {

                case 1:

                    System.out.println("Inserisci il raggio del cerchio:");
                    double raggio = scanner.nextDouble();

                    Circle circle = new Circle(raggio);
                    circlee.addShape(circle);

                    break;

                case 2:

                    System.out.println("Inserisci la lunghezza del rettangolo:");
                    Scanner inse = new Scanner(System.in);
                    Double inserimento;
                    double lunghezza = inse.nextDouble();
                    System.out.println("Inserisci l'altezza del rettangolo:");
                    double altezza = inse.nextDouble();
                    Rectangle rectangle = new Rectangle(interi, interi);
                    circlee.addShape(rectangle);

                    break;

                case 3:
                    System.out.println("Totale Area: " + circlee.getTotaleArea());
                    break;

                case 4:
                    System.out.println("Totale Perimetro: " + circlee.getTotalePerimetro());
                    break;

                case 5:
                    controllo = false;
                    System.out.println("Arrivederci");
                    break;

            }
        } while (controllo);
    }

}
