
/**
 * Beschreiben Sie hier die Klasse Schulklasse.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
import java.util.ArrayList;
public class Schulklasse
{
    private String bezeichnung;
    private ArrayList<Schueler> schuelers;

    public Schulklasse(){
        this.bezeichnung = "-Keine Bezeichnung angegeben-";
        schuelers = new ArrayList<>();
    }

    public Schulklasse(String bezeichnung){
        this();
        this.bezeichnung = bezeichnung;

    }

    public String getBezeichnung(){
        return bezeichnung;
    }

    private boolean checkIndex(int index){
        if(index < 0 || index >= schuelers.size()){
            return false;
        }
        return true;
    }

    public boolean hinzufuegen(Schueler schueler){
        return schuelers.add(schueler);
    }
    
    public void zeigeSchueler(int index){
        if(checkIndex(index)){
            Schueler schueler = schuelers.get(index);
            schueler.druckeInfo();1011
        } else {
            System.out.println("index nicht im Bereich!");
        }
        
    }
    
    public void loescheSchueler(int index){
        if(this.checkIndex(index)){
            schuelers.remove(index);
        } else {
            System.out.println("Index nicht im Bereich!");
        }
    }
    
    public void alleNamenAusgeben(){
        for(Schueler schueler : schuelers){
            schueler.druckeInfo();
        }
    }
    
}
