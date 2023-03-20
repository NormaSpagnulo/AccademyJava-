package ESERCITO;
import java.util.Scanner;
public class Soldato extends Esercito {

    private String nome;
        private int annoDiNascita;
        private boolean forzeSpeciali;

    public Soldato(String nome, int annoDiNascita, boolean forzeSpeciali){
        this.nome = nome;
        this.annoDiNascita = annoDiNascita;
        this.forzeSpeciali = forzeSpeciali;

    }

   
    public void GradiSpeciali(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il grado speciale del soldato:");
        String grado = scanner.nextLine();
        System.out.println("Il soldato" + nome + "ha il grado speciale di" + grado);

    }

   
    public void Annodiinizio(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci l'anno inizio del servizio speciale:");
        int anno = scanner.nextInt();
        System.out.println("Il soldato " + nome + "ha iniziato il servizio speciale nel" + anno);
    }

    public String getNome(){
        return nome;
    }

    public int getAnnoNascita(){
        return annoDiNascita;
    }

    public boolean isForzeSpeciali(){
        return forzeSpeciali;
    }


    public String getSpecializzazione() {
        return null;
    }

    
}


