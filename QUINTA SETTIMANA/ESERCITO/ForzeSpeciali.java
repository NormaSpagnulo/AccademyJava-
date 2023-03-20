package ESERCITO;
 abstract class ForzeSpeciali {

    public String specializzazione;
    public abstract void GradiSpeciali();
    public abstract void Annodiinizio();


    public String getSpecializzazione(){
        return specializzazione;
    }

    public void setSpecializzazione(String specializzazione){
        this.specializzazione = specializzazione;
    }
    
    
}
