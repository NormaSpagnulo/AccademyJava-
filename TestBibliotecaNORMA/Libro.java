package TestBibliotecaNORMA;

public class Libro {
    public String titolo;
    public int numCopie;
    public int numCopieInPrestito;

    // costruttore Libro
    public Libro(String titolo, int numCopie) {
        this.titolo = titolo;
        this.numCopie = numCopie;
        this.numCopieInPrestito = 0;
    }

    
    public String getTitolo() {
        return titolo;
    }


    public int getnumCopie() {
        return numCopie;
    }

    public void setnumCopie(int numCopie) {
        this.numCopie = numCopie;
    }

    
    public int getNumCopieInPrestito() {
        return numCopieInPrestito;
    }

 
    public void setNumCopieInPrestito(int numCopieInPrestito) {
        this.numCopieInPrestito = numCopieInPrestito;
    }

    public void prestaL() {
        if (numCopie > 0) {
            numCopie--;
            numCopieInPrestito++;
            System.out.println("Hai preso in prestito " + titolo + ".");
        } else {
            System.out.println("Non ci sono copie disponibili del libro " + titolo + ".");
        }
    }

  
    public void restituisci() {
        if (numCopieInPrestito > 0) {
            numCopie++;
            numCopieInPrestito--;
            System.out.println("Hai restituito il libro " + titolo + ".");
        } else {
            System.out.println("Non hai preso in prestito:" + titolo);
        }
    }
}