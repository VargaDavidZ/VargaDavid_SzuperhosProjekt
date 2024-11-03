package hu.petrik.szuperhosprojekt;

import java.lang.reflect.Type;

public abstract class Bosszuallo implements Szuperhos  {



    private float szuperero;
    private boolean vanEGyengesege;

    public Bosszuallo(float szuperero, boolean vanEGyengesege) {
        this.szuperero = szuperero;
        this.vanEGyengesege = vanEGyengesege;
    }

    public float getSzuperero() {
        return szuperero;
    }

    public void setSzuperero(float szuperero) {
        this.szuperero = szuperero;
    }

    public boolean isVanEGyengesege() {
        return vanEGyengesege;
    }

    public void setVanEGyengesege(boolean vanEGyengesege) {
        this.vanEGyengesege = vanEGyengesege;
    }

    public abstract boolean megmentiAVilagot();

    @Override
    public boolean legyoziE(Szuperhos ellenfel) {

        if(ellenfel.getClass() == Batman.class)
        {
            if(ellenfel.mekkoraAzEreje() * 2 <= this.szuperero)
            {
                return true;
            }
                return false;
        }


        else if(this.szuperero > ellenfel.mekkoraAzEreje())
        {
            return true;
        }

            return false;

    }

    @Override
    public double mekkoraAzEreje() {
        return this.szuperero;
    }


    @Override
    public String toString() {
        if(vanEGyengesege)
        {
            return String.format("Szupererő: %d; van gyengesége",Math.round(this.szuperero) );
        }
        else
        {
            return String.format("Szupererő: %d; nincs gyengesége",Math.round(this.szuperero));
        }

    }
}
