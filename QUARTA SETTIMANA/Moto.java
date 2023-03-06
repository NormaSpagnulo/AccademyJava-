public class Moto extends Car{

    private String modelName = "Ciao";

    void run(){
      System.out.println("La bici sta correndo in sicurezza");
    }
  public static void main(String[] args) {

    Moto myMoto = new Moto();
    myMoto.honk();
    System.out.println(myMoto.brand + " "+ myMoto.modelName);
    myMoto.run();

    }
    
}
