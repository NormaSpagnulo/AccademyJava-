import java.util.Scanner;
public class CONTA {
    public static void main(String[] args){
        Scanner num1 = new Scanner(System.in);
        Scanner num2 = new Scanner(System.in); 
        Scanner num3 = new Scanner(System.in);
        Scanner sceltas = new Scanner(System.in);


        //chiedo i numeri da inserire
        System.out.println("Inserisci tre numeri a tua scelta");
        int num1_op= num1.nextInt();
        int num2_op= num2.nextInt();
        int num3_op= num3.nextInt();
        
        //chiedo da dove iniziare a contare
        System.out.println("Da quale numero vuoi contare?");
        int scelta_effettuata = sceltas.nextInt();
        //int scelta_effettuata = 1;
      
        switch(scelta_effettuata){

        case 1:
            for (int i = 0; i <= num1_op; i++){
                System.out.println(i);
            }
        break;

        case 2:
        for (int i = 0; i <= num2_op; i++){
            System.out.println(i);
        }
        break;

        case 3:
        for (int i = 0; i <= num3_op; i++){
                System.out.println(i);
        }
        break;


      }


        }

        


    }
    

