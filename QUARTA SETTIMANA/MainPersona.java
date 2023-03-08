public class MainPersona {

    public static void main(String[] args){
        Persona primapersona = new Persona("Luigi");
        Persona secondapersona = new Persona("Ciccio");

        primapersona.saluta();
        secondapersona.saluta();

        Persona pirata = new Pirata("PIRATA");
        pirata.saluta();

    }
    
}
