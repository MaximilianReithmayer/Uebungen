
/**
 * Beschreiben Sie hier die Klasse Schueler.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Schueler
{
    private String name;
    private int alter;
    private Schueler mitSchueler;

    public Schueler(){
        this.name = "-Kein Name-";
        this.alter = -1;
        this.mitSchueler = null;
    }

    public Schueler(String name, int alter){
        this.setName(name);
        this.setAlter(alter);
        this.mitSchueler = null;
    }

    public String getName(){
        return name;
    }

    public int getAlter(){
        return alter;
    }

    public Schueler getMitSchueler(){
        return mitSchueler;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAlter(int alter){
        if (alter < 0){
            System.out.println("Alter darf nicht negativ sein!");
            return;
        } 
        this.alter = alter;
    }

    public void setMitSchueler(Schueler verweisSchueler){
        this.mitSchueler = verweisSchueler;
    }

    public void druckeInfo(){
        if(mitSchueler != null){
            System.out.println("Name: " + name + ", Alter: " + alter + "\nName des Mitschuelers: " + mitSchueler.getName());
        } else {
            System.out.println("Name: " + name + ", Alter: " + alter + "\nName des Mitschuelers nicht angegeben");
        }
    }
}
