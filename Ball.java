
/**
 * Beschreiben Sie hier die Klasse Ball.
 * 
 * @author Maximilian Reithmayer 
 * @version 2017-12-11
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

    public double aufpumpen(double fuellmenge){
        if(fuellmenge < 0){
            System.out.println("Kein negativer Wert erlaubt");
            return fuellmenge;
        }
        double kontrolle = aktFuellmenge + fuellmenge;
        if(kontrolle > maxFuellmenge){
            aktFuellmenge = maxFuellmenge; 
            System.out.println("Vorsicht, Ball aufgepumpt");  
        } else {
            aktFuellmenge = kontrolle;
        }
        
        if(aktFuellmenge < maxFuellmenge){
            return fuellmenge;
        } else {
            double speicher = fuellmenge - (kontrolle - maxFuellmenge);
            return speicher;
        }
    }

    public void luftRausLassen(double menge){
        if (menge < 0){
            System.out.println("Negativer Wert nicht zulässig!");
            return;
        }
        double kontrolle = aktFuellmenge - menge;
        if(kontrolle < 0.0){
            aktFuellmenge = 0.0;
        } else {
            aktFuellmenge = kontrolle;
        }
    }

    public double getLuftdruckInProzent(){
        return aktFuellmenge / maxFuellmenge;
    }

    public void druckeInfo(){
        
        System.out.println("Aktuelle Füllmenge: " + aktFuellmenge + ", Maximale Füllmenge : " + maxFuellmenge);
        System.out.printf("Luftdruck: %.2f %%%n", this.getLuftdruckInProzent()*100);
    }

}
