import java.util.Scanner;

public class Test15 {

            // Dichiarazione variabili e Scanner
            public static int i;
    
            public static Scanner nome = new Scanner(System.in);
            public static String nomeUtente;
    
            public static Scanner eta = new Scanner(System.in);
            public static Integer age;
    
            public static Scanner password = new Scanner(System.in);
            public static String passwordUtente;
    
            public static Scanner data = new Scanner(System.in);
            public static String dataNascita;
    
            public static Scanner risposta = new Scanner(System.in);
            public static String rispModifica;
    
            public static Scanner inserimento = new Scanner(System.in);
            public static String secondaPass;
    
            public static Boolean checkLoop;
            public static Boolean passInserita;
            public static Boolean secondoCheck;

    public static void main(String[] args) {

        do {
        metodoInserimento();
        checkLoop=true;
    }while(checkLoop!=true);

        if(checkLoop=true) {
            System.out.println("\nImposta una password per modificare i dati");
            passwordUtente = password.nextLine();
            passInserita = true;
        }

        System.out.println("\nVuoi modificare i tuoi dati? Inserisci 'Si' o 'No'.");
        rispModifica = risposta.nextLine();

            if(rispModifica.equals("Si")||rispModifica.equals("si")){
                int i=1;
                while(checkLoop==true && passInserita==true && i!=0){
                    System.out.println("Inserisci la password scelta precedentemente per modificare i dati");
                    secondaPass = inserimento.nextLine();
                    if(secondaPass.equals(passwordUtente)) {
                        do{
                            metodoInserimento();
                            secondoCheck=true;
                        } while(secondoCheck!=true);
                        System.out.println("Grazie per aver modificato i tuoi dati.");
                        break;

                    } else {
                        System.out.println("Password errata!");
                    }

                    }

                } else if(rispModifica.equals("No")||rispModifica.equals("no")) {
                    System.out.println("Fine");

                } else {
                    System.out.println("Fai una scelta fra 'Si' e 'No'");
                }

                nomeUtente = null;
                passwordUtente = null;
                dataNascita = null;
                age = null;
                
            }

            static void metodoInserimento() {

                System.out.println("Inserire Nome e Cognome");
                nomeUtente = nome.nextLine();
                System.out.println("Inserire Età");
                age = eta.nextInt();
                System.out.println("Inserire data di nascita (Dd-Mm-Yy)");
                dataNascita = data.nextLine();
                checkLoop = true;

            }

        }
