import java.util.Scanner;

public class Automobile {
 

    public static void main(String[] args){

        accesso();
    
    }

    public static void accesso(){

        boolean controllo = false;

        do{

        System.out.print("Inserire: 1- Ripeti\n  2- Esci\n");
        Scanner scelta1 = new Scanner(System.in);
        int scelta_1;
        scelta_1 = scelta1.nextInt();

        switch(scelta_1){

            case 1:

            break;

            case 2:

            break;

        }

    }while (controllo != true);
    
    }
        
    public class Motore{

        public static int cilindrata;
        public static int pistoni;

        public static Scanner cili = new Scanner(System.in);
        public static Scanner pist = new Scanner(System.in);


        public static void cilindrata(){

            int cilindrata = cili.nextInt();

        System.out.println("Scegli cilindrata:\n 1- 1500\n 2- 2000");

        switch (cilindrata) {

            case 1:
                System.out.println("Hai scelto 1500");
                break;

            case 2:
                System.out.println("Hai scelto 2000");
                break;

        }

        System.out.println("Cilindrata: " + Motore.cilindrata);}

        public static void pistoni(){

            int pistoni = pist.nextInt();

            System.out.println("Inserisci il numero di pistoni:\n" + Motore.pistoni);

        }

        public class Freni{

            public static String nomeFreni;
            public static int pot_fren;
            public static int num_past;

            public static Scanner pasti = new Scanner(System.in);
            public static Scanner potenFren = new Scanner(System.in);
            

            public static void PotenzaFrenante(){

                int pot_fren = potenFren.nextInt();

                System.out.println("Scegli la potenza:\n 1- 1500\n 2- 2000");
        
                switch (pot_fren) {
        
                    case 1:
                        System.out.println("Hai scelto 1500");
                        break;
        
                    case 2:
                        System.out.println("Hai scelto 2000");
                        break;
        
                }

                System.out.println("Potenza frenante:" + Freni.pot_fren);

            }


            public static void NumeroPastiglie(){

                System.out.println("Inserire il numero di pastiglie:");

                Freni.num_past = pasti.nextInt();

                System.out.println("Numero pastiglie:" + Freni.num_past);
            
            
            }


        }

        public static class Macchina{

            Motore moto;
            Freni fren;
            int tar;

            Macchina(Motore mo, Freni fre, int ta){
                moto = mo;
                fren = fre;
                tar = ta;
            }
        }


        }










    }











