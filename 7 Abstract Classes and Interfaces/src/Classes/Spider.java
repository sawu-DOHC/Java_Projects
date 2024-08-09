package Classes;

import Interfaces.Attack;

public class Spider extends Insect implements Attack {
    // attributes
    private boolean isVenomous;

    // constructors
    public Spider () {}
    public Spider ( String new_name, int new_age, String new_species, int new_numberOfLegs, boolean new_hasWings, boolean new_isVenomous ) {
        super( new_name, new_age, new_species, new_numberOfLegs, new_hasWings );
        this.isVenomous = new_isVenomous;
    }

    // accessors
    public boolean getIsVenomous () {
        return isVenomous;
    }

    // mutators
    public void setIsVenomous ( boolean new_isVenomous ) {
        this.isVenomous = new_isVenomous;
    }

    // other methods
    public String makeWeb () {
        return "makes a web";
    }

    // interface methods
    @Override
    public String attack () {
        return "bites you";
    }
    @Override
    public String eat () {
        return "eating insects";
    }
}
