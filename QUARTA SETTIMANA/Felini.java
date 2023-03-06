public class Felini extends Animali{
    public String nomef;
    public int numf;

 
    public Felini(String nomef, int numf) {
        this.nomef = nomef;
        this.numf = numf;
    }
    
    public String getnomef() {
        return nomef;
    }


    public int getnumf() {
        return numf;
    }

    public void setnumf(int numf) {
        this.numf = numf;
    }
    public void versoAnimale(){
        System.out.println("Miao");
      }
   
   
}
