public class Roditori extends Animali {
    public String nomer;
    public int numr;


    public Roditori(String nomer, int numr) {
        this.nomer = nomer;
        this.numr = numr;
    }

    public String getnomer() {
        return nomer;
    }

    public int getnumr() {
        return numr;
    }

    public void setnumr(int numr) {
        this.numr = numr;
    }

    public void versoAnimale(){
        System.out.println("Squit");
      }
   

}
