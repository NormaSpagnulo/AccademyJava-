import java.util.Scanner;

public class Motore {

    public static void main(String[] args) {

        Scanner cili = new Scanner(System.in);
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

        Scanner pist = new Scanner(System.in);
        int pistoni = pist.nextInt();

        System.out.println("Inserisci i pistoni:\n");

    }

    public static void configuraMotore(int cilindrata, int pistoni){


        System.out.println("Cilindrata:" + cilindrata + "pistoni" + pistoni);

     
    
    }

}
