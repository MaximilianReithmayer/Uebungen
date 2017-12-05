
/**
 * Beschreiben Sie hier die Klasse Ball.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Ball
{
    private double maxFuellmenge;
    private double aktFuellmenge;

    public Ball(double maxFuellmenge){
        this.maxFuellmenge = maxFuellmenge;
        aktFuellmenge = 0.0;
    }

    public double getMaxFuellmenge(){
        return maxFuellmenge;
    }

    public double getAktFuellmenge(){
        return aktFuellmenge;
    }

    public void aufpumpen(double fuellmenge){
        double kontrolle = aktFuellmenge + fuellmenge;
        if(kontrolle > maxFuellmenge){
            aktFuellmenge = maxFuellmenge; 
            System.out.println("Vorsicht, Ball aufgepumpt");
        } else {
            aktFuellmenge = kontrolle;
        }
    }

    public void luftRausLassen(double menge){
        double kontrolle = aktFuellmenge - menge;
        if(kontrolle < 0){
            aktFuellmenge = 0;
        } else {
            aktFuellmenge = kontrolle;
        }
    }

}
