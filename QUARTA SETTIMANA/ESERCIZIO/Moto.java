package ESERCIZIO;
public class Moto extends Veicolo {
    private int cilindrata;
    private String tipologia;
    private int potenza;

   Moto(String marca, String modello, int annoFabbricazione, int cilindrata, String tipologia)
    {
        super(marca, modello, annoFabbricazione);
        this.cilindrata = cilindrata;
        this.tipologia = tipologia;
        setPotenza(cilindrata);
    }

    public int getCilindrata() {
        return cilindrata;
    }

    public void setCilindrata(int cilindrata) {
        this.cilindrata = cilindrata;
    }

    public String getTipologia() {
        return tipologia;
    }

    public void setTipologia(String tipologia) {
        this.tipologia = tipologia;
    }

    public int getPotenza() {
        return potenza;
    }

    public void setPotenza(int cilindrata) {
        if(cilindrata<100){
            this.potenza = 50;
        }else if(cilindrata > 100){
            this.potenza = 90;
        }
    }

}
