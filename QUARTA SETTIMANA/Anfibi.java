public class Anfibi extends Animali{
    public String nomea;
    public int numa;


    public Anfibi(String nomea, int numa) {
        this.nomea = nomea;
        this.numa = numa;
    }

    public String getnomea() {
        return nomea;
    }


    public int getnuma() {
        return numa;
    }

    public void setnuma(int numa) {
        this.numa = numa;
    }
    public void versoAnimale(){
        System.out.println("bo");
      }
   
 
}
