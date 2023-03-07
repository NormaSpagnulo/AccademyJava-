package ESERCIZIO;

public class Auto extends Veicolo {
    private int numeroPorte;
    private String tipoCarburante;
    private double consumoMedioCarburante;

     Auto(String marca, String modello, int annoFabbricazione, int numeroPorte, String tipoCarburante) {
        super(marca, modello, annoFabbricazione);
        this.numeroPorte = numeroPorte;
        this.tipoCarburante = tipoCarburante;
        this.consumoMedioCarburante = consumoMedioCarburante;
    }

    public int getNumeroPorte() {
        return numeroPorte;
    }

    public void setNumeroPorte(int numeroPorte) {
        this.numeroPorte = numeroPorte;
    }

    public String getTipoCarburante() {
        return tipoCarburante;
    }

    public void setTipoCarburante(String tipoCarburante) {
        this.tipoCarburante = tipoCarburante;
    }

    public double getConsumoMedioCarburante() {
        return consumoMedioCarburante;
    }

    public void setConsumoMedioCarburante(double consumoMedioCarburante) {
        this.consumoMedioCarburante = consumoMedioCarburante;
    }
}