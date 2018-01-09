
/**
 * Beschreiben Sie hier die Klasse Notizbuch.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
import java.util.ArrayList;
public class Notizbuch 
{
    private ArrayList<String> notizen;

    public Notizbuch(){
        notizen = new ArrayList<>();
    }

    private boolean checkIndex(int index){
        return index >= 0 && index < this.anzahlNotizen();
    }
    
    public void hinzufügen(String notiz){
        notizen.add(notiz);
    }

    public int anzahlNotizen(){
        return notizen.size();
    }

    public void zeigeNotiz(int index){
        if(index < 0){
            System.out.println("Index darf nicht negativ sein!");
        } else if(index < this.anzahlNotizen()) {
            System.out.println(notizen.get(index));
        } else {
            System.out.println("Index zu groß");
        }

    }
    
    public String loescheNotiz(int index){
      if(this.checkIndex(index)){
            String zuLoeschendeNotiz = notizen.get(index);
            notizen.remove(index);
            return zuLoeschendeNotiz;
        } 
        return null;
    }
    
    public void alleNotizenAusgeben(){
        for(String notiz : notizen){
            System.out.println(notiz);
        }
    }
}
