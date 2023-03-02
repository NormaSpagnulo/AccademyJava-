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

          /*  Scanner ins = new Scanner(System.in);
        int ins_utente;
        System.out.println("Inserisci il numero da cui iniziare");
        ins_utente = ins.nextInt();

        int primo_termine = 0, secondo_termine = 1;

        System.out.println("La serie di Fibonacci è:");

        for (int i = 1; i <= ins_utente; i++) {
            System.out.println(primo_termine + ", ");

            // prossimo termine
            int prossimo_termine = primo_termine + secondo_termine;
            primo_termine = secondo_termine;
            secondo_termine = prossimo_termine;*/

    }
    
}
