package hu.petrik.szuperhosprojekt;

import java.util.Random;

public class Vasember extends Bosszuallo {

    Random rng = new Random();

    public Vasember() {
        super(150,true);

    }

    @Override
    public boolean megmentiAVilagot() {
        if(getSzuperero() > 1000)
        {
            return true;
        }
        else
        {
            return false;
        }
    }


    public void kutyutKeszit(){
        setSzuperero(getSzuperero() + rng.nextFloat(11));

    }

    @Override
    public String toString() {
        return "Vasember: " + super.toString();
    }
}
