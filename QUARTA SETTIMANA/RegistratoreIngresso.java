import java.util.ArrayList;

public class RegistratoreIngresso {
    public ArrayList<Felini> elencogatti;
    public ArrayList<Roditori> elencoroditore;
    public ArrayList<Anfibi> elencoanfibi;
    public ArrayList<Canide> elencocanide;

    

    // costruttore
    public RegistratoreIngresso() {
        elencogatti = new ArrayList<>();
        elencoroditore = new ArrayList<>();
        elencoanfibi = new ArrayList<>();
        elencocanide = new ArrayList<>();
    }

    // metodo che permette l'aggiunta di un nuovo felino
    public void aggiuntaf(Felini felini) {
        if (!elencogatti.contains(felini)) {
            elencogatti.add(felini);
            System.out.println("Il felino è stato aggiunto con successo!\n");
        }
    }

    // metodo che permette l'aggiunta di un nuovo roditore
    public void aggiuntar(Roditori roditori) {
        if (!elencoroditore.contains(roditori)) {
            elencoroditore.add(roditori);
            System.out.println("Il roditore è stato aggiunto con successo!\n");
        }
    }

    // metodo che permette l'aggiunta di un nuovo anfibio
    public void aggiuntaa(Anfibi anfibi) {
        if (!elencoanfibi.contains(anfibi)) {
            elencoanfibi.add(anfibi);
            System.out.println("l'anfibio è stato aggiunto con successo!\n");
        }
    }

    // metodo che permette l'aggiunta di un nuovo canide
    public void aggiuntac(Canide canide) {
        if (!elencocanide.contains(canide)) {
            elencocanide.add(canide);
            System.out.println("Il canide è stato aggiunto con successo!\n");
        }
    }

    // stampa lista animali
    public void stampaDisponibilità() {
        if (elencogatti.isEmpty()) {
            System.out.println("Non ci sono felini nella banca dati");
        } else {
            System.out.println("Elenco felini registrati:");
            for (Felini felini : elencogatti) {
                System.out.println(felini.getnumf() + " - " + felini.getnomef());
            }
        }
        if (elencoroditore.isEmpty()) {
            System.out.println("Non ci sono roditori nella banca dati");
        } else {
            System.out.println("Elenco roditori registrati:");
            for (Roditori roditori : elencoroditore) {
                System.out.println(roditori.getnumr() + " - " + roditori.getnomer());
            }
        }
        if (elencocanide.isEmpty()) {
            System.out.println("Non ci sono canidi nella banca dati");
        } else {
            System.out.println("Elenco canidi registrati:");
            for (Canide canide : elencocanide) {
                System.out.println(canide.getnumc() + " - " + canide.getnomec());

            }
        }
        if (elencoanfibi.isEmpty()) {
            System.out.println("Non ci sono anifibi nella banca dati");
        } else {
            System.out.println("Elenco anfibi registrati:");
            for (Anfibi anfibi : elencoanfibi) {
                System.out.println(anfibi.getnomea() + " - " + anfibi.getnuma());

            }
        }
    }
    
}
