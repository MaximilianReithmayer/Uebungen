
/**
 * Beschreiben Sie hier die Klasse Seite.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Seite
{
    private String text;
    
    public Seite(){
        this.text = "-kein Text-";
    }
    
    public Seite(String text){
        this.text = text;
    }
    
    public void setText(String text){
        this.text = text;
    }
    
    public String getText(){
        return text;
    }
    
    public void druckeText(){
        System.out.println(text);
    }
}
