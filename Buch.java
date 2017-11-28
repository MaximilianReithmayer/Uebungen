
/**
 * Beschreiben Sie hier die Klasse Buch.
 * 
 * @author Maximilian Reithmayer
 * @version 28.11.2017(eine Versionsnummer oder ein Datum)
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
        this();
        this.titel = titel;
    }

    public Buch(String titel, Seite seite0, Seite seite1, Seite seite2, Seite seite3){
        this.titel = titel;

        this.seite0 = seite0;
        this.seite1 = seite1;
        this.seite2 = seite2;
        this.seite3 = seite3;
    }

    public void setTitel(String titel){
        if (titel != null){
            this.titel = titel;
        }
    }

    public void setSeite0(Seite seite0){
        if (seite0 != null){
            this.seite0 = seite0;
        }
    }

    public void setSeite1(Seite seite1){
        if (seite1 != null){
            this.seite1 = seite1;
        }
    }

    public void setSeite2(Seite seite2){
        if (seite2 != null){
            this.seite2 = seite2;
        }
    }

    public void setSeite3(Seite seite3){
        if (seite3 != null){
            this.seite3 = seite3;
        }
    }

    public String getTitel(){
        return titel;
    }

    public Seite getSeite0(){
        return seite0;
    }

    public Seite getSeite1(){
        return seite1;
    }

    public Seite getSeite2(){
        return seite2;
    }

    public Seite getSeite3(){
        return seite3;
    }

    public void druckeBuch(){
        System.out.println(titel);
        seite0.druckeText();
        seite1.druckeText();
        seite2.druckeText();
        seite3.druckeText();
    }

}
