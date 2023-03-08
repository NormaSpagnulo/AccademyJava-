public class Pirata extends Persona{
    
    public Pirata(String nome){
        super(nome);
    }

    @Override
   public void saluta(){

    super.saluta();
    System.out.println("AAAA, sono" + super.nome);

   }
}
