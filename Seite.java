
/**
 * Beschreiben Sie hier die Klasse Seite.
 * 
 * @author Maximilian Reithmayer
 * @version 28.11.2017
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
        if (text != null){
            this.text = text;
        }
    }
    
    public String getText(){
        return text;
    }
    
    public void druckeText(){
        System.out.println(text);
    }
}
