package FIBONACCI;

public class connessione {

    public static void main(String[] args){

        int x = (int) (Math.random() * 10);
        System.out.println("Valore di partenza" + x);

    }

    public static int NumeroRandom(int x){

        //Calcoli del metodo
        int y = (int) (Math.random() * 10);

        //Condizione di exit
        if(x != y){
            System.out.println("Nuovo numero" + y);
            return y;  
        }
        //Ricorsione
        System.out.println("Prova un altro numero");
            return NumeroRandom(x);

    }
    
}
