package TESTSETTIMANA3;
import java.util.ArrayList;

import java.util.Scanner;

class Libro {

    private String titolo;
    private int numCopie;
    private int numCopieInPrestito;
    
    public Libro(String titolo, int numCopie) {
        this.titolo = titolo;
        this.numCopie = numCopie;

    }
    
    public String getTitolo() {
        return titolo;
    }
    
    public int getNumCopie() {
        return numCopie;
    }
    
    public void setNumCopie(int numCopie) {
        this.numCopie = numCopie;
    }
    
    public int getNumCopieInPrestito() {
        return numCopieInPrestito;
    }
    
    public void setNumCopieInPrestito(int newnumCopieInPrestito) {
        this.numCopieInPrestito = newnumCopieInPrestito;
    }

    public void presta(){
        if (numCopie > 0){
            numCopie--;
            numCopieInPrestito++;
            System.out.println("Hai preso in prestito:" + titolo);
        }else{
            System.out.println("Non ci sono copie disponibili del titolo cercato");

        }

    }
    public void restituisci(){
        if(numCopieInPrestito >= 1){
            numCopie++;
            numCopieInPrestito--;
            System.out.println("Libro restituito con successo!");
        }else{
            System.out.println("Errore! Non hai preso in prestito il libro!");

        }
    }


}

