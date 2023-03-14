
import java.util.Scanner;

public class Biblioteca {

    int numLibri;

    class Libro {

        String genere;

           Libro(String genere) {
            this.genere = genere;
        }

    }

    public void aggiungiLibro(String genere) {

        int risp = inputInt("Vuoi inserire un libro:\n  1- si 2- no");
        if(risp ==1){
            String genereLibro = inputString("Inserisci il genere del libro");
            Biblioteca.Libro libro = new Libro(genereLibro);
            numLibri++;

        }


    }

    public int inputInt (String inputMessage){
        Scanner sc = new Scanner(System.in);
        System.out.println(inputMessage);
        return sc.nextInt();
    }

    public String inputString(String inputMessage){
        Scanner sc = new Scanner(System.in);
        System.out.println(inputMessage);
        return sc.nextLine();
    }

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.aggiungiLibro(null);
        biblioteca.aggiungiLibro(null);
        biblioteca.aggiungiLibro(null);
        biblioteca.aggiungiLibro(null);
        System.out.println(biblioteca.numLibri);



    }
}
