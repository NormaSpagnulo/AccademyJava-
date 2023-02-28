import java.util.Scanner;
import java.lang.Math;
public class TestRistorante {

//Dichiarazione variabili globali e scanner
    static Scanner piatto = new Scanner(System.in);
    public static int piattoID;

    public static Scanner risposta = new Scanner(System.in);
    public static String conferma_ordine;

    public static Boolean dato;

    public static int piattoNumero1 = 5;
    public static int piattoNumero2 = 7;
    public static int piattoPrezzo;


public static void main(String[] args){

int ospite = 0;
Scanner Menu = new Scanner(System.in);
int opzione;
System.out.println("Benvenuto nel menù. Fai la tua scelta: 1- Entra 2- Esci");

opzione = Menu.nextInt();
int numCliente = 0;

switch(opzione){
    case 1:
    ospite ++;//incremento numero di ospiti

    System.out.println("Sei Entrato, sei il cliente numero:" + ospite); //stampo le info dell'ospite
    int budget = (int)(Math.random()*101);  //randomizzo da 0 a 100
    System.out.println("Il tuo baget è di:" + budget); //stampo il budget

    Scanner Scelta = new Scanner(System.in);
    int scelta_m;
    System.out.println("Inserisci la tua scelta: 1- Compra 2- Vedi 3- Aggiungi 4- Esci");
    scelta_m = Scelta.nextInt();

    switch(scelta_m){
        //COMPRA
        case 1:
        
        System.out.println(" Scegli il piatto che desideri ordinare:\n 1. Budino\n 2. Carne\n ");
        piattoID = piatto.nextInt();
        switch(piattoID) {
            case 1:
            System.out.println("Il budino contiene:\nBudino al cioccolato\nPranna\n");
           // piattoNumero1 = 5;
            piattoPrezzo = 2;
            System.out.println("Il prezzo è: " +piattoPrezzo);
            System.out.println("La disponibilità è: " +piattoNumero1);
        

            System.out.println("Confermi l'ordinazione? Digita 'Si' o 'No'");
            conferma_ordine = risposta.nextLine();
        
        do {

        if (conferma_ordine.equals("Si")||conferma_ordine.equals("si")) {
            piattoNumero1-= 1;
            dato=true;
            budget = budget-piattoPrezzo;
            System.out.println("Grazie per l'ordinazione!\nQuantità rimanente: " +piattoNumero1 + " Il budget rimanente è:" +budget);

        } else if(conferma_ordine.equals("No")||conferma_ordine.equals("no")){
            dato=true;
          

        } else {
            System.out.println("Inserimento errato!");
            dato=true;
            
        }
        } while(dato!=true);    
            
            break;

            case 2:
            System.out.println("La Carne contiene:\nFettina\nSPatate\n");
            //piattoNumero2 = 7;
            piattoPrezzo = 3;
            System.out.println("Il prezzo è: " +piattoPrezzo);
            System.out.println("La disponibilità è: " +piattoNumero2);
            System.out.println("Confermi l'ordinazione? Digita 'Si' o 'No'");
        conferma_ordine = risposta.nextLine();
    
    do {

    if (conferma_ordine.equals("Si")||conferma_ordine.equals("si")) {
        piattoNumero2-= 1;
        dato=true;
        budget = budget-piattoPrezzo;
        System.out.println("Grazie per l'ordinazione!\nQuantità rimanente: " +piattoNumero2 + " Il budget rimanente è:" +budget);

    } else if(conferma_ordine.equals("No")||conferma_ordine.equals("no")){
        dato=true;
      

    } else {
        System.out.println("Inserimento errato!");
        dato=true;
        
    }
    } while(dato!=true);
break;


        }
    

        break;
        //VEDI
        case 2:

        System.out.println(" I piatti del menu sono:\n 1. Budino\n 2. Carne\n");

            System.out.println("\nIl budino contiene:\nBudino al cioccolato\nPanna");
          
            System.out.println("La disponibilità è: " +piattoNumero1 );

            System.out.println("\nLa Carne contiene:\nFettina\nPatate");
            
            System.out.println("La disponibilità è: " +piattoNumero2 );

        break;
        //AGGIUNGI
        case 3:
        Scanner password = new Scanner(System.in);
        String password_utente;

        System.out.println("Inserisci la password:");
        password_utente = password.nextLine();
        

        if(password_utente.equals("norma")){

            Scanner sceltaNumerica = new Scanner(System.in);
            int scelto;
            System.out.println("Scegli quale piatto vuoi modificare: 1- Budino\n 2-Carne\n");
            scelto = sceltaNumerica.nextInt();

            switch(scelto){
                case 1:
                System.out.println("Hai sceto di modificare il Budino\n Inserisci la quantita di disponibiltà che vuoi aggiungere:");
                Scanner num = new Scanner(System.in);
                int newbudino;
                newbudino = num.nextInt();
                piattoNumero1 = piattoNumero1 + newbudino;
                System.out.println("La nuova disponibiltà di budino è:" +piattoNumero1);
                break;

                case 2:
                System.out.println("Hai sceto di modificare la Carne\n Inserisci la quantita di disponibiltà che vuoi aggiungere:");
                Scanner numi = new Scanner(System.in);
                int newcarne;
                newcarne = numi.nextInt();
                piattoNumero2 = piattoNumero2 + newcarne;
                System.out.println("La nuova disponibiltà di carne è:" +piattoNumero2);
                break;
                
                default:
                System.out.println("Hai scelto un'opzione sbagliata");
            }

        }


        break;

        default:
        System.out.println("Arrivederci");

    }
    break;
    case 2:
    System.out.println("Arrivederci");
    break;


    //Ad ogni break si chiude e quindi non ho potuto fare la parte della 4 scelta ovvero l'uscita con i dettagli del totale speso ecc..
}
}
}
