import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Canide bau=new Canide("null", 0);
        bau.versoAnimale();
        Felini miao = new Felini("null", 0);
        miao.versoAnimale();
        Anfibi bo = new Anfibi("null", 0);
        bo.versoAnimale();
        Roditori squit = new Roditori("null", 0);
        squit.versoAnimale();
        

        RegistratoreIngresso registratoreIngresso = new RegistratoreIngresso();

        int nfelini = 0;
        int nroditori = 0;
        int nanfibio = 0;
        int ncanide = 0;

        do {
            System.out.println("\nBenvenuto dal veterinario!\n");
            System.out.println("\nQuale animale desideri registrare?");
            System.out.println("[1] - Felino");
            System.out.println("[2] - Roritore");
            System.out.println("[3] - Anfibio");
            System.out.println("[4] - Canide");
            System.out.println("[5] - Elenco degli animali registrati");
            System.out.println("[6] - Uscire");
            Scanner scelta1 = new Scanner(System.in);
            int scelta = scelta1.nextInt();

            switch (scelta) {
                case 1: // FELINI
                    Scanner aggf = new Scanner(System.in);
                    System.out.println("\nQuale è IL NOME DELL'felino che vuoi aggiungere?");
                    String aggfelino = aggf.nextLine();
                    nfelini++;
                    registratoreIngresso.aggiuntaf(new Felini(aggfelino, nfelini));
                    break;

                case 2: // RODITORI
                    Scanner aggr = new Scanner(System.in);
                    System.out.println("\nQuale è IL NOME DELL'roditore che vuoi aggiungere?");
                    String aggroditore = aggr.nextLine();
                    nroditori++;
                    registratoreIngresso.aggiuntar(new Roditori(aggroditore, nroditori));
                    break;

                case 3: // ANIFIBI
                    Scanner agga = new Scanner(System.in);
                    System.out.println("\nQuale è IL NOME DELL'anfibio che vuoi aggiungere?");
                    String agganfibi = agga.nextLine();
                    nanfibio++;
                    registratoreIngresso.aggiuntaa(new Anfibi(agganfibi, nanfibio));
                    break;

                case 4: // CANIDE
                Scanner aggc = new Scanner(System.in);
                    System.out.println("\nQuale è IL NOME DELL'canide che vuoi aggiungere?");
                    String aggcanide = aggc.nextLine();
                    ncanide++;
                    registratoreIngresso.aggiuntac(new Canide(aggcanide, ncanide));
                    break;

                case 5: // Disponibilità
                registratoreIngresso.stampaDisponibilità();
                    break;
                case 6: // EXIT
                    System.out.println("\narrivederci");
                    return;

            }
        } while (true);
    }
}
