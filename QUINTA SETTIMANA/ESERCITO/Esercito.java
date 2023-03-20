package ESERCITO;
import java.util.ArrayList;
import java.util.Scanner;

public class Esercito {
    private int numeroSoldati;
    private ArrayList<Soldato> soldati;

    public Esercito(){
        numeroSoldati = 0;
        soldati = new ArrayList<>();
    }

    public void aggiungiSoldato(Soldato s){
        soldati.add(s);
        numeroSoldati++;
    }

    public int getNumeroSoldati(){
        return numeroSoldati;
    }
    
    public ArrayList<Soldato> getSoldati(){
        return soldati;
    }

    

    
    }

