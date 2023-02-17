import java.util.Scanner;

public class menu {

    // Dichiarazione Scanner e variabili globali
    public static Scanner dish = new Scanner(System.in);
    public static int dishIdentificator;

    public static Scanner answer = new Scanner(System.in);
    public static String confirmOrder;

    public static Boolean correctData;

    public static int dishNumber;
    public static int dishPrice;

    public static void main(String[] args) {

        // Menù scelta del piatto
        System.out.print("Benvenuto. ");
        menuScelta();
    }

    // Metodo per conferma della scelta
    public static void confirmChoice(){
        System.out.println("Confermi l'ordinazione? Digita 'Si' o 'No'");
        confirmOrder = answer.nextLine();
        
        do {

        if (confirmOrder.equals("Si")||confirmOrder.equals("si")) {
            dishNumber -= 1;
            correctData=true;
            System.out.println("Grazie per l'ordinazione!\nQuantità rimanente: " +dishNumber);

        } else if(confirmOrder.equals("No")||confirmOrder.equals("no")){
            correctData=true;
            menuScelta();

        } else {
            System.out.println("Inserimento errato!");
            correctData=true;
            confirmChoice();
        }
        } while(correctData!=true);    
    }

    public static void menuScelta() {
        System.out.println(" Scegli il piatto che desideri ordinare:\n 1. Pasta al forno\n 2. Pizza\n 3. Insalata.");
        dishIdentificator = dish.nextInt();
        switch(dishIdentificator) {
            case 1:
            System.out.println("La pasta al forno contiene:\n300g di Rigatoni\nProvola\nPolpette vegetariane\nBesciamella\nSugo al pomodoro");
            dishNumber = 20;
            dishPrice = 15;
            System.out.println("Il prezzo è: " +dishPrice);
            System.out.println("La disponibilità è: " +dishNumber);
            confirmChoice();
            break;

            case 2:
            System.out.println("La Pizza contiene:\nFarina di grano duro\nSalsa al pomodoro\nMozzarella di bufala\nMelanzane bio");
            dishNumber = 14;
            dishPrice = 12;
            System.out.println("Il prezzo è: " +dishPrice);
            System.out.println("La disponibilità è: " +dishNumber);
            confirmChoice();
            break;

            case 3:
            System.out.println("L'insalata contiene:\nLattuga\nCavolo rosso\nCarota\nPomodorini freschi");
            dishNumber = 4;
            dishPrice = 10;
            System.out.println("Il prezzo è: " +dishPrice);
            System.out.println("La disponibilità è: " +dishNumber);
            confirmChoice();
            break;
        }
    }

}