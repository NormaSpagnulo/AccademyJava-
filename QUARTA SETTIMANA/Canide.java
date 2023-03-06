public class Canide extends Animali{


    public String nomec;
    public int numc;

   
    public Canide(String nomec, int numc) {
        this.nomec = nomec;
        this.numc = numc;
    }
    
    public String getnomec() {
        return nomec;
    }


    public int getnumc() {
        return numc;
    }

    public void setnumc(int numc) {
        this.numc = numc;
    }
   
    public void versoAnimale(){
        System.out.println("Bau");
      }

      public void versoAnimale(int x){
        System.out.println("Bau");
      }
   
}
