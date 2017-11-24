
/**
 * Beschreiben Sie hier die Klasse Buch.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Buch
{
    private String titel;
    private Seite seite0;
    private Seite seite1;
    private Seite seite2;
    private Seite seite3;
    
    public Buch(){
        this.titel = "-kein Titel-";
        
        this.seite0 = new Seite();
        this.seite1 = new Seite();
        this.seite2 = new Seite();
        this.seite3 = new Seite();
    }
    
    public Buch(String titel){
        this.titel = titel;
        
        this.seite0 = new Seite();
        this.seite1 = new Seite();
        this.seite2 = new Seite();
        this.seite3 = new Seite();
    }
    
    public Buch(String titel, Seite seite0, Seite seite1, Seite seite2, Seite seite3){
        this.titel = "-kein Titel-";
        
        this.seite0 = new Seite(text);
        this.seite1 = new Seite(String);
        this.seite2 = new Seite(String);
        this.seite3 = new Seite(String);
    }
}
