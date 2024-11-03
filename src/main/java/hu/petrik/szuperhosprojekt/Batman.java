package hu.petrik.szuperhosprojekt;

public class Batman implements Szuperhos,Milliardos {
    private float lelemenyesseg;

    public Batman() {
        this.lelemenyesseg = 100;
    }

    @Override
    public void kutyutKeszit() {
        this.lelemenyesseg += 50;
    }



    @Override
    public boolean legyoziE(Szuperhos ellenfel) {
       float szuperero = lelemenyesseg * 2;
       if(this.lelemenyesseg > ellenfel.mekkoraAzEreje())
       {
           return true;
       }
       else
       {
           return false ;
       }
    }

    @Override
    public double mekkoraAzEreje() {
        return this.lelemenyesseg * 2;
    }

    @Override
    public String toString() {
        return String.format("Batman: leleményesség: %d", Math.round(lelemenyesseg) );
    }
}
