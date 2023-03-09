import java.util.Scanner;

public class Menu {
    private Calcolatrice calcolatrice;
    private Scanner scanner;

    public Menu() { // costruttore Menu
        this.calcolatrice = new Calcolatrice();
        this.scanner = new Scanner(System.in);
    }

    public void mostraMenu() {
        int scelta;
        do {
            System.out.println("Scegli un'operazione:");
            System.out.println("[1] Somma");
            System.out.println("[2] Sottrazione");
            System.out.println("[3] Moltiplicazione");
            System.out.println("[0] Esci");

            scelta = scanner.nextInt();

            try {
                switch (scelta) {
                    case 1:
                        calcolatrice.somma();
                        break;
                    case 2:
                        calcolatrice.sottrazione();
                        break;
                    case 3:
                        calcolatrice.moltiplicazione();
                        break;
                    case 0:
                        System.out.println("Arrivederci!");
                        break;
                    default:
                        System.out.println("Scelta non valida.");
                        break;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Limite array raggiunto.");
            } catch (Exception e) {
                System.out.println("Errore: " + e.getMessage());
            }
        } while (scelta != 0);
    }

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.mostraMenu();
    }
}
